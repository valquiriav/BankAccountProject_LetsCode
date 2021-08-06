package br.com.letscode.Exceptions;

public class SaldoInsuficienteException extends Throwable {
    private String message;

    public  SaldoInsuficienteException(){
        this.message = "Saldo insuficiente.";
    }
}
