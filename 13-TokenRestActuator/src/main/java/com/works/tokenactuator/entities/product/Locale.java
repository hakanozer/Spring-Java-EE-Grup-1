
package com.works.tokenactuator.entities.product;

import java.util.HashMap;
import java.util.Map;

public class Locale {

    private Tr tr;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Tr getTr() {
        return tr;
    }

    public void setTr(Tr tr) {
        this.tr = tr;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
