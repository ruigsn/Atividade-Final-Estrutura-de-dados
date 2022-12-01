package com.rui.atividadefinal;

public class Contato {
    protected int codigo;
    protected String nome;
    protected String telefone;
    protected String email;
    protected String dataNascimento;

    Contato(int codigo, String nome, String telefone, String email, String dataNascimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    public String toString() {
        return "(" + nome + ", " + telefone + ", " + email + ", " + dataNascimento + ")";
    }

}
