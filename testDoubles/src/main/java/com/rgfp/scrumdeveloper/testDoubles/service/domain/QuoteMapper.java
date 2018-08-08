package com.rgfp.scrumdeveloper.testDoubles.service.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuoteMapper {

    private String type;
    private ValueMapper value;

    public QuoteMapper() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ValueMapper getValue() {
        return value;
    }

    public void setValue(ValueMapper value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}