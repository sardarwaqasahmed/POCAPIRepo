package com.search.api.payload;

import java.util.ArrayList;
import java.util.List;

import com.search.api.model.Result;

/**
 * @author Waqas.Ahmed01
 * @Date Sep 23, 2018
 *
 */
public class DetailArticle {

	private String status;
	private String copyright;
	private int num_results;

	private List<Result> results;
	
	public DetailArticle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DetailArticle(String status, String copyright, int num_results) {
		super();
		this.status = status;
		this.copyright = copyright;
		this.num_results = num_results;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public int getNum_results() {
		return num_results;
	}

	public void setNum_results(int num_results) {
		this.num_results = num_results;
	}

	public List<Result> getResults() {
		if (null == this.results) {
			this.results = new ArrayList<>();
		}
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

}
