package com.search.api.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Waqas.Ahmed01
 * @Date Sep 23, 2018
 *
 */
public class Facet {

    private List<String> facetList;

    public List<String> getFacetList() {
        if (null == this.facetList) {
            this.facetList = new ArrayList<>();
        }
        return facetList;
    }

    public void setFacetList(List<String> facetList) {
        this.facetList = facetList;
    }

}
