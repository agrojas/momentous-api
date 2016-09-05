package com.agrojas;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import com.agrojas.exception.InvalidNameException;
import com.agrojas.exception.InvalidPriceException;
import com.agrojas.model.Menu;
import com.agrojas.model.Price;

public class MenuTest {

	@Test
	public void testNewMenuNameIsEmpty() {
		Menu menuTest = new Menu(); 
		String empty = new String();
		assertEquals(menuTest.getName(),empty);
	}

	@Test
	public void testGetValidName() {
		Menu menuTest = new Menu(); 
		String name = "Menu 1";
		try {
			menuTest.setName(name);
		} catch (InvalidNameException e) {
			e.printStackTrace();
		}
		assertEquals(menuTest.getName(),name);
	}

	
	@Test(expected = InvalidNameException.class)  
	public void testSetInvalidName() throws InvalidNameException {
		Menu menuTest = new Menu(); 
		String name = "";
		menuTest.setName(name);
	}

	@Test
	public void testNewMenuGetPriceIsEmpty() {
		Menu menuTest = new Menu();
		assertNull(menuTest.getPrice());
	}

	@Test
	public void testSetValidPrice() {
		Menu menuTest = new Menu();
		Price price = new Price(10, "$");
		try {
			menuTest.setPrice(price);
		} catch (InvalidPriceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(menuTest.getPrice(), price);
	}

	@Test(expected = InvalidPriceException.class)  
	public void testSetInvalidPrice() throws InvalidPriceException {
		Menu menuTest = new Menu();
		Price price = new Price(-1, "$");
		menuTest.setPrice(price);
	}
	
	@Test
	public void testGetFrom() {
		Menu menuTest = new Menu();
		Date date = new Date();
		menuTest.setDateFrom(date);
		assertEquals(menuTest.getDateFrom(), date);
	}
//
//	@Test(expected = InvalidDateException.class)  
//	public void testSetInvalidFrom() throws InvalidDateException {
//		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
//		Date date = new Date();
//		Menu menuTest = new Menu();
//		menuTest.setFrom(dateFormat.format(date));
//	}
//
//	
//	@Test
//	public void testGetHour() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSetHour() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetRanking() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSetRanking() {
//		fail("Not yet implemented");
//	}


}
