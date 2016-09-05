package com.agrojas.service;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.agrojas.exception.InvalidDateException;
import com.agrojas.exception.InvalidDescriptionException;
import com.agrojas.exception.InvalidNameException;
import com.agrojas.exception.InvalidPriceException;
import com.agrojas.exception.InvalidRankingException;
import com.agrojas.model.Menu;
import com.agrojas.model.Price;

public class MenuMock {
	
	/**
	 * @param id
	 * @return
	 */
	private String getName(int id) {
		return new String("Menu " + id);
	}
	
	/**
	 * @param id
	 * @return
	 */
	private String getDescription(int id) {
		return new String("Descripcion " + id);
	}
	
	/**
	 * @param id
	 * @return
	 */
	private Price getPrice(int id) {
		return new Price(id,"$");
	}
	
	/**
	 * @param id
	 * @return
	 */
	private String getFrom() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		return dateFormat.format(date);
	}

	/**
	 * @param id
	 * @return
	 */
	private String getTo(int num) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DATE, num);
		return dateFormat.format(cal.getTime());
	}
	
	/**
	 * @param id
	 * @return
	 */
	private String getTime() {
		Calendar calendar = Calendar.getInstance();
		return new Time(calendar.getTime().getTime()).toString();
	}
	
	/**
	 * @param id
	 * @return
	 */
	private int getRanking(int id) {
		return id % 5 + 1;
	}
	
	/**
	 * @return
	 */
	private List<String> getDays(int id) {
		String[] days = {"MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY"};
		List<String> result = new ArrayList<>();
		result.add(days[id%7]);
		return result;
	}
	
	public List<Menu> generate(int numMocks) throws InvalidNameException, InvalidDescriptionException,
			InvalidPriceException, InvalidDateException, InvalidRankingException{
		Menu menu;
		List<Menu> mockList = new ArrayList<Menu>();
		for (int i = 0; i < numMocks; i++) {
			menu = new Menu();
			menu.setId(i+1);
			menu.setName(getName(i));
			menu.setDescription(getDescription(i));
			menu.setPrice(getPrice(i));
			menu.setDays(getDays(i));
			menu.setDateFrom(getFrom());
			menu.setDateTo(getTo(i));
			menu.setTimeFrom(getTime());
			menu.setTimeTo(getTime());
			menu.setRanking(getRanking(i));
			mockList.add(menu);
		}
		return mockList;
	}


}
