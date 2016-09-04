package com.agrojas.filter;

import java.util.ArrayList;
import java.util.List;

import com.agrojas.model.Menu;

public class EmptyFilter implements IFilterable {

	/* (non-Javadoc)
	 * @see com.agrojas.filter.IFilterable#filter(java.util.List)
	 */
	@Override
	public List<Object> filter(List<Menu> list) {
		return new ArrayList<Object>(list);
	}

}
