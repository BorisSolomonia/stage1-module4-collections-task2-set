package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> squares = new TreeSet<>();
        for (Integer z : sourceList) {
            Double n = Double.valueOf(z);
            Double k = Math.pow(n,2);
            Integer f = k.intValue();
            System.out.println(f);
            squares.add(f);
        }
        squares.subSet(lowerBound,upperBound);
        NavigableSet<Integer> squares1 = new TreeSet<>(squares.subSet(lowerBound,upperBound+1));
        return squares1;
    }
}
