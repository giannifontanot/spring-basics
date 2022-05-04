package com.in28minutes.spring.basics.springin5steps;

public class BinarySearchImpl   {

    InterfaceAlgorithm interfaceAlgorithm;

    public BinarySearchImpl(InterfaceAlgorithm interfaceAlgorithm) {
        this.interfaceAlgorithm = interfaceAlgorithm;
    }

    public int binarySearch(int[] array, int numberToFind) {
        int[] sorted = {};
        sorted = interfaceAlgorithm.sort(array);
        int found = interfaceAlgorithm.find(sorted, numberToFind);
        return found;
    }

}
