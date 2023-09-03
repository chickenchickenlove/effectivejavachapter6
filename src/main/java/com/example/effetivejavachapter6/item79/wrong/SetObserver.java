package com.example.effetivejavachapter6.item79.wrong;

@FunctionalInterface
public interface SetObserver<E>{
    void added(ObservablesSet<E> set, E element);

}
