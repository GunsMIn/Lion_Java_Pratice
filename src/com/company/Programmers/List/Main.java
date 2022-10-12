package com.company.Programmers.sort.online;

import java.util.LinkedList;

public class Main {

    //
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1,9);
        list.remove(2);

        System.out.println("list = " + list);
        System.out.println(list.get(0));
    }




}
