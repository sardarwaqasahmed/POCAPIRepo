package com.search.api.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Waqas.Ahmed01
 * @Date Sep 23, 2018
 *
 */
public class Result {

    private String url;
    private String adx_keywords;
    private String column;
    private String section;
    private String byline;
    private String type;
    private String title;    
    private String abstractation;
    private String published_date;
    private String source;
    private String id;
    private String asset_id;
    private String views;

    private Object des_facet;
    private Object org_facet;
    private Object per_facet;
    private Object geo_facet;

    private List<Media> media;

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getByline() {
        return byline;
    }

    public void setByline(String byline) {
        this.byline = byline;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbstractation() {
        return abstractation;
    }

    public void setAbstractation(String abstractation) {
        this.abstractation = abstractation;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAdx_keywords() {
		return adx_keywords;
	}

	public void setAdx_keywords(String adx_keywords) {
		this.adx_keywords = adx_keywords;
	}

	public String getPublished_date() {
		return published_date;
	}

	public void setPublished_date(String published_date) {
		this.published_date = published_date;
	}

	public String getAsset_id() {
		return asset_id;
	}

	public void setAsset_id(String asset_id) {
		this.asset_id = asset_id;
	}

	public Object getDes_facet() {
		return des_facet;
	}

	public void setDes_facet(Object des_facet) {
		this.des_facet = des_facet;
	}

	public Object getOrg_facet() {
		return org_facet;
	}

	public void setOrg_facet(Object org_facet) {
		this.org_facet = org_facet;
	}

	public Object getPer_facet() {
		return per_facet;
	}

	public void setPer_facet(Object per_facet) {
		this.per_facet = per_facet;
	}

	public Object getGeo_facet() {
		return geo_facet;
	}

	public void setGeo_facet(Object geo_facet) {
		this.geo_facet = geo_facet;
	}

	public List<Media> getMedia() {
    	if(null == this.media ) {
    		this.media = new ArrayList<>();
    	}
        return media;
    }

    public void setMedia(List<Media> media) {
        this.media = media;
    }

}
