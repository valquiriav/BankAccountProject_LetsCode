package org.example;

import java.util.Scanner;

public class Usuario {

    private Long cpf;
    private String nome;
    private int codigo;

    private Conta contaPrincipal;
    private ContaEspecial contaEspecial;
    private ContaPoupanca contaPoupanca;

    public Usuario(Long cpf, String nome, int codigo) {
        this.cpf = cpf;
        this.nome = nome;
        this.codigo = codigo;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "cpf=" + cpf +
                ", nome='" + nome + '\'' +
                ", senha='" + codigo + '\'' +
                '}';
    }

    public void escolherAcao() {
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Movimentar Conta Existente");
        System.out.println("2 - Criar nova Conta");

        Scanner scanner = new Scanner(System.in);
        int acao = scanner.nextInt();

        switch (acao){
            case 1:
                this.movimentarConta();
                break;
            case 2:
                this.criarConta();
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    private void criarConta() {
        System.out.println("Escolha a conta que você gostaria de criar: ");
        System.out.println("1 - Conta Principal");
        System.out.println("2 - Conta Especial");
        System.out.println("3 - Conta Poupança");

        Scanner scanner = new Scanner(System.in);
        int conta = scanner.nextInt();

        switch (conta) {
            case 1:
                if (contaPrincipal == null) {
                    Conta c = new Conta();
                    this.contaPrincipal = c;
                    System.out.println("Conta criada com sucesso!");
                } else {
                    System.err.println("Você já possui uma Conta Principal.");
                }
                break;
            case 2:
                if (contaEspecial == null) {
                    ContaEspecial c = new ContaEspecial();
                    this.contaEspecial = c;
                    System.out.println("Conta criada com sucesso!");
                } else {
                    System.err.println("Você já possui uma Conta Especial.");
                }
                break;
            case 3:
                if (contaPoupanca == null) {
                    ContaPoupanca c = new ContaPoupanca();
                    this.contaPoupanca = c;
                    System.out.println("Conta criada com sucesso!");
                } else {
                    System.err.println("Você já possui uma Conta Poupança.");
                }
        }
        this.escolherAcao();
    }

    private void movimentarConta() {
        System.out.println("Escolha a conta que você gostaria de movimentar: ");
        System.out.println("1 - Conta Principal");
        System.out.println("2 - Conta Especial");
        System.out.println("3 - Conta Poupança");

        Scanner scanner = new Scanner(System.in);
        int conta = scanner.nextInt();

        System.out.println("Escolha a operação que você gostaria de fazer: ");
        System.out.println("1 - Visualizar Saldo");
        System.out.println("2 - Realizar Saque");
        System.out.println("3 - Realizar Depósito");

        int operacao = scanner.nextInt();

        switch (operacao) {
            case 1:
                switch (conta) {
                    case 1:
                        this.contaPrincipal.visualizarSaldo();
                        break;
                    case 2:
                        this.contaEspecial.visualizarSaldo();
                        break;
                    case 3:
                        this.contaPoupanca.visualizarSaldo();
                        break;
                }
            case 2:
                switch (conta) {
                    case 1:
                        this.contaPrincipal.realizarSaque();
                        break;
                    case 2:
                        this.contaEspecial.realizarSaque();
                        break;
                    case 3:
                        this.contaPoupanca.realizarSaque();
                        break;
                }
            case 3:
                switch (conta) {
                    case 1:
                        this.contaPrincipal.fazerDeposito();
                        break;
                    case 2:
                        this.contaEspecial.fazerDeposito();
                        break;
                    case 3:
                        this.contaPoupanca.fazerDeposito();
                        break;
                }


        }
    }
}
