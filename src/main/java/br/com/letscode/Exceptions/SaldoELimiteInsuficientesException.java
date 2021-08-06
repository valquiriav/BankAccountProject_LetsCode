package br.com.letscode.Exceptions;

public class SaldoELimiteInsuficientesException extends Throwable {
    private String message;

    public  SaldoELimiteInsuficientesException(){
        this.message = "Saldo e/ou limite insuficientes.";
    }
}
