package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl   {
    @Autowired
    private InterfaceAlgorithm interfaceAlgorithm;

    public void setInterfaceAlgorithm(InterfaceAlgorithm interfaceAlgorithm) {
        this.interfaceAlgorithm = interfaceAlgorithm;
    }

    public int binarySearch(int[] array, int numberToFind) {
        int[] sorted = {};
        sorted = interfaceAlgorithm.sort(array);
        int found = interfaceAlgorithm.find(sorted, numberToFind);
        return found;
    }

}
