
package com.works.tokenactuator.entities.product;

import java.util.HashMap;
import java.util.Map;

public class ProductJsonPush {

    private Filter filter;
    private PageData pageData;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public PageData getPageData() {
        return pageData;
    }

    public void setPageData(PageData pageData) {
        this.pageData = pageData;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
