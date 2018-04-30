package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        if (leftBorder > rightBorder) {
            int temp = 0;
            temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        int s = 0;
        for (int i = leftBorder; i < rightBorder + 1; i++) {
            if (i % 2 == 0) {
                s += i;
            }
        }
        return s;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        if (leftBorder > rightBorder) {
            int temp = 0;
            temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        int s = 0;
        for (int i = leftBorder; i < rightBorder + 1; i++) {
            if (i % 2 == 1) {
                s += i;
            }
        }
        return s;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int s = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            s += arrayList.get(i) * 3 + 2;
        }
        return s;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 1) {
                arrayList.set(i, arrayList.get(i) * 3 + 2);
            }
        }
        return arrayList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int s = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 1) {
                s += arrayList.get(i) * 3 + 5;
            }
        }
        return s;
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                list.add(arrayList.get(i));
            }
        }
        if (list.size() % 2 == 0) {
            return (list.get(list.size() / 2-1) + list.get(list.size() / 2 )) / (double) 2;
        } else {
            return (double)list.get(list.size() / 2 );
        }
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        int s = 0;
        int n = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                s += arrayList.get(i);
                n++;
            }
        }
        return s/(double)n;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                list.add(arrayList.get(i));
            }
        }
        return list.contains(specialElment);
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0 && !list.contains(i)) {
                list.add(arrayList.get(i));
            }
        }
        return list;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> listEven = new ArrayList<>();
        List<Integer> listOdd = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                listEven.add(arrayList.get(i));
            } else {
                listOdd.add(arrayList.get(i));
            }
        }
        Collections.sort(listEven);
        Collections.sort(listOdd);
        for (int j = listOdd.size() - 1; j > -1; j--) {
            listEven.add(listOdd.get(j));
        }
        return listEven;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arrayList.size() - 1; i++) {
            list.add((arrayList.get(i) + arrayList.get(i + 1)) * 3);
        }
        return list;
    }
}
