package org.example;

public class ContaEspecial extends Conta{

    public ContaEspecial(Usuario usuario) {
        super(usuario);
        this.setSaldo(400);
        this.setLimite(200);
    }

    public void realizarSaque(double saque) {
        if (this.getSaldo() >= saque){
            this.setSaldo(this.getSaldo() - saque);
            System.out.println("Saque realizado com sucesso. Saldo atual: " + this.getSaldo());
            System.out.println("Limite atual: " + this.getLimite());
        }
        if (this.getSaldo() + this.getLimite() >= saque){
            this.setSaldo(0);
            this.setLimite(this.getLimite() - saque);
            System.out.println("Saque realizado com sucesso. Saldo atual: " + this.getSaldo());
            System.out.println("Limite atual: " + this.getLimite());
        } else {
            System.err.println("Saldo e/ou limite insuficientes.");
            System.err.println("Saldo atual: " + this.getSaldo());
            System.err.println("Limite atual: " + this.getLimite());
        }
    }

    public void fazerDeposito(double deposito){
        if (this.getLimite() < 200 && deposito + this.getLimite() <= 200){
            this.setLimite(this.getLimite() + deposito);

        } else if (this.getLimite() < 200 && deposito + this.getLimite() > 200) {
            double faltaLimite = 200 - this.getLimite();
            this.setLimite(200);
            this.setSaldo(this.getSaldo() + faltaLimite);
        } else if (this.getLimite() >= 200){
            this.setSaldo(this.getSaldo() + deposito);
        }
        System.out.println("Depósito realizado com sucesso. Saldo atual: " + this.getSaldo());
        System.out.println("Limite atual: " + this.getLimite());
    }

}
