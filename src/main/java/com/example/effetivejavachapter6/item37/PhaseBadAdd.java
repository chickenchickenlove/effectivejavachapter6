package com.example.effetivejavachapter6.item37;

public enum PhaseBadAdd {
    SOLID, LIQUID, GAS, PLASMA;

    public enum TransitionBad {
        MELT, FREEZE, BOIL, CONDENSE, SUBLIME, DEPOSIT, IONIZE, DEIONIZE;

        private static final TransitionBad[][] TRANSITION_BADS = {
                {null, MELT, SUBLIME, null}, // Solid -> Solid, Solid -> Liquid, Solid -> Gas를 의미
                {FREEZE, null, BOIL, null},
                {DEPOSIT, CONDENSE, null, null},
                {null, null, IONIZE, DEIONIZE}
        };
    }

    public static TransitionBad from(PhaseBadAdd from, PhaseBadAdd to) {
        return TransitionBad.TRANSITION_BADS[from.ordinal()][to.ordinal()];
    }
}
