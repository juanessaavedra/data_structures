package dqueue;

public class Turno {
    private int numeroTurno;
    private Persona persona;
    private static int contador = 0;

    public Turno(Persona persona) {
        this.persona = persona;
        this.numeroTurno = ++contador;
    }

    public int getNumeroTurno() {
        return numeroTurno;
    }

    public Persona getPersona() {
        return persona;
    }

    @Override
    public String toString() {
        return "Turno{" + "numero=" + numeroTurno + ", persona=" + persona + '}';
    }
}
