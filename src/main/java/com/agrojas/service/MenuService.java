package com.agrojas.service;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agrojas.model.Menu;
import com.agrojas.model.Price;

/**
 * @author agu
 *
 */


@RestController
public class MenuService {
	@RequestMapping(value="/", method = RequestMethod.GET)
	public List<Menu> getMenus(){
		Menu menu = new Menu("menu","de",new Price(1,"$"),new Date(2313123), 
				new Date(2313123),  new Timestamp(12312), 1);
		List<Menu> result = new ArrayList<Menu>();
		result.add(menu);
		return result;
	}
}
