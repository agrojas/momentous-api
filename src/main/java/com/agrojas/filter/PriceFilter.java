package com.agrojas.filter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.agrojas.model.Menu;

public class PriceFilter implements IFilterable{

	/* (non-Javadoc)
	 * @see com.agrojas.filter.IFilterable#filter(java.util.List)
	 */
	@Override
	public List<Object> filter(List<Menu> list) {
		Map<Double, List<Menu>> map = new HashMap<>();
		for (Menu menu : list) {
			Double key  = menu.getPrice().getValue();
		    if(map.containsKey(key)){
		        List<Menu> menuList = map.get(key);
		        menuList.add(menu);
		    }else{
		        List<Menu> menuList = new ArrayList<Menu>();
		        menuList.add(menu);
		        map.put(key, menuList);
		    }
		}
		
		return new ArrayList<Object>(map.values());
	}

}
