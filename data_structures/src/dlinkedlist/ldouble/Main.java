package dlinkedlist.ldouble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader Teclado;
        Teclado= new BufferedReader(new InputStreamReader(System.in));
        int opc;
        ListaDobleEncadenada lista = new ListaDobleEncadenada();
        lista.iniciar_lista_doble_encadenada();
        do{
            System.out.println("1.Almacenar un Numero en la Lista Doblemente Encadenada");
            System.out.println("2.Borrar un Numero en la Lista Doblemente Encadenada mediante la Posicion");
            System.out.println("3.Imprimir Lista Doblemente Encadenada por la cabeza");
            System.out.println("4.Imprimir Lista Doblemente Encadenada por el fin");
            System.out.println("5.Salir");
            System.out.println("digite la opcion");
            opc=Integer.parseInt(Teclado.readLine());
            switch(opc){
                case 1: lista.insertar_nodo_inicio();
                    break;
                case 2: lista.borrar_nodo_posicion();
                    break;
                case 3: lista.imprimir_lista_cab();
                    break;
                case 4: lista.imprimir_lista_fin();
                    break;
            }
        }while (opc!=5);
        lista.destruir_lista_doble_encadenada( );
    }
}
