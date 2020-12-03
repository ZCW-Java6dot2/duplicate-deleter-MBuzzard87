package com.zipcodewilmington.looplabs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    private Integer[] removeArr;

    public IntegerDuplicateDeleter(Integer[] intArr) {
        super(intArr);
        this.removeArr = intArr;
    }


    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        List<Integer> intList = new ArrayList<>();
        List<Integer> storeRemovedInt = new ArrayList<>();
        for (Integer addToList : removeArr) {
            intList.add(addToList);
        }
        for (Integer freqInt : intList) {
            if (Collections.frequency(intList,freqInt) >= maxNumberOfDuplications) {
                storeRemovedInt.add(freqInt);
            }
        }
        intList.removeAll(storeRemovedInt);
        Integer[] updatedArr = new Integer[intList.size()];
        intList.toArray(updatedArr);
        return updatedArr;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        List<Integer> intList = new ArrayList<>();
        List<Integer> storeRemovedInt = new ArrayList<>();
        for (Integer addToList : removeArr) {
            intList.add(addToList);
        }
        for (Integer freqInt : intList) {
            if (Collections.frequency(intList,freqInt) == exactNumberOfDuplications) {
                storeRemovedInt.add(freqInt);
            }
        }
        intList.removeAll(storeRemovedInt);
        Integer[] updatedArr = new Integer[intList.size()];
        intList.toArray(updatedArr);
        return updatedArr;
    }


}
