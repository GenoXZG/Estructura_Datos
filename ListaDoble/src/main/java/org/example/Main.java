package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ListaDoble doubles = new ListaDoble();

        doubles.insertarUltimo("Holaaaaa");
        doubles.insertarUltimo("Mundo");
        doubles.insertarUltimo("Soy el ultimooo");
        System.out.println(doubles);
        doubles.insertarInicio("Holaa antes de inicioooo");

        System.out.println(doubles);
        System.out.println(doubles.getSize());
        doubles.insertarByIn(3,"Insercion");
        System.out.println(doubles);

        doubles.eliminar(2);
        System.out.println(doubles);













        }
    }
