package com.agrojas.model;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.agrojas.exception.InvalidDateException;
import com.agrojas.exception.InvalidDescriptionException;
import com.agrojas.exception.InvalidNameException;
import com.agrojas.exception.InvalidPriceException;
import com.agrojas.exception.InvalidRankingException;
import com.fasterxml.jackson.annotation.JsonFormat;

public class Menu {

	private String name;
	private String description;
	private List<String> days;
	private Price price;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dateFrom;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dateTo;
	private Time timeFrom;
	private Time timeTo;
	private int ranking;

	public Menu() {
		this.name = "";
		this.description = "";
		this.price = null;
		this.days = null;
		this.dateFrom = null;
		this.dateTo= null;
		this.timeFrom = null;
		this.timeTo = null;
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
	 * @param from
	 *            the from to set
	 */
	public void setDateFrom(String from) throws InvalidDateException {
		if (from == null) {
			throw new InvalidDateException();
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			this.dateFrom = (Date) sdf.parse(from);
		} catch (ParseException ex) {
			throw new InvalidDateException();
		}

	}

	
	/**
	 * @param to
	 *            the to to set
	 */
	public void setDateTo(String to) throws InvalidDateException {
		if (to == null) {
			throw new InvalidDateException();
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			this.dateTo = sdf.parse(to);
		} catch (ParseException ex) {
			throw new InvalidDateException();
		}
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
	
	/**
	 * @return the dateFrom
	 */
	public Date getDateFrom() {
		return dateFrom;
	}

	/**
	 * @param dateFrom the dateFrom to set
	 */
	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	/**
	 * @return the dateTo
	 */
	public Date getDateTo() {
		return dateTo;
	}

	/**
	 * @param dateTo the dateTo to set
	 */
	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	/**
	 * @return the timeFrom
	 */
	public Time getTimeFrom() {
		return timeFrom;
	}

	/**
	 * @param timeFrom the timeFrom to set
	 */
	public void setTimeFrom(String hour) {
		this.timeFrom = Time.valueOf(hour);
	}

	/**
	 * @return the timeTo
	 */
	public Time getTimeTo() {
		return timeTo;
	}

	/**
	 * @param timeTo the timeTo to set
	 */
	public void setTimeTo(String timeTo) {
		this.timeTo = Time.valueOf(timeTo);
	}

	/**
	 * @return the days
	 */
	public List<String> getDays() {
		return days;
	}

	/**
	 * @param days the days to set
	 */
	public void setDays(List<String> days) {
		this.days = days;
	}

}
