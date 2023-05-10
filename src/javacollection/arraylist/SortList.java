package javacollection.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

    public static void main(String[] args) {
  /*      // create list

        List<Integer> list  = new ArrayList<Integer>();
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(20);
        list.add(50);


        Collections.sort(list);//ascending order
        System.out.println(list);

        Collections.reverse(list);//decending order
        System.out.println(list);*/


        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1,"Ramesh",24,40000));
        employees.add(new Employee(2,"Ram",28,30000));
        employees.add(new Employee(3,"suresh",26,20000));
        employees.add(new Employee(4,"himesh",29,45000));
        employees.add(new Employee(5,"kalesh",22,49000));



    }
    class Mysort implements Comparable<Employee>{

    }

}
