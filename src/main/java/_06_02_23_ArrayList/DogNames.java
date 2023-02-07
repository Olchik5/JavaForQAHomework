package _06_02_23_ArrayList;

// Create your own ArrayList with the operations add and delete, find, print all elements
// Create your own class, use an array of any length as storage

import java.util.List;

public class DogNames {

    public static void main(String[] args) {

        List<String> list = new java.util.ArrayList<>();
        list.add("Juno");
        list.add("Rex");
        list.add("Bobik");
        list.add("Muhtar");
        list.add("Rada");

        System.out.println(list);

        list.add("Nensi");
        System.out.println(list);

        list.remove("Rex");
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        System.out.println(list.get(2));

        System.out.println(list);
    }
}
