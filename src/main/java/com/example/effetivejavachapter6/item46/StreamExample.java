package com.example.effetivejavachapter6.item46;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExample {


    public static void test1() {

        final User user1 = new User("John1", 1000, Position.STAFF);
        final User user2 = new User("John2", 2000, Position.STAFF);
        final User user3 = new User("John3", 3000, Position.CEO);
        final User user4 = new User("John4", 4000, Position.MANAGER);

        final List<User> users = List.of(user1, user2, user3, user4);

        // 숫자 관련 연산
        Long count = users.stream().collect(Collectors.counting()); // stream의 원소 갯수를 세는 것임. size()로 대체 가능. 혹은 그냥 count 해도 됨.
        System.out.printf("Count %d \n", count);

        Double avgInt = users.stream().collect(Collectors.averagingInt(User::getSalary));
        System.out.printf("avgInt %f \n", avgInt);

        IntSummaryStatistics summary = users.stream().collect(Collectors.summarizingInt(User::getSalary));
        System.out.printf("summary %s \n", summary);

        // 문자열 연산
        String joinName1 = users.stream().map(User::getName).collect(Collectors.joining());
        System.out.printf("joinName1 %s \n", joinName1);

        String joinName2 = users.stream().map(User::getName).collect(Collectors.joining(", "));
        System.out.printf("joinName2 %s \n", joinName2);

        // 최대값, 최소값
        Comparator<User> userComparator = Comparator.comparingInt(user -> ((User) user).getSalary());
        Optional<User> maxCount = users.stream().collect(Collectors.maxBy(userComparator));
        System.out.printf("maxCount %d \n", maxCount.get().getSalary());

        Optional<User> minCount = users.stream().collect(Collectors.minBy(userComparator));
        System.out.printf("minCount %d \n", minCount.get().getSalary());

        // Reducing
        // Mapper를 쓰면 map을 안해도 됨.
        Function<User, Integer> mapper = user -> user.getSalary();
        Integer reduced = users.stream().collect(Collectors.reducing(0, mapper, (integer, integer2) -> integer + integer2));
        System.out.printf("reducing Result %d \n", reduced);

        // Mapper를 안 쓰면 map을 해야함.
        Integer reduced2 = users.stream().map(user -> user.getSalary()).collect(Collectors.reducing(0, (o, o2) -> o + o2));
        System.out.printf("reducing Result %d \n", reduced2);
    }

    public static void test2() {

        final User user1 = new User("John1", 1000, Position.STAFF);
        final User user2 = new User("John2", 2000, Position.STAFF);
        final User user3 = new User("John3", 3000, Position.CEO);
        final User user4 = new User("John4", 4000, Position.MANAGER);

        final List<User> users = List.of(user1, user2, user3, user4);


        // GroupingBy 자체는 Map을 만듦.
        // Classifier : 어떤 것으로 분류할지 결정.
        // MapFactory
        // Downstream
        Map<Position, List<User>> collect = users.stream().collect(Collectors.groupingBy(User::getPosition));
        System.out.println(collect);


        // 필터해서 모집하기.
        Map<Position, List<User>> collect1 = users.stream().collect(Collectors.
                groupingBy(User::getPosition, Collectors.filtering(user -> user.getSalary() > 100, Collectors.toList())));

        // 새로운 객체로 바꿔서 모집하기.
        Map<Position, List<Integer>> collect2 = users.stream().collect(Collectors.groupingBy(user -> user.getPosition(), Collectors.mapping(user -> user.getSalary(), Collectors.toList())));
        System.out.println(collect2);

        // 다단계 Grouping
        Map<Position, Map<String, List<User>>> collect3 = users.stream().collect(Collectors.groupingBy(user -> user.getPosition(),
                Collectors.groupingBy(user -> user.getName(), Collectors.toList())));

        System.out.println(collect3);


        // 분할하기
        Map<Boolean, List<User>> collect4 = users.stream().collect(Collectors.partitioningBy(user -> user.getPosition().equals(Position.CEO)));
        System.out.println(collect4);
    }



    public static void main(String[] args) {
        // test1();
        test2();
    }



}
