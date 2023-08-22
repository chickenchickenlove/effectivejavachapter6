package com.example.effetivejavachapter6.item55;

import javax.swing.text.html.Option;
import java.util.*;

public class OptionalClass <E>{


    // 반환할 값이 없을 때 예외를 던지는 경우 → BadCase
    public static <E extends Comparable<E>> E max(Collection<E> c ) {
        if (c.isEmpty()) {
            throw new IllegalArgumentException("빈 컬렉션");
        }

        E result = null;
        for (E e : c) {
            if (result == null || e.compareTo(result) > 0) {
                result = Objects.requireNonNull(e);
            }
        }
        return result;
    }

    // 반환할 값이 없을 때 Optional을 던지는 경우 → Better Case
    public static <E extends Comparable<E>> Optional<E> maxOptional(Collection<E> c ) {
        if (c.isEmpty()) {
            return Optional.empty();
        }

        E result = null;
        for (E e : c) {
            if (result == null || e.compareTo(result) > 0) {
                result = Objects.requireNonNull(e);
            }
        }
        return Optional.of(result);
    }

    public static void main(String[] args) {
        Optional<Integer> integer = maxOptional(List.of(1, 2, 3, 4));

        // 있다고 확신하는 경우
        Integer integer3 = integer.get();

        // 기본값 설정
        Integer integer1 = integer.orElseGet(() -> 1);
        Integer integer2 = integer.orElse(1);

        // 없는 경우 예외를 던짐.
        Integer integer4 = integer.orElseThrow();


        System.out.println("integer의 값은 얼마인가요 : " + (integer.isPresent() ? integer.get() : -999999));
        System.out.println("integer의 값은 얼마인가요 : " + integer.orElse(-999999));

        Optional.empty();


        List<Optional<Integer>> list = new ArrayList<>();

        List<Integer> integerList = list.stream()
                .filter(Optional::isPresent)
                .map(Optional::get)
                .toList();

        List<Optional<Integer>> isGood = new ArrayList<>();
        for (Optional<Integer> i : isGood) {
            Integer integer5 = i.orElse(1);
            System.out.println(integer5);
        }

        Map<String, Optional<String>> badMap = new HashMap<>();
        badMap.get("hello").orElseGet(() -> "ABC");


        OptionalInt optionalInt = OptionalInt.of(1);


    }
}
