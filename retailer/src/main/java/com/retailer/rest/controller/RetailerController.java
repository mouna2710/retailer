package com.retailer.rest.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retailer.rest.model.Transaction;
import com.retailer.rest.service.RetailServiceImpl;

@RestController
@RequestMapping(path = "/rewardPoints")
public class RetailerController 
{
    @Autowired
    private RetailServiceImpl retailerService;
    
	
	  @PostMapping(path="/calculateRewardPoints", produces = "application/json")
	  public Map<String, Integer> calculateRewardPoints(@RequestBody List<Transaction> transactions) {
		  return retailerService.getRewardPoints(transactions); 
	  }
	 
    
	
}
