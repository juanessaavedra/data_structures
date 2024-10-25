package dqueue;

import java.util.List;

public class Banco {
    private String nombre;
    private List<Turno> turnos;

    public Banco(String nombre, List<Turno> turnos) {
        this.nombre = nombre;
        this.turnos = turnos;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }
}
