package com.agrojas.service;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

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
	private Date getDate(int id) {
		return new Date(id);
	}
	
	/**
	 * @param id
	 * @return
	 */
	private Timestamp getTime(int id) {
		return new Timestamp(id);
	}
	
	/**
	 * @param id
	 * @return
	 */
	private int getRanking(int id) {
		return id;
	}
	
	
	public List<Menu> generate(int numMocks){
		Menu menu;
		List<Menu> mockList = new ArrayList<Menu>();
		for (int i = 0; i < numMocks; i++) {
			menu = new Menu(getName(i),getDescription(i),getPrice(i),getDate(i), 
					getDate(i), getTime(i), getRanking(i));
			mockList.add(menu);
		}
		return mockList;
	}
}
