package com.example.effetivejavachapter6.item37;

import java.util.*;

public class PlantGood {

    enum LifeCycle{ ANNUAL, PERENNIAL, BIENNIAL;}

    final String name;
    final LifeCycle lifeCycle;

    public PlantGood(String name, LifeCycle lifeCycle) {
        this.name = name;
        this.lifeCycle = lifeCycle;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static void main(String[] args) {
        List<PlantGood> garden = List.of(
                new PlantGood("Rose", LifeCycle.BIENNIAL),
                new PlantGood("Flower", LifeCycle.ANNUAL),
                new PlantGood("52", LifeCycle.PERENNIAL));

        EnumMap<LifeCycle, HashSet<PlantGood>> plantsByLifeCycle = new EnumMap<>(LifeCycle.class);

        Arrays.asList(LifeCycle.values())
                .forEach(lifeCycle -> plantsByLifeCycle.put(lifeCycle, new HashSet<>()));

        garden.forEach(plantGood -> plantsByLifeCycle.get(plantGood.lifeCycle).add(plantGood));
    }
}
