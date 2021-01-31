
package com.works.tokenactuator.entities.product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Filter {

    private Object q;
    private String so;
    private Object category;
    private Object brand;
    private Object supplier;
    private Price price;
    private Object attribute;
    private Object filter;
    private List<Object> includeProductId = null;
    private List<Object> excludeProductId = null;
    private Boolean stock;
    private Boolean disallowGroup;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Object getQ() {
        return q;
    }

    public void setQ(Object q) {
        this.q = q;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public Object getCategory() {
        return category;
    }

    public void setCategory(Object category) {
        this.category = category;
    }

    public Object getBrand() {
        return brand;
    }

    public void setBrand(Object brand) {
        this.brand = brand;
    }

    public Object getSupplier() {
        return supplier;
    }

    public void setSupplier(Object supplier) {
        this.supplier = supplier;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Object getAttribute() {
        return attribute;
    }

    public void setAttribute(Object attribute) {
        this.attribute = attribute;
    }

    public Object getFilter() {
        return filter;
    }

    public void setFilter(Object filter) {
        this.filter = filter;
    }

    public List<Object> getIncludeProductId() {
        return includeProductId;
    }

    public void setIncludeProductId(List<Object> includeProductId) {
        this.includeProductId = includeProductId;
    }

    public List<Object> getExcludeProductId() {
        return excludeProductId;
    }

    public void setExcludeProductId(List<Object> excludeProductId) {
        this.excludeProductId = excludeProductId;
    }

    public Boolean getStock() {
        return stock;
    }

    public void setStock(Boolean stock) {
        this.stock = stock;
    }

    public Boolean getDisallowGroup() {
        return disallowGroup;
    }

    public void setDisallowGroup(Boolean disallowGroup) {
        this.disallowGroup = disallowGroup;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
