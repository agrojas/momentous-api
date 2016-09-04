package com.agrojas;

import static org.junit.Assert.*;

import org.junit.Test;

import com.agrojas.service.MenuService;

public class MenuServiceTest {

	@Test
	public void testMenuServiceIsEmpty() {
		MenuService menuService = new MenuService();
		assertEquals(menuService.getMenuList().size(), 0);
	}

	@Test
	public void testLoad() {
		MenuService menuService = new MenuService();
		menuService.load();
		assertEquals(menuService.getMenuList().size(), 10);
	}

	

}
