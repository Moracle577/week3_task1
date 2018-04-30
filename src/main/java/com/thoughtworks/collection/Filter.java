package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < this.array.size(); i++) {
            if (this.array.get(i) % 2 == 0) {
                list.add(this.array.get(i));
            }
        }
        return list;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < this.array.size(); i++) {
            if (this.array.get(i) % 3 == 0) {
                list.add(this.array.get(i));
            }
        }
        return list;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < firstList.size(); i++) {
            if (secondList.contains(firstList.get(i))) {
                list.add(firstList.get(i));
            }

        }
        return list;
    }

    public List<Integer> getDifferentElements() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < this.array.size(); i++) {
            if (!list.contains(this.array.get(i))) {
                list.add(this.array.get(i));
            }
        }
        return list;
    }
}