package week1.Day9;

import java.util.ArrayList;

public class C2ListManipulation {
    public static void main(String[] args) {
// Initi arraylist with string
        ArrayList<String> list = new ArrayList<>();
        list.add("Leo");
        list.add("Marta");
        list.add("Joe");
        //Add a new element to the end of the Arraylist
        list.add("Mark");

        //Remove an element
        list.remove("Marta");

        //Check if this element exists
        boolean exists = list.contains("Joe");

        //
        for (String element : list){
            System.out.println(element);
        }

    }

}
