package communication;

public class ComunicadorManager {
    public static Comunicador crearComunicador() {
        return new TelefonoCelular();
    }
}
