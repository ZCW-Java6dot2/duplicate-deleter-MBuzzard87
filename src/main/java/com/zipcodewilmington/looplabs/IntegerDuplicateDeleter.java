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
    private Integer[] intArr;

    public IntegerDuplicateDeleter(Integer[] intArr) {
        super(intArr);
        this.intArr = intArr;
    }


    public Integer[] countIntArr() {
        Integer[] counter = new Integer[intArr.length];

        for (int j = 0; j < intArr.length; j++) {
            counter[j] = 0;
        }

        for (int i = 0; i < counter.length; i++) {
            for (int j = 0; j < counter.length; j++) {
                if (intArr[i] == intArr[j]) {
                    counter[i]++;
                }
            }
        }
        return counter;
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        int incrementArr = 0;
        int arrSize = 0;
        Integer[] counter = countIntArr();
        for (int i = 0; i < intArr.length; i++) {
            if (counter[i] < maxNumberOfDuplications) {
                arrSize++;
            }
        }
        Integer[] newIntArr = new Integer[arrSize];
        for (int j = 0;j < intArr.length; j++) {
            if (counter[j] < maxNumberOfDuplications) {

                newIntArr[incrementArr] = intArr[j];
                incrementArr++;
            }
        }
        return newIntArr;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int incrementArr = 0;
        int arrSize = 0;
        Integer[] counter = countIntArr();
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] != exactNumberOfDuplications) {
                arrSize++;
            }
        }
        Integer[] newIntArr = new Integer[arrSize];
        for (int j = 0;j < intArr.length; j++) {
            if (counter[j] != exactNumberOfDuplications) {

                newIntArr[incrementArr] = intArr[j];
                incrementArr++;
            }
        }
        return newIntArr;
    }


}
