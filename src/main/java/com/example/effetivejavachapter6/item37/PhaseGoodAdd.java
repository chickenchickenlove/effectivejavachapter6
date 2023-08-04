package com.example.effetivejavachapter6.item37;

import java.util.EnumMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum PhaseGoodAdd {
    SOLID, LIQUID, GAS, PLASMA;

    public enum TransitionGood {

        MELT(SOLID, LIQUID), FREEZE(LIQUID, SOLID), BOIL(LIQUID, GAS),
        CONDENSE(GAS, LIQUID), SUBLIME(SOLID, GAS), DEPOSIT(GAS, SOLID),
        IONIZED(GAS, PLASMA), DEIONIZED(PLASMA, GAS);

        PhaseGoodAdd from;
        PhaseGoodAdd to;

        TransitionGood(PhaseGoodAdd from, PhaseGoodAdd to) {
            this.from = from;
            this.to = to;
        }

        private static final EnumMap<PhaseGoodAdd, EnumMap<PhaseGoodAdd, TransitionGood>> m =
                Stream
                        .of(values())
                        .collect(
                                Collectors.groupingBy(t -> t.from,
                                                    () -> new EnumMap<>(PhaseGoodAdd.class),
                                Collectors.toMap(t -> t.to, t -> t,
                                (x, y) -> y, () -> new EnumMap<>(PhaseGoodAdd.class)
                                )));

        public static TransitionGood from(PhaseGoodAdd from, PhaseGoodAdd to) {
            return m.get(from).get(to);
        }
    }
}
