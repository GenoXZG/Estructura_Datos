package org.example;


import Colas.Cola;
import Pilas.Pila;

public class Main {
    public static void main(String[] args) {
         // Clase Cola y sus metodos

        Cola cola = new Cola();
        // Enque
        cola.enque("Primero");
        cola.enque("Segundo");
        cola.enque("Tercero");
        cola.ObtenerCola();
        // Deque
        System.out.println("------ Metodo deque ---------");
        cola.deque();
        cola.ObtenerCola();
        System.out.println("\n");
        // Peek
        System.out.println("---- Peek ----");
        cola.peek();

        System.out.println("\n----------Inicio Pila-------------");
         //Clase pila y sus metodos

        System.out.println("------ Pila -------");
        Pila pilita = new Pila();
        // Push
        pilita.push(45);
        pilita.push(56);
        pilita.push("Tope de Pila");
        pilita.pop();

        pilita.ObtenerPila();
        System.out.println("\n---- Peek ---");
        pilita.peek();

        // Buscar por indice
        System.out.println("\n------ Buscar -----");
        pilita.buscar(1);








        }
    }
