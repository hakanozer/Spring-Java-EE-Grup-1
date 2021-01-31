
package com.works.tokenactuator.entities;

import java.util.HashMap;
import java.util.Map;

public class Options {

    private Object token;
    private Boolean passwordHashed;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Object getToken() {
        return token;
    }

    public void setToken(Object token) {
        this.token = token;
    }

    public Boolean getPasswordHashed() {
        return passwordHashed;
    }

    public void setPasswordHashed(Boolean passwordHashed) {
        this.passwordHashed = passwordHashed;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
