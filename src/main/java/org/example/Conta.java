package org.example;

import java.util.Scanner;

public class Conta {

    private Usuario usuario;
    private double saldo;
    private double limite;

    public Conta(Usuario usuario) {
        this.usuario = usuario;
        this.saldo = 0;
    }

    public void escolherAcao(int tipoConta){

        System.out.println("Escolha aquilo que deseja fazer:");
        System.out.println("1 - Visualizar saldo");
        System.out.println("2 - Realizar saque");
        System.out.println("3 - Fazer depósito");

        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

    }

    public void fazerDeposito(double deposito){
        this.setSaldo(this.getSaldo() + deposito);
        System.out.println("Depósito realizado com sucesso. Saldo atual: " + this.getSaldo());
    }

    public double visualizarSaldo() {
        return getSaldo();
    }

    public void realizarSaque(double saque) {
        if (this.getSaldo() >= saque){
            this.setSaldo(this.getSaldo() - saque);
            System.out.println("Saque realizado com sucesso. Saldo atual: " + this.getSaldo());
        } else {
            System.err.println("Saldo insuficiente.");
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
