package br.com.letscode.Exceptions;

public class PossuiContaException extends Throwable {
    private String message;

    public  PossuiContaException(){
        this.message = "Você já possui este tipo de conta.";
    }

}
