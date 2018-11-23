package com.search.api.model;
/*
@ Author	: Sardar Waqas Ahmed
@ Date 		: 23 Sep 2018
@ Version	: 1.0
@ Company	: NONE
@
*/
public class ResultMin {

	private String title;    
    private String byline;
    private String published_date;
    private String id;
    private String asset_id;
    
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getByline() {
		return byline;
	}
	public void setByline(String byline) {
		this.byline = byline;
	}
	public String getPublished_date() {
		return published_date;
	}
	public void setPublished_date(String published_date) {
		this.published_date = published_date;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAsset_id() {
		return asset_id;
	}
	public void setAsset_id(String asset_id) {
		this.asset_id = asset_id;
	}
        
}
