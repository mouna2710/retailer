package com.retailer.rest;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.retailer.rest.model.Transaction;
import com.retailer.rest.service.RetailServiceImpl;



@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("test")
@SpringBootTest
public class SpringBootTransactionApplicationTests {
	@Autowired
	private RetailServiceImpl TransactionService;
	
private static List<Transaction> pointsDetail = new ArrayList<Transaction>();
    
    static 
    {
        pointsDetail.add(new Transaction(1,  "A,B", 150, 4, 2021));
        pointsDetail.add(new Transaction(2,  "C,D", 370, 6, 2021));
        pointsDetail.add(new Transaction(1,  "E,F", 580, 9, 2021));
    }
	
	@SuppressWarnings("deprecation")
	@Test
	public void TransactionTest() {
		Map<String, Integer> points = TransactionService.getRewardPoints(pointsDetail);
		Map<String, Integer> testPoints = new HashMap<String, Integer>();
		testPoints.put("4", 150);
		testPoints.put("6", 590);
		testPoints.put("9", 1010);
		testPoints.put("compPoints", 1750);
	    Assert.assertEquals(points, testPoints);
	 }

}
