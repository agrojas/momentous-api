package com.agrojas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.agrojas.service.MenuService;

/**
 * @author agu
 *
 */


@RestController
public class MenuController {
	
	@Autowired(required=false)
	private MenuService menuService;
	
	public MenuController() {
		this.menuService = new MenuService();
		this.menuService.load();
	}
	
	@RequestMapping(value="/menus", method = RequestMethod.GET)
	public Response getMenus(@RequestParam(value="groupBy", defaultValue="") String groupBy){
		Response response = this.menuService.getMenuListGroupBy(groupBy);		
		return response;
	}
	
	/*
	 * TODO: Implent other methods: POST,PUT,DELETE 
	 */
}
