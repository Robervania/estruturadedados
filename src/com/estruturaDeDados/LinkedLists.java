package com.estruturaDeDados;

import java.util.LinkedList;

public class LinkedLists {

    public static void main(String[] args) {

        LinkedList<String> lista = new LinkedList<>();

       // Utilizando como pilha
        /*lista.push("A");
        lista.push("B");
        lista.push("C");
        lista.push("D");
        lista.push("F");
        //lista.pop();
        */

        //Utilizando LinkedList como fila
        lista.offer("A");
        lista.offer("B");
        lista.offer("C");
        lista.offer("D");
        lista.offer("F");
        //lista.poll();

        lista.add(4, "E");
        //lista.remove("E");

        System.out.println(lista.peekFirst());
        System.out.println(lista.peekLast());
        lista.addFirst("0");
        lista.addLast("G");
        //String inicio = lista.removeFirst();
        //String fim = lista.removeLast();

        System.out.println(lista);
    }
}
