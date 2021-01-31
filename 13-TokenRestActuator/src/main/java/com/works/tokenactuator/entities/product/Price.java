
package com.works.tokenactuator.entities.product;

import java.util.HashMap;
import java.util.Map;

public class Price {

    private Object min;
    private Object max;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Object getMin() {
        return min;
    }

    public void setMin(Object min) {
        this.min = min;
    }

    public Object getMax() {
        return max;
    }

    public void setMax(Object max) {
        this.max = max;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
