/*
 * Main.java 05/08/2017
 *
 * Created by Bondarenko Oleh
 */


package com.boast.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List list = Random.getRandomList(15, 0, 100);

        System.out.println(list);

        System.out.print("Value = ");
        int value = in.nextInt();

        ArrayListEditor.separate(list, value);
        System.out.println(list);
    }
}

class ArrayListEditor {
    public static void separate(List list, int value) {
        int largerCount = 0;

        for(int i = 0; i < list.size() - largerCount; i++) {
            if ((int) list.get(i) > value) {
                list.add(list.get(i));
                list.remove(i);
                largerCount++;
                i--;
            }
        }
    }
}

class Random {
    static List getRandomList(int size, int minValue, int maxValue) {
        List list = new ArrayList();

        for (int i = 0; i < size; i++){
            list.add((int)(Math.random() * (maxValue - minValue) + minValue));
        }
        return list;
    }
}