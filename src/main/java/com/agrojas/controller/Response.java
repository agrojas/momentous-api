package com.agrojas.controller;

import java.util.List;

public class Response {
	
	private String status;
	public List<Object> results;
	
	public Response() {
		
	}
	
	public Response(String status, List<Object> results) {
		this.status = status;
		this.results = results;
	}
	
	/**
	 * @return the results
	 */
	public List<Object> getResults() {
		return results;
	}

	/**
	 * @param results the results to set
	 */
	public void setResults(List<Object> results) {
		this.results = results;
	}

	
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	
}
