package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    private String[] strArray;


    public StringDuplicateDeleter(String[] strArray) {
        super(strArray);
        this.strArray = strArray;
    }


    public Integer[] countStrArr() {
        Integer[] counter = new Integer[strArray.length];

        for (int j = 0; j < strArray.length; j++) {
            counter[j] = 0;
        }

        for (int i = 0; i < counter.length; i++) {
            for (int j = 0; j < counter.length; j++) {
                if (strArray[i].equals(strArray[j])) {
                    counter[i]++;
                }
            }
        }
        return counter;
    }


    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        int incrementArr = 0;
        int arrSize = 0;
        Integer[] counter = countStrArr();
        for (int i = 0; i < strArray.length; i++) {
            if (counter[i] < maxNumberOfDuplications) {
                arrSize++;
            }
        }
        String[] newStrArr = new String[arrSize];
        for (int j = 0;j < strArray.length; j++) {
            if (counter[j] < maxNumberOfDuplications) {

                newStrArr[incrementArr] = strArray[j];
                incrementArr++;
            }
        }
        return newStrArr;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int incrementArr = 0;
        int arrSize = 0;
        Integer[] counter = countStrArr();
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] != exactNumberOfDuplications) {
                arrSize++;
            }
        }
        String[] newStrArr = new String[arrSize];
        for (int j = 0;j < strArray.length; j++) {
            if (counter[j] != exactNumberOfDuplications) {

                newStrArr[incrementArr] = strArray[j];
                incrementArr++;
            }
        }
        return newStrArr;
    }


    //Missed the part about using collections, lists, etc
//    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
//        List<String> strList = new ArrayList<>();
//        List<String> storeRemovedStr = new ArrayList<>();
//        for (String addToList : strArray) {
//            strList.add(addToList);
//        }
//        for (String freqStr : strList) {
//            if (Collections.frequency(strList,freqStr) == exactNumberOfDuplications) {
//                storeRemovedStr.add(freqStr);
//            }
//        }
//        strList.removeAll(storeRemovedStr);
//        String[] updatedArr = new String[strList.size()];
//        strList.toArray(updatedArr);
//        return updatedArr;
//    }

}
