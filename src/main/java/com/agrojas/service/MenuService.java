package com.agrojas.service;

import java.util.ArrayList;
import java.util.List;

import com.agrojas.model.Menu;


/**
 * @author agu
 *
 */
public class MenuService {

	private List<Menu> menuList;
	
	public MenuService(){
		this.menuList = new ArrayList<Menu>();
	}
	
	/**
	 * Este servicio se deberia conectar a una base de datos para obtener los menues existentes
	 */
	public void load(){
		MenuMock mock = new MenuMock();
		int numMocks = 10;
		this.menuList = mock.generate(numMocks);
	}

	/**
	 * @return the menuList
	 */
	public List<Menu> getMenuList() {
		return menuList;
	}

	/**
	 * @param menuList the menuList to set
	 */
	public void setMenu(Menu menu) {
		this.menuList.add(menu);
	}

	/**
	 * @param groupBy
	 * @return
	 */
	public List<Menu> getMenuListGroupBy(String groupBy) {
		List<Menu> menuListGroupBy = new ArrayList<>();
//		ListIterator<Menu> menuListIterator = this.menuList.listIterator();
//		while (menuListIterator.hasNext()) {
//			if ()
//		}
		return menuListGroupBy;
	}
}
