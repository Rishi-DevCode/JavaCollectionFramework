package com.java.collection;

public class NeedOfCollections {

  /*  int a= 10;
    int b= 10;
    int c= 10;*/
    int[] arr = new int[2];
    public static void main(String[] args) {
        /*Limitation of an array
         * 1. Arrays are fixed in size
         * 2. Arrays can hold only homogeneous data elements*/


        Student[] students = new Student[10];
        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student();
//        students[0] = new Book();

        Object[] objects = new Object[10];
        objects[0] = new Student();
        objects[0] = new Book();
        /*3.Ready mate APIs support is not available in array*/
    }

    }
class Book {

}

class Student {

}