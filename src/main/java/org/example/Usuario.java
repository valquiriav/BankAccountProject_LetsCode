package org.example;

import java.util.Scanner;

public class Usuario {

    private Long cpf;
    private String nome;
    private int codigo;

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
        System.out.println("Usuário autenticado com sucesso!");
    }
}
