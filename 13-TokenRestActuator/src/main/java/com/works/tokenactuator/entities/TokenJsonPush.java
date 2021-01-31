
package com.works.tokenactuator.entities;

import java.util.HashMap;
import java.util.Map;

public class TokenJsonPush {

    private String userName;
    private String password;
    private Options options;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
