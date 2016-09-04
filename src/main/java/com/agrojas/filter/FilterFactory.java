package com.agrojas.filter;

public class FilterFactory {
	public static IFilterable getFilter(String field) {
		if (field.isEmpty()) {
			return new EmptyFilter();
		} else if (field.equals("ranking")) {
			return  new RankingFilter();
		} else if (field.equals("price")) {
			return new PriceFilter();
		} else {
			return null;
		}
	}
}
