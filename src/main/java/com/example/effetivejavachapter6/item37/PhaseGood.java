package com.example.effetivejavachapter6.item37;

import static com.example.effetivejavachapter6.item37.PhaseBad.TransitionBad.*;

public enum PhaseBad {
    SOLID, LIQUID, GAS;

    public enum TransitionBad {
        MELT, FREEZE, BOIL, CONDENSE, SUBLIME, DEPOSIT;

        private static final TransitionBad[][] TRANSITION_BADS = {
                {null, MELT, SUBLIME}, // Solid -> Solid, Solid -> Liquid, Solid -> Gas를 의미
                {FREEZE, null, BOIL},
                {DEPOSIT, CONDENSE, null},
        };
    }

    public static TransitionBad from(PhaseBad from, PhaseBad to) {
        return TransitionBad.TRANSITION_BADS[from.ordinal()][to.ordinal()];
    }
}
