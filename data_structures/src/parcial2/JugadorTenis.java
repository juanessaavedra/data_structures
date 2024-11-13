package parcial2;

// Representa al jugador con tres tubos de pelotas
public class JugadorTenis {
    private TuboPelotas[] tubos;// Tubos de pelotas


    public JugadorTenis() {
        tubos = new TuboPelotas[3]; // Crear tres tubos
        for (int i = 0; i < 3; i++) {
            tubos[i] = new TuboPelotas(); // Inicializar cada tubo
        }
    }

    // Método para llenar los tres tubos de pelotas
    public void llenarTubos() {
        for (TuboPelotas tubo : tubos) {
            tubo.llenarTubo(); // Llenar cada tubo
        }
    }

    // Método para usar una pelota de los tubos
    public String usarPelota() {
        for (int i = 0; i < tubos.length; i++) {
            int pelota = tubos[i].usarPelota(); // Intentar usar una pelota del tubo
            if (pelota != -1) {
                return "Pelota " + pelota + " sacada del tubo " + (i + 1); // Devolver mensaje con la pelota usada y el tubo
            }
        }
        return "NO TIENES PELOTAS PARA JUGAR, RECARGA"; // Mensaje si no hay pelotas en ningún tubo
    }

    // Método para obtener el estado actual de los tubos
    public String estadoActual() {
        StringBuilder estado = new StringBuilder(); // StringBuilder para construir el mensaje
        int totalPelotas = 0; // Contador total de pelotas
        for (int i = 0; i < tubos.length; i++) {
            int pelotas = tubos[i].getPelotas(); // Obtener el número de pelotas en el tubo
            estado.append("Tubo ").append(i + 1).append(": ").append(pelotas).append(" pelotas\n"); // Añadir el estado del tubo al mensaje
            totalPelotas += pelotas; // Sumar al contador total
        }
        estado.append("Total pelotas: ").append(totalPelotas); // Añadir el total de pelotas al mensaje
        return estado.toString(); // Devolver el mensaje
    }
}