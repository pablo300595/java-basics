package communication;

public class TelefonoCelular extends Telefono implements Comunicador {
    public void enviarMensaje(String mensaje) {
        System.out.println("Rin Rin! " + mensaje);
    }
}
