package com.agrojas.model;

import java.sql.Date;
import java.sql.Timestamp;

public class Menu {
	
	private String name;
	private String description;
	private Price price;
	private Date from;
	private Date to;
	private Timestamp hour;
	private int ranking;
	
	public Menu(){
		
	}
	
	public Menu(String name, String description, Price price, Date from, 
				Date to, Timestamp hour, int ranking){
		this.name = name;
		this.description = description;
		this.price = price;
		this.from = from;
		this.to = to;
		this.hour = hour;
		this.ranking = ranking;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the price
	 */
	public Price getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Price price) {
		this.price = price;
	}

	/**
	 * @return the from
	 */
	public Date getFrom() {
		return from;
	}

	/**
	 * @param from the from to set
	 */
	public void setFrom(Date from) {
		this.from = from;
	}

	/**
	 * @return the to
	 */
	public Date getTo() {
		return to;
	}

	/**
	 * @param to the to to set
	 */
	public void setTo(Date to) {
		this.to = to;
	}

	/**
	 * @return the hour
	 */
	public Timestamp getHour() {
		return hour;
	}

	/**
	 * @param hour the hour to set
	 */
	public void setHour(Timestamp hour) {
		this.hour = hour;
	}

	/**
	 * @return the ranking
	 */
	public int getRanking() {
		return ranking;
	}

	/**
	 * @param ranking the ranking to set
	 */
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

}
