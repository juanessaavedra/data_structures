package dqueue;

public class Turno {
    private int numero;
    private Persona persona;

    public Turno(int numero, Persona persona) {
        this.numero = numero;
        this.persona = persona;
    }

    public int getNumero() {
        return numero;
    }

    public Persona getPersona() {
        return persona;
    }

    @Override
    public String toString() {
        return "Turno{" + "numero=" + numero + ", persona=" + persona + '}';
    }
}
