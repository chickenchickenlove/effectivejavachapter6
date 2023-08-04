package com.example.effetivejavachapter6.item37;

import java.util.EnumMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum PhaseGood {
    SOLID, LIQUID, GAS;

    public enum TransitionGood {

        MELT(SOLID, LIQUID), FREEZE(LIQUID, SOLID), BOIL(LIQUID, GAS),
        CONDENSE(GAS, LIQUID), SUBLIME(SOLID, GAS), DEPOSIT(GAS, SOLID);

        PhaseGood from;
        PhaseGood to;

        TransitionGood(PhaseGood from, PhaseGood to) {
            this.from = from;
            this.to = to;
        }

        private static final EnumMap<PhaseGood, EnumMap<PhaseGood, TransitionGood>> m =
                Stream
                        .of(values())
                        .collect(
                                Collectors.groupingBy(t -> t.from,
                                                    () -> new EnumMap<>(PhaseGood.class),
                                Collectors.toMap(t -> t.to, t -> t,
                                (x, y) -> y, () -> new EnumMap<>(PhaseGood.class)
                                )));

        public static TransitionGood from(PhaseGood from, PhaseGood to) {
            return m.get(from).get(to);
        }
    }
}
