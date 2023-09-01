package org.example;



public class Main {
    public static void main(String[] args) {

     /*Nodo primero = new Nodo("Luis");
     Nodo segundo = new Nodo(18);

        System.out.println("Valor: " + primero.getValor() + " Nodo enlazadado: " + primero.getSiguiente());
        primero.enlace(segundo);
        System.out.println("Valor: " + primero.getValor() + " Nodo enlazadado: " + primero.getSiguiente());

        System.out.println("--------- Prueba de enlaces -----------------");
        System.out.println(primero.getSiguiente());
*/

     Lista lista = new Lista();

     lista.estatus();
     System.out.println(lista.getSize());
     Nodo primero = new Nodo("Luis");
     Nodo segundo = new Nodo(787);
     Nodo tercero = new Nodo(45);
     Nodo cuarto= new Nodo(12);

     lista.add(primero);
     lista.add(segundo);
     lista.add(tercero);
     lista.add(cuarto);


     System.out.println(lista.getCabeza());
     lista.search(1);
     lista.delete(1);
     lista.search(1);







    }
}
