package com.example.item44;

public class User {
    private final Parent parent;

    public User(Parent parent) {
        this.parent = parent;
    }

    public void doSomething() {
        parent.doSomething();
    }
}
