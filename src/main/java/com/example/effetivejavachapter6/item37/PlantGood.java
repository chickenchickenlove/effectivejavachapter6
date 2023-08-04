package com.example.effetivejavachapter6.item37;

import com.example.effetivejavachapter6.item34.Planet;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PlantBad {

    enum LifeCycle{ ANNUAL, PERENNIAL, BIENNIAL;}

    final String name;
    final LifeCycle lifeCycle;

    public PlantBad(String name, LifeCycle lifeCycle) {
        this.name = name;
        this.lifeCycle = lifeCycle;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static void main(String[] args) {
        List<PlantBad> Garden = List.of(
                new PlantBad("Rose", LifeCycle.BIENNIAL),
                new PlantBad("Flower", LifeCycle.ANNUAL),
                new PlantBad("52", LifeCycle.PERENNIAL));

        // 배열을 1,2,3년 살이로 생애주기를 넣을 때
        // Set<Plant>[]
        Set<PlantBad>[] plantsByLifeCycle = (Set<PlantBad>[]) new Set[LifeCycle.values().length];
        //Object[] hello = plantsByLifeCycle;

        for (int i = 0; i < plantsByLifeCycle.length; i++) {
            plantsByLifeCycle[i] = new HashSet<>();
        }

        for (PlantBad plantBad : Garden) {
            plantsByLifeCycle[plantBad.lifeCycle.ordinal()].add(plantBad);
        }
    }
}
