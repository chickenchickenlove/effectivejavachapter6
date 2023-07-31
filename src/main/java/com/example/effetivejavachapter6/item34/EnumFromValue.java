package com.example.effetivejavachapter6.item34;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum EnumFromValue {

    A, B, C, D;


    public static final Map<String, EnumFromValue> stringToEnum =
            Stream.of(values())
                    .collect(
                            Collectors.toMap(Enum::toString, e -> e)
                    );


    public static Optional<EnumFromValue> fromString(String symbol) {
        return Optional.ofNullable(stringToEnum.get(symbol));
    }

}
