package dcollections.list;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();

        //Add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");

        System.out.println("List of animals:" + animals );
        System.out.println("First element of list:" + animals.get(0));
        System.out.println("Lenght of list:" + animals.size());
        System.out.println("Verify if contains an element:" + animals.contains("Dog"));
        System.out.println("Find position of element" + animals.indexOf("Cat"));
        System.out.println("Remove element by index" + animals.remove(1));
        System.out.println("Remove element by name:" + animals.remove("Dog"));
        System.out.println("Remove all elements:");
        animals.clear();

        System.out.println("Verify if list is empty:" + animals.isEmpty());
        System.out.println("Final list of animals:" + animals);

    }
}
