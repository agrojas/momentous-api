package com.agrojas.service;

import java.util.ArrayList;
import java.util.List;

import com.agrojas.controller.Response;
import com.agrojas.exception.InvalidDataException;
import com.agrojas.filter.FilterFactory;
import com.agrojas.filter.IFilterable;
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
		try {
			this.menuList = mock.generate(numMocks);
		} catch (InvalidDataException e) {
			e.printStackTrace();
		}
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
	public Response getMenuListGroupBy(String groupBy) {
		IFilterable filter = FilterFactory.getFilter(groupBy);
		Response response = new Response();
		response.setStatus("SUCCESS");
		response.setResults(filter.filter(this.menuList));
		return response;
	}
}
