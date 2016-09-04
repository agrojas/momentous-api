package com.agrojas.filter;

import java.util.List;

import com.agrojas.model.Menu;

/**
 * @author agu
 *
 */

public interface IFilterable {
	
	/**
	 * @param list
	 * @return
	 */
	public List<Object> filter(List<Menu> list); 

}
