package com.retailer.rest.model;

public class Transaction {

    public Transaction() {

    }

    
    public Transaction(Integer custId, String itemIds, Integer transactionValue, Integer month, Integer year) {
		super();
		this.custId = custId;
		this.itemIds = itemIds;
		this.transactionValue = transactionValue;
		this.month = month;
		this.year = year;
	}

	private Integer custId;
    private String itemIds;
    private Integer transactionValue;
    private Integer month;
    private Integer year;
    
    
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public String getItemIds() {
		return itemIds;
	}
	public void setItemIds(String itemIds) {
		this.itemIds = itemIds;
	}
	public Integer getTransactionValue() {
		return transactionValue;
	}
	public void setTransactionValue(Integer transactionValue) {
		this.transactionValue = transactionValue;
	}
	public Integer getMonth() {
		return month;
	}
	public void setMonth(Integer month) {
		this.month = month;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Transaction [custId=" + custId + ", itemIds=" + itemIds + ", transactionValue=" + transactionValue
				+ ", month=" + month + ", year=" + year + "]";
	}

}
