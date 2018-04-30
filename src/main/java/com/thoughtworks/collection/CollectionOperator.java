package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> list = new ArrayList<>();
        if (left < right) {
            for (int i = left; i < right + 1; i++) {
                list.add(i);
            }
        } else {
            for (int j = left; j > right - 1; j--) {
                list.add(j);
            }
        }
        return list;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> list = new ArrayList<>();
        if (left < right) {
            for (int i = left; i < right + 1; i++) {
                if (i % 2 == 0) {
                    list.add(i);
                }
            }
        } else {
            for (int j = left; j > right - 1; j--) {
                if (j % 2 == 0) {
                    list.add(j);
                }
            }
        }
        return list;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                list.add(array[i]);
            }
        }
        return list;
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < firstArray.length; j++) {
                if (secondArray[i] == firstArray[j]) {
                    list.add(firstArray[j]);
                }
            }
        }
        return list;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < firstArray.length; i++) {
            if (!list.contains(firstArray[i])) {
                list.add(firstArray[i]);
            }
        }
        for (int j = 0; j < secondArray.length; j++) {
            if (!list.contains(secondArray[j])) {
                list.add(secondArray[j]);
            }
        }
        return list;
    }
}
