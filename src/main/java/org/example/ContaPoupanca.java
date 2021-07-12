package org.example;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Usuario usuario) {
        super(usuario);
        this.setSaldo(100);
    }

    public void realizarSaque(double saque) {
        if (this.getSaldo() >= saque){
            this.setSaldo(this.getSaldo() - saque - this.getSaldo() * 0.0007);
            System.out.println("Saque realizado com sucesso. Saldo atual: " + this.getSaldo());
        } else {
            System.err.println("Saldo insuficiente.");
        }
    }

    public void fazerDeposito(double deposito){
        this.setSaldo(this.getSaldo() + deposito - this.getSaldo() * 0.0007);
        System.out.println("Depósito realizado com sucesso. Saldo atual: " + this.getSaldo());
    }

}
