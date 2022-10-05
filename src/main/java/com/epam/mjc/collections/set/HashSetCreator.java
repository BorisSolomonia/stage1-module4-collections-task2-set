package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> oddEven = new HashSet<>();
        for (Integer k : sourceList) {
            Integer n = k;
            while (n%2 == 0){
                oddEven.add(n);
                oddEven.add(n/2);
                n /= 2;
            }
            if(k %2 != 0){
                oddEven.add(k);
                oddEven.add(k * 2);
            }
        }
        return oddEven;
    }
}
