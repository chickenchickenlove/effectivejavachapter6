package com.example.effetivejavachapter6.item46;

import lombok.Getter;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class ToMapExample {
    static enum Operation{
        A, B, C, D, E, F, G, H, I, J, K;
        public static final Map<String, Operation> stringToEnum =
                Stream.of(values())
                        .collect(toMap(Enum::name, operation -> operation));
    }

    @Getter
    static enum DuplicatedOperation{
        A("A"), a("A");
        public static final Map<String, DuplicatedOperation> stringToEnum =
                Stream.of(values()).collect(toMap(DuplicatedOperation::getSymbol, o -> o));

        public static final Map<String, DuplicatedOperation> stringToEnum1 =
                Stream.of(values()).collect(toMap(DuplicatedOperation::getSymbol, o -> o, (oldValue, newValue) -> newValue));

        private final String symbol;

        DuplicatedOperation(String symbol) {
            this.symbol = symbol;
        }
    }


    public static void main(String[] args) {
        System.out.println(Operation.stringToEnum);
        System.out.println(DuplicatedOperation.stringToEnum);
    }
}
