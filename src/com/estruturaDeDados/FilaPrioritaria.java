package com.estruturaDeDados;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class FilaPrioritaria {

    public static void main(String[] args) {

        
        //Fila em ordem padrão.
        Queue<Double> fila = new PriorityQueue<>();

        // Para inverter a ordem da Fila
        //Queue<Double> fila = new PriorityQueue<>(Collections.reverseOrder());

        fila.offer(6.0);
        fila.offer(7.0);
        fila.offer(6.5);
        fila.offer(5.2);
        fila.offer(9.0);
        fila.offer(8.0);

        while(!fila.isEmpty()){
            System.out.println(fila.poll());
        }
    }

}
