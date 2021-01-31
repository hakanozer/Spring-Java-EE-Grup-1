
package com.works.tokenactuator.entities.product;

import java.util.HashMap;
import java.util.Map;

public class LangCode {

    private Object urlkey;
    private Object label;
    private Object metaKeywords;
    private Object shortDetail;
    private Object detail;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Object getUrlkey() {
        return urlkey;
    }

    public void setUrlkey(Object urlkey) {
        this.urlkey = urlkey;
    }

    public Object getLabel() {
        return label;
    }

    public void setLabel(Object label) {
        this.label = label;
    }

    public Object getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(Object metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public Object getShortDetail() {
        return shortDetail;
    }

    public void setShortDetail(Object shortDetail) {
        this.shortDetail = shortDetail;
    }

    public Object getDetail() {
        return detail;
    }

    public void setDetail(Object detail) {
        this.detail = detail;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
