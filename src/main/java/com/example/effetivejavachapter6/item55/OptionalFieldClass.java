package com.example.effetivejavachapter6.item55;

import java.util.*;

public class OptionalFieldClass {

    private final String name;
    private final Optional<String> middleName;

    public OptionalFieldClass(String name, Optional<String> middleName) {
        this.name = name;
        this.middleName = middleName;
    }

    public String getFullName() {

        if (middleName.isPresent()) {
            return name + '-' + middleName.get();
        } else {
            return name;
        }
    }
}
