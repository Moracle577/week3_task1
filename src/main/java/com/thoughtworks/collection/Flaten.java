package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i].length == 1) {
                list.add(this.array[i][0]);
            } else {
                for (int j = 0; j < this.array[i].length; j++) {
                    list.add(this.array[i][j]);
                }
            }
        }
        return list;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                if (!list.contains(this.array[i][j])) {
                    list.add(this.array[i][j]);
                }
            }
        }

        return list;
    }
}
