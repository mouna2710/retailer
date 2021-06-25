package com.retailer.rest.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.retailer.rest.model.Transaction;


@Service
public class RetailServiceImpl implements RetailService
{
	public Map<String, Integer> getRewardPoints(List<Transaction> transactions) {
		Map<String, Integer> result = new HashMap<String, Integer>();
		Set<Integer> monSet = new HashSet<Integer>();
		Integer compPoints = 0;
		
		transactions.stream().forEach(t-> monSet.add(t.getMonth()));
			
		for(Integer mon : monSet) {
			
			List<Transaction> filterList = transactions.stream().filter(t-> t.getMonth() ==  mon).collect(Collectors.toList());	
			Integer monthTransactAmount = 0;
			compPoints = calcRewardPoints(result, compPoints, mon, filterList, monthTransactAmount);
		}
		result.put("compPoints", compPoints);
		return result;
	}

	/**
	 * @param result
	 * @param compPoints
	 * @param month
	 * @param filterList
	 * @param monthTransactAmount
	 * @return
	 */
	private Integer calcRewardPoints(Map<String, Integer> result, Integer compPoints, Object month,
			List<Transaction> filterList, Integer monthTransactAmount) {
		for(Transaction t : filterList) {
			monthTransactAmount += t.getTransactionValue();
		}
		Integer monthRewardPoint = 0;
		if(monthTransactAmount > 100) {
			monthRewardPoint = (monthTransactAmount - 100)*2 + 50;
		}else if(monthTransactAmount > 50) {
			monthRewardPoint = (monthTransactAmount - 50);
		}
		result.put(month+"", monthRewardPoint);
		compPoints += monthRewardPoint;
		return compPoints;
	}

}
