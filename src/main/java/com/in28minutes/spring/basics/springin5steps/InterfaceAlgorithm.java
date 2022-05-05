package com.in28minutes.spring.basics.springin5steps;

import org.springframework.stereotype.Component;

@Component
public interface InterfaceAlgorithm {
    public int [] sort( int[] numbers);

    int find(int[] sorted, int numberToFind);
}

