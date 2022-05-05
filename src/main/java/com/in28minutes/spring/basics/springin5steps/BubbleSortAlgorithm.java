package com.in28minutes.spring.basics.springin5steps;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgorithm implements InterfaceAlgorithm {
    public int [] sort (int [] numbers){
        // Logic for Bubble Sort
        return numbers;
    }

    @Override
    public int find(int[] sorted, int numberToFind) {
        return 10;
    }
}
