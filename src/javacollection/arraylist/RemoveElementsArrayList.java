package javacollection.arraylist;

import java.util.ArrayList;
import java.util.List;

/*remove()
* removeAll()
* clear()
**/
public class RemoveElementsArrayList {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("banana");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("orange");
        fruits.add("banana123.");
        fruits.add("apple123.");
        fruits.add("mango123.");
        fruits.add("orange123.");

        System.out.println(fruits);

//        remove() by the index method
        fruits.remove(1);
        System.out.println("after remove the elements for the list "+fruits);
//remove by elements
        fruits.remove("banana");
        System.out.println("after remove banana elements in list "+ fruits);

//        removeAll() multiple elements

        List<String> fruit = new ArrayList<>();


        fruit.add("banana123.");
        fruit.add("apple123.");
        fruit.add("mango123.");
        fruit.add("orange123.");
//removeAll() to remove the bulk list
        System.out.println(fruits.removeAll(fruit));
        System.out.println(fruits);

        fruits.clear();
        System.out.println(fruits);

    }

}
