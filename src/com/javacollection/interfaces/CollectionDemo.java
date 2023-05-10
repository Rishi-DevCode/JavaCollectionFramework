package com.javacollection.interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> fruitCollection =new ArrayList<>();
        fruitCollection.add("Anuj");
        fruitCollection.add("banana");
        fruitCollection.add("apple");
        fruitCollection.add("orange ");

        fruitCollection.remove("banana");//to remove the element from the array list
        fruitCollection.contains("orange");//to show the is in list or not
        System.out.println(fruitCollection);

        fruitCollection.forEach((element) ->{
            System.out.println(element);
                });
        fruitCollection.clear();
        System.out.println(fruitCollection);
    }
}
