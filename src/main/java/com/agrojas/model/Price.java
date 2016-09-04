package com.agrojas.model;

/**
 * @author agu
 *
 */

public class Price {
	
	private double value;
	private String currency;
	
	public Price(){
		
	}
	
	/**
	 * @param value
	 * @param currency
	 */
	public Price(double value, String currency){
		this.value = value;
		this.currency = currency;
	}
	
	/**
	 * @return
	 */
	public double getValue(){
		return this.value;
	}
	
	/**
	 * @return
	 */
	public String getCurrency(){
		return this.currency;
	}
	
	/**
	 * @param value
	 */
	public void setValue(double value){
		this.value = value;
	}
	
	
	/**
	 * @param currency
	 */
	public void setCurrency(String currency){
		this.currency = currency;
	}

	/**
	 * @return
	 */
	public boolean validate() {
		return (this.value < 0 || this.currency.isEmpty());
	}
	
}
