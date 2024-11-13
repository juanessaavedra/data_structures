package dlinkedlist.circular.carrusel;

import dlinkedlist.circular.ListaCircular;

import java.util.Scanner;

/*
* Simular un carrusel de caballitos, donde este tiene 12 caballos y guarda el nombre de los
niños, donde no hay niño se coloca “vació”, si el puesto no está vació, no se debe permitir
colocar el niño.
* */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaCarrusel lista = new ListaCarrusel();
        int opcion;

        do {
            System.out.println("1. Insertar nombre del niño en el carrusel");
            System.out.println("2. Sacar niño del carrusel");
            System.out.println("3. Ver carrusel");
            System.out.println("4. Salir");
            System.out.print(" Elige una opción: ");
            opcion = sc.nextInt();
            

            switch (opcion) {
                case 1:
                    System.out.print("Digite el nombre del niño: ");
                    String nombre = sc.next();
                    System.out.print("Digite la posición (1-12): ");
                    int posAgregar = sc.nextInt();
                    lista.insertarNombreNiño(nombre, posAgregar);
                    break;
                case 2:
                    System.out.print("Digite la posición a eliminar (1-12): ");
                    int pos = sc.nextInt();
                    lista.borrarNodo(pos);
                    break;
                case 3:
                    lista.imprimirLista();
                    break;
                case 4:
                    lista.destruirLista();
                    System.out.println("Lista destruida y programa finalizado.");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 4);
    }
}
