package org.mhurtado.junit5app.exception;

public class DineroInsuficienteException extends RuntimeException{
    public DineroInsuficienteException(String message){
        super(message);
    }
}
