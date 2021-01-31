
package com.works.tokenactuator.entities.product;

import java.util.HashMap;
import java.util.Map;

public class PageData {

    private String start;
    private String length;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
