package com.rainbow.other.springlearn.ioc.factorybean;

import lombok.Data;

@Data
public class Child {

    private String wantToy = "ball";

    public String getWantToy() {
        return wantToy;
    }
}
