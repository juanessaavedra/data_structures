package dlinkedlist.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader Teclado;
        Teclado=new BufferedReader(new InputStreamReader(System.in));
        int opc;
        ListaSencilla lista = new ListaSencilla); // creando lista
        lista.iniciar_lista(); // solo se llama una sola vez a este metodo
        do{// menu principal
            System.out.println("1.Almacenar un Numero en la Lista");
            System.out.println("2.Insertar Un Numero(Nodo) en una Posicion");
            System.out.println("3.Borrar un Numero en una posicion de la Lista ");
            System.out.println("4.Borrar el Numero al inicio de la Lista ");
            System.out.println("5.Borrar un Nodo de la lista mediante el Numero ");
            System.out.println("6.Imprimir lista");
            System.out.println("7.Consultar Informacion de un Nodo ");
            System.out.println("8.Consultar Informacion de un Nodo por medio de la Posicion");
            System.out.println("9.Salir");
            System.out.println("digite la opcion");
            opc=Integer.parseInt(Teclado.readLine());
            switch(opc){
                case 1: lista.insertar_nodo_inicio();
                    break;
                case 2: lista.insertar_nodo_posicion();
                    break;
                case 3: lista.borrar_nodo_posicion();
                    break;
                case 4: lista.borrar_nodo_inicio();
                    break;
                case 5: lista.borrar_nodo_informacion();
                    break;
                case 6: lista.imprimir_lista();
                    break;
                case 7: lista.consultar_informacion();
                    break;
                case 8: lista.consultar_nodo();
                    break;
            }
        }while (opc!=9);
        lista.destruir_lista( ); // se llama solo una vez para liberar la memoria reservada
    }
}


