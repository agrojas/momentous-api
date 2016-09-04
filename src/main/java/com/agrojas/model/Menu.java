package com.agrojas.model;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.agrojas.exception.InvalidDateException;
import com.agrojas.exception.InvalidDescriptionException;
import com.agrojas.exception.InvalidNameException;
import com.agrojas.exception.InvalidPriceException;
import com.agrojas.exception.InvalidRankingException;
import com.fasterxml.jackson.annotation.JsonFormat;

public class Menu {

	private String name;
	private String description;
	private Price price;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date from;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date to;
	private Time hour;
	private int ranking;

	public Menu() {
		this.name = "";
		this.description = "";
		this.price = null;
		this.from = null;
		this.to= null;
		this.hour = null;
		this.ranking = 1;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 * @throws InvalidNameException
	 */
	public void setName(String name) throws InvalidNameException {
		if (name == null || name.isEmpty()) {
			throw new InvalidNameException();
		}
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 * @throws InvalidDescriptionException
	 */
	public void setDescription(String description) throws InvalidDescriptionException {
		if (description == null || description.isEmpty()) {
			throw new InvalidDescriptionException();
		}
		this.description = description;
	}

	/**
	 * @return the price
	 */
	public Price getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 * @throws InvalidPriceException
	 */
	public void setPrice(Price price) throws InvalidPriceException {
		if (price == null || price.validate()) {
			throw new InvalidPriceException();
		}
		this.price = price;
	}

	/**
	 * @return the from
	 */
	public Date getFrom() {
		return from;
	}

	/**
	 * @param from
	 */
	public void setFrom(Date from) {
		this.from = from;
	}
	
	/**
	 * @param from
	 *            the from to set
	 */
	public void setFrom(String from) throws InvalidDateException {
		if (from == null) {
			throw new InvalidDateException();
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			this.from = (Date) sdf.parse(from);
		} catch (ParseException ex) {
			throw new InvalidDateException();
		}

	}

	/**
	 * @return the to
	 */
	public Date getTo() {
		return to;
	}

	/**
	 * @param from
	 */
	public void setTo(Date to) {
		this.from = to;
	}
	
	/**
	 * @param to
	 *            the to to set
	 */
	public void setTo(String to) throws InvalidDateException {
		if (to == null) {
			throw new InvalidDateException();
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			this.to = sdf.parse(to);
		} catch (ParseException ex) {
			throw new InvalidDateException();
		}
	}

	/**
	 * @return the hour
	 */
	public Time getHour() {
		return hour;
	}

	/**
	 * @param hour
	 *            the hour to set
	 */
	public void setHour(String hour) {
		this.hour = Time.valueOf(hour);
	}

	/**
	 * @return the ranking
	 */
	public int getRanking() {
		return ranking;
	}

	/**
	 * @param ranking
	 *            the ranking to set
	 * @throws InvalidRankingException 
	 */
	public void setRanking(int ranking) throws InvalidRankingException {
		if (ranking < 1 || ranking > 5) {
			throw new InvalidRankingException();
		}
		this.ranking = ranking;
	}

}
