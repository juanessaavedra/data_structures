//programa que ilustra las operaciones basicas de set
import java.util.*;
public class HashSetExample
{
    public static void main(String args[])
    {
        Set<String> vocales= new HashSet<>();

        //adicionar
        vocales.add("A");
        vocales.add("E");
        vocales.add("I");

        //No podemos insertar elementos basados en el indice de un conjunto
        System.out.println(vocales);

        Set<String> conjunto = new HashSet<>();
        conjunto.add("O");
        conjunto.add("U");

        //agregando un conjunto de elementos a vocales
        vocales.addAll(conjunto);
        System.out.println(vocales);

        //claro ejemplo para vaciar el conjunto
        conjunto.clear();

        //tamano del conjunto
        System.out.println("Tamano del conjunto vocales = " + vocales.size());

        vocales.clear();
        vocales.add("E"); vocales.add("E");vocales.add("I"); vocales.add("O");
        System.out.println("El conjunto dado contiene el elemento E o no? = " + vocales.contains("E"));
    }
}