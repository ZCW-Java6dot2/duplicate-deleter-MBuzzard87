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

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        List<String> strList = new ArrayList<>();
        List<String> storeRemovedStr = new ArrayList<>();
        for (String addToList : strArray) {
            strList.add(addToList);
        }
        for (String freqStr : strList) {
            if (Collections.frequency(strList,freqStr) >= maxNumberOfDuplications) {
                storeRemovedStr.add(freqStr);
            }
        }
        strList.removeAll(storeRemovedStr);
        String[] updatedArr = new String[strList.size()];
        strList.toArray(updatedArr);
        return updatedArr;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        List<String> strList = new ArrayList<>();
        List<String> storeRemovedStr = new ArrayList<>();
        for (String addToList : strArray) {
            strList.add(addToList);
        }
        for (String freqStr : strList) {
            if (Collections.frequency(strList,freqStr) == exactNumberOfDuplications) {
                storeRemovedStr.add(freqStr);
            }
        }
        strList.removeAll(storeRemovedStr);
        String[] updatedArr = new String[strList.size()];
        strList.toArray(updatedArr);
        return updatedArr;
    }



}
