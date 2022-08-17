package com.estruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        // Fila = estrutura de dados FIFO. Primeiro a entrar, primeiro a sair
        // Uma coleção projetada para conter elementos antes do processamento
        // Estrutura de dados linear.

        // enfileirar = offer()
        // desenfileirar = poll()

        // Onde as filas são úteis?

        // 1. Buffer de teclado (as letras devem aparecer na tela na ordem em que são pressionadas)
        // 2. Fila da impressora (os trabalhos de impressão devem ser concluídos em ordem)
        // 3. Usado em LinkedLists, PriorityQueues, busca em largura

        Queue<String> fila = new LinkedList<>();

        //System.out.println(fila.isEmpty());

        fila.offer("Paula");
        fila.offer("David");
        fila.offer("Mariana");
        fila.offer("Rafaela");
        fila.offer("Luciano");

        //System.out.println(fila.isEmpty());
        //System.out.println(fila.size());
        //System.out.println(fila.contains("Rafaela"));

        //System.out.println(fila.peek());
        //fila.poll();
        //fila.poll();
       // fila.poll();
       // fila.poll();

        System.out.println(fila);

    }

}
