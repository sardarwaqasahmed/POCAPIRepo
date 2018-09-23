package com.search.api.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Waqas.Ahmed01
 * @Date Sep 23, 2018
 *
 */
public class Media {

    private String type;
    private String subtype;
    private String caption;
    private String copyright;
    private String approved_for_syndication;

    @JsonProperty("media-metadata")
    private List<MetaData> mediaMataData;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getApproved_for_syndication() {
		return approved_for_syndication;
	}

	public void setApproved_for_syndication(String approved_for_syndication) {
		this.approved_for_syndication = approved_for_syndication;
	}

	public List<MetaData> getMediaMataData() {
        if (null == this.mediaMataData) {
            this.mediaMataData = new ArrayList<>();
        }
        return mediaMataData;
    }

    public void setMediaMataData(List<MetaData> mediaMataData) {
        this.mediaMataData = mediaMataData;
    }

}
