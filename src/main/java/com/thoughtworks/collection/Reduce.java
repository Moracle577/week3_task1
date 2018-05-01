package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collections;
import java.util.List;

public class Reduce implements SingleLink<Integer> {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        Collections.sort(this.arrayList);
        return this.arrayList.get(this.arrayList.size() - 1);
    }

    public double getMinimum() {
        Collections.sort(this.arrayList);
        return this.arrayList.get(0);
    }

    public double getAverage() {
        int total = 0;
        for (int i = 0; i < this.arrayList.size(); i++) {
            total += this.arrayList.get(i);
        }
        double ave = total / (double) this.arrayList.size();
        return ave;
    }

    public double getOrderedMedian() {
        Collections.sort(this.arrayList);
        double medium = 0;
        if (this.arrayList.size() % 2 == 0) {
            medium = (this.arrayList.get(this.arrayList.size() / 2)
                    + this.arrayList.get(this.arrayList.size() / 2 - 1)) / (double) 2;
        } else {
            medium = this.arrayList.get(this.arrayList.size() / 2);
        }
        return medium;

    }

    public int getFirstEven() {
        int firstEven = 0;
        for (int i = 0; i < this.arrayList.size(); i++) {
            if (this.arrayList.get(i) % 2 == 0) {
                firstEven = this.arrayList.get(i);
                break;
            }
        }
        return firstEven;
    }

    public int getIndexOfFirstEven() {
        int indexOfFirstEven = 0;
        for (int i = 0; i < this.arrayList.size(); i++) {
            if (this.arrayList.get(i) % 2 == 0) {
                indexOfFirstEven = i;
                break;
            }
        }
        return indexOfFirstEven;
    }

    public boolean isEqual(List<Integer> arrayList) {
        boolean flag = true;
        if (this.arrayList.size() == arrayList.size()) {
            for (int i = 0; i < this.arrayList.size(); i++) {
                if (!arrayList.contains(this.arrayList.get(i))) {
                    flag = false;
                    break;
                }
            }
            for (int j = 0; j < arrayList.size(); j++) {
                if (!this.arrayList.contains(arrayList.get(j))) {
                    flag = false;
                    break;
                }
            }
        } else {
            flag = false;
        }
        return flag;
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {
        this.arrayList.stream().sorted().mapToInt(num -> num).forEach(singleLink::addTailPointer);
        return (double)((int)singleLink.getNode(this.arrayList.size()/2)+
                (int)singleLink.getNode(this.arrayList.size()/2+1))/2;
    }

    public int getLastOdd() {
        int lastOdd = 0;
        for (int i = this.arrayList.size() - 1; i > -1; i--) {
            if (this.arrayList.get(i) % 2 == 1) {
                lastOdd = this.arrayList.get(i);
                break;
            }
        }
        return lastOdd;
    }

    public int getIndexOfLastOdd() {
        int indexOfLastOdd = 0;
        for (int i = this.arrayList.size() - 1; i > -1; i--) {
            if (this.arrayList.get(i) % 2 == 1) {
                indexOfLastOdd = i;
                break;
            }
        }
        return indexOfLastOdd;
    }

    @Override
    public Integer getHeaderData() {
        return this.arrayList.get(0);
    }

    @Override
    public Integer getTailData() {
        return this.arrayList.get(this.arrayList.size() - 1);
    }

    @Override
    public int size() {
        return this.arrayList.size();
    }

    @Override
    public boolean isEmpty() {
        return this.arrayList.isEmpty();
    }

    @Override
    public boolean deleteFirst() {
        Integer first = getHeaderData();
        return this.arrayList.remove(first);
    }

    @Override
    public boolean deleteLast() {
        Integer last = getTailData();
        return this.arrayList.remove(last);
    }

    @Override
    public void addHeadPointer(Integer item) {
        this.arrayList.add(0, item);

    }

    @Override
    public void addTailPointer(Integer item) {
        arrayList.add(item);
    }

    @Override
    public Integer getNode(int index) {
        return arrayList.get(index - 1);
    }
}