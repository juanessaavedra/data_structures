package generics.tutorial;

public class Main {
    public static void main(String[] args) {
        //Caja de strings
        Caja<String> cajaDeStrings = new Caja<>();
        cajaDeStrings.ponerAlgo("Hola Mundo");
        String contenido = cajaDeStrings.sacarAlgo();
        System.out.println("El contenido de la caja de String es:" + contenido);

        //Caja de enteros
        Caja<Integer> cajaDeEnteros = new Caja<>();
        cajaDeEnteros.ponerAlgo(10);
        Integer numero = cajaDeEnteros.sacarAlgo();
        System.out.println("El contenido de la caja de Integer es:" + numero);
    }
}
