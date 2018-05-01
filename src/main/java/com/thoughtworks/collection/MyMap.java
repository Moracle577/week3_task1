package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < this.array.size(); i++) {
            list.add(this.array.get(i) * 3);
        }
        return list;
    }

    public List<String> mapLetter() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < this.array.size(); i++) {
            list.add(letters[this.array.get(i) - 1]);
        }
        return list;
    }

    public List<String> mapLetters() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < this.array.size(); i++) {
            String str = "";
            if ((this.array.get(i) - 1) / 26 == 0) {
                str += letters[this.array.get(i) - 1];
            } else {
                int res = (this.array.get(i) - 1) / 26;
                str += letters[res - 1];
                str += letters[this.array.get(i) - res * 26 - 1];

            }
            list.add(str);
        }
        return list;
    }

    public List<Integer> sortFromBig() {
        List<Integer> list = new ArrayList<>();
        Collections.sort(this.array);
        for (int i = this.array.size() - 1; i > -1; i--) {
            list.add(this.array.get(i));
        }
        return list;

    }

    public List<Integer> sortFromSmall() {
        Collections.sort(this.array);
        return this.array;

    }
}
