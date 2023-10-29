package exceptions;

public class ErrorFisicoException extends Exception {
    public ErrorFisicoException(Exception ex) {
        super("Ocurrio un error Fisico", ex);
    }
}
