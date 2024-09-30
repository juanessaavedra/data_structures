package tablas_hash;/*
import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {

        Hashtable<String, Double> balance = new Hashtable<>();

        // Agregamos los valores al mapa
        balance.put("Martin", 9999.99);
        balance.put("Marta", 11011.11);
        balance.put("Enzo", 8976.12);
        balance.put("Javier", 7707.55);
        balance.put("Ariel", 9190.90);

        // Obtenemos el conjunto de llaves como Enumeration
        Enumeration<String> nombres = balance.keys();

        // Iteramos usando el Enumeration
        while (nombres.hasMoreElements()) {
            String cdn = nombres.nextElement();
            SystemBook.out.println(cdn + ": " + balance.get(cdn));
        }

        SystemBook.out.println();

        // Actualizamos el balance de Martin
        double bal = balance.get("Martin");
        balance.put("Martin", bal + 1000);
        SystemBook.out.println("Nuevo balance de Martin: " + balance.get("Martin"));
    }


}*/
