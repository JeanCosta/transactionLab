package com.transaction.lab.VO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * Created by jean on 3/17/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RemoteVO implements Serializable {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
