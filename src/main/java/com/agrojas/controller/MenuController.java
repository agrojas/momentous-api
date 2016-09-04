package com.agrojas.controller;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.agrojas.model.Menu;
import com.agrojas.service.MenuService;

/**
 * @author agu
 *
 */


@RestController
public class MenuController {
	
	private MenuService menuService;
	
	public MenuController() {
		this.menuService = new MenuService();
		this.menuService.load();
	}
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public List<Menu> getMenus(@RequestParam(value="groupBy", defaultValue="price") String groupBy){
		List<Menu> result = this.menuService.getMenuListGroupBy(groupBy);		
		return result;
	}
}
