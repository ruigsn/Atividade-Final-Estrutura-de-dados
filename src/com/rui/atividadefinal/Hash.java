package com.rui.atividadefinal;

public class Hash {
    protected int operador;
    protected Lista[] vetor;

    public Hash(int operador) {
        this.operador = operador;
        this.vetor = new Lista[operador];
        for (int i=0; i<operador; i++){
            vetor[i] = new Lista();
        }
    }

    public void inserir (Contato contato){
        int chave = contato.codigo % operador;
        vetor[chave].inserir(contato);
    }

    public Contato buscar(int codigo){
        return vetor[codigo % operador].buscar(codigo);
    }

    public String toString() {                          // Sobrescreve o metodo toString
        String out = "";                                // Cria uma string de saida
        for(int i = 0; i < operador; i++) {             // Para cada posicao no vetor de Listas
            out += "" + i + ": ";                       // adiciona uma string representando a Lista
            out += vetor[i % operador] + "\n";
        }
        return out;                                     // Retorna a String
    }

}
