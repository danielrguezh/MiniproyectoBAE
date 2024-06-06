package es.ies.puerto.exception;

public class CentroMedicoException extends Exception{

    public CentroMedicoException(String message) {
        super(message);
    }

    public CentroMedicoException(String message, Throwable tipo) {
        super(message,tipo);
    }
}
