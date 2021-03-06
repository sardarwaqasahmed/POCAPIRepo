package com.search.api.payload;

import java.util.ArrayList;
import java.util.List;

import com.search.api.model.ResultMin;

/**
 * @author Waqas.Ahmed01
 * @Date Sep 23, 2018
 *
 */
public class Article {

	private String status;
	private String copyright;
	private int num_results;

	private List<ResultMin> results;

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

	public List<ResultMin> getResults() {
		if (null == this.results) {
			this.results = new ArrayList<>();
		}
		return results;
	}

	public void setResults(List<ResultMin> results) {
		this.results = results;
	}

}
