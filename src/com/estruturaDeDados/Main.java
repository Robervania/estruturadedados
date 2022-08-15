package com.estruturaDeDados;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<String> pilha = new Stack<>();

        // pilha = estrutura de dados LIFO. Ultimo a entrar primeiro a sair
        // armazena objetos em uma espécie de "torre vertical"

        // usos de pilha?
        // 1. recursos de desfazer/refazer em editores de texto
        // 2. retroceder/avançar no histórico do navegador
        // 3. algoritmos de retrocesso (labirinto, diretórios de arquivos)
        // 4. funções de chamada (pilha de chamadas)

        // verificar se a pilha esta vazia.
        //System.out.println(pilha.empty());

        // push() para adicionar objetos ao topo
        pilha.push("Apartamento 202");
        pilha.push("Apartamento 203");
        pilha.push("Apartamento 204");
        pilha.push("Apartamento 205");
        pilha.push("Apartamento 206");

        // pop() para remover objetos do topo (é possivel armazenar o objeto em uma variavel)
        //String meuApt = pilha.pop();
        //System.out.println(meuApt);

        // peek() para verifiacr objeto sem remover
        //System.out.println(pilha.peek());

        //procura por objeto na pilha.
        // System.out.println(pilha.search("Apartamento 204"));

        System.out.println(pilha);


    }
}
