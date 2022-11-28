package com.rui.atividadefinal;

public class Contato {
    protected int codigo;
    protected String nome;
    protected String telefone;

    Contato(int codigo, String nome, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
    }

    public String toString() {
        return "(" + codigo + ", " + nome + ")";
    }

}
