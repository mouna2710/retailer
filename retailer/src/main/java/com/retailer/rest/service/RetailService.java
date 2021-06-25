package com.retailer.rest.service;

import java.util.List;
import java.util.Map;

import com.retailer.rest.model.Transaction;

public interface RetailService {

/* Looks up all [Challenge] associated with
 an interview identified by id and returns
 as a List.
*/
Map<String, Integer> getRewardPoints(List<Transaction> transactions);
}
