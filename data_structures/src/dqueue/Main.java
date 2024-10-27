package dqueue;


import tablas_hash.Book;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/* Programa que simula una fila de un banco
 *  */
public class Main {
    public static void main(String[] args) {
        Queue<Turno> fila = new LinkedList<>(); //Crear cola

        String option = "1";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bienvenido al banco, ¿Qué desea hacer?"); //Menu
            System.out.println(("1.Tomar turno \n 2.Ser atendido (debe tener turno) \n 3.Listar turnos  \n 4.Consultar el siguiente en la fila"));
            option = scanner.next();

            switch (option) {
                case "1": // Tomar turno
                    System.out.println("Tomar turno en la fila");
                    System.out.println("Ingrese su nombre");
                    String nombre = scanner.next();
                    System.out.println("Ingrese su cedula");
                    String cedula = scanner.next();
                    Persona persona = new Persona(nombre, cedula);
                    Turno turno = new Turno(persona);
                    fila.add(turno);
                    System.out.println("Turno en la fila tomado: " + turno.getNumeroTurno());
                    break;
                case "2": // Ser atendido
                    System.out.println("Entregue su turno");
                    int turnoAtendido = fila.poll().getNumeroTurno();
                    System.out.println("Turno atendido: " + turnoAtendido);
                    System.out.println("Siguiente en la fila: " + fila.peek().getPersona().getNombre());
                    break;
                case "3": //Listar turnos
                    System.out.println("Listar turnos");
                    System.out.println("Turnos en la fila: " + fila);

                case "4": //Consultar el siguiente en la fila
                    System.out.println("Siguiente en la fila: " + fila.peek().getPersona().getNombre());
                    break;

                default: //Opcion invalida
                    System.out.println("Invalid option");
                    break;
            }
        } while(!option.equals("5"));


    }
}
