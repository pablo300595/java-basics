package communication;

public class PalomaMensajera extends Paloma implements Comunicador {

    public void enviarMensaje(String mensaje) {
        System.out.println("Currucu! "+ mensaje);
    }
    
}   
