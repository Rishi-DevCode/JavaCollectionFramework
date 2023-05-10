package javacollection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListExample {
    /*
    * How to check if an ArrayList is empty using the isEmpty() method
    * How to find the size of an ArrayLIst using the size() method
    * How to access the element at a particular index in an ArrayList using the get() method
    * How to modify the element at a particular index in an ArrayList using the set() method
     */
    public static void main(String[] args) {

        List<String> topProgrammingLanguages = new ArrayList<>();

        System.out.println("Is the topProgrammingLanguages list empty? :"+ topProgrammingLanguages.isEmpty());

        topProgrammingLanguages.add("c");
        topProgrammingLanguages.add("Java");
        topProgrammingLanguages.add("C++");
        topProgrammingLanguages.add("Python");
        topProgrammingLanguages.add(".net");

        System.out.println("Is the topProgrammingLanguages list empty? :"+ topProgrammingLanguages.size()+"" +
                " Programming Languages in the world");

        // Retrieve the element at a given index
        String bestProgrammingLanguage = topProgrammingLanguages.get(1);
        System.out.println("bestProgrammingLang => " + bestProgrammingLanguage);

        System.out.println(topProgrammingLanguages.get(1));

        //modify method
          topProgrammingLanguages.set(4,"c#");
        System.out.println(topProgrammingLanguages);




    }

}
