package dlinkedlist.circular;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaCircular lista = new ListaCircular();
        int opcion;

        do {
            System.out.println("1. Insertar número en la lista circular");
            System.out.println("2. Borrar número de la lista circular");
            System.out.println("3. Imprimir lista circular");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Digite el número a insertar: ");
                    int valor = sc.nextInt();
                    lista.insertarNodoInicio(valor);
                    break;
                case 2:
                    System.out.print("Digite la posición a eliminar: ");
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
