package com.example.effetivejavachapter6.item46;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class User {
    private final String name;
    private final int salary;
    private final Position position;

}
