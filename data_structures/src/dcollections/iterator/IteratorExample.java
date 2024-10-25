package collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;

//Not compatible with CRUD
public class IteratorExample { //Tener un contenedor interno, pero va verificando si hay un siguiente elemento.
    public static void main(String[] args) {

        ArrayList<String> listNames = new ArrayList<String>();

        listNames.add("Juan");listNames.add("Juan");
        listNames.add("Pedro");
        listNames.add("Maria");

        Iterator<String> iterator = listNames.iterator(); //Create Iterator

        //Delete element
        while(iterator.hasNext()){ //While has the next element
            String name = iterator.next(); //Get the next element
            if(name.equals("Juan")){
                iterator.remove();
            }
        }

        //Print all elements
        Iterator<String> iterator2 = listNames.iterator();
        while(iterator2.hasNext()){ //While has the next element
            System.out.println(iterator2.next()); //Print the next element
        }
    }
}
