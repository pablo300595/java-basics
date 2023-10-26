package communication;

public class Telegrafo extends Antiguedad implements Comunicador {
    public void enviarMensaje(String mensaje) {
        System.out.println("(Sonido de maquina vieja) " + mensaje);
    }
}
