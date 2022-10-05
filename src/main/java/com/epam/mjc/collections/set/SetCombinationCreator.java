package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> oneTwo = firstSet;
        oneTwo.retainAll(secondSet);
        Set<String> thirdCopy = thirdSet;
        thirdCopy.removeAll(oneTwo);
        oneTwo.removeAll(thirdSet);
        //oneTwo.addAll(thirdCopy);
        return oneTwo;

    }
}
