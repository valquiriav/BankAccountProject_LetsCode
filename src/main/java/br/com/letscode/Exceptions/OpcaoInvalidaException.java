package br.com.letscode.Exceptions;

public class OpcaoInvalidaException extends Throwable {
    private String message;

    public  OpcaoInvalidaException(){
        this.message = "Opção Inválida.";
    }
}