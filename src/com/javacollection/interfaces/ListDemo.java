package com.javacollection.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
//        List allows you to add duplicate elements
   /*     list.add("element1");
        list.add("element1");
        list.add("element2");
        list.add("element2");
        System.out.println(list);
*/
//        List allows you to have null elements
      /*  list.add(null);
        list.add(null);
        System.out.println(list);*/

//       insertion order
        list.add("element1");//0
        list.add("element2");//1
        list.add("element3");//2
        list.add("element4");//3
        System.out.println(list);

//        access elements from list
        System.out.println(list.get(0));
        System.out.println(list.get(3));
        System.out.println(list.size()
        );

       List<Integer> list3= new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list3);


    }

}
