package com.company.day03;

import java.util.List;

public class ListExcerciseMain {

    public static void main(String[] args) {


        ListExcercise excercise = new ListExcercise();

        List<String> studentList = excercise.getStudents();


        for (String student : studentList) {
            System.out.println("student = " + student);
        }
        System.out.println("student count : " + studentList.size());

    }

}
