package com.example.effetivejavachapter6.item46;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

@Component
@RequiredArgsConstructor
public class BetterStreamUsage {

    private final ApplicationEventPublisher publisher;

    @RequiredArgsConstructor
    static class MyEvent{
        private final String eventName;
    }

    public void forEachShouldbeUsedLikedThis() {
        final String file = "data data2 data3 data4 data";
        try (Stream<String> words = new Scanner(file).tokens()) {
            words.collect(groupingBy(s -> s, counting()))
                    .forEach((key, value) -> publisher.publishEvent(new MyEvent(key)));
        }
    }



    // 순수함수만으로 Stream을 사용한 경우.
    public static void main(String[] args) {
        final String file = "data data2 data3 data4 data";

        final Map<String, Long> freq;
        try (Stream<String> words = new Scanner(file).tokens()) {
            freq = words.collect(groupingBy(s -> s, counting())); // stream에서 외부 객체(freq)의 상태를 변경하지 않음..
        }

        final List<String> topTen = freq.keySet().stream()
                .sorted(Comparator.comparing(freq::get).reversed())
                .limit(10)
                .collect(toList());

        System.out.println(topTen);
    }
}