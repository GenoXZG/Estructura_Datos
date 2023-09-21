package Colas;

import org.example.Nodo;

public class Cola {
    private Nodo inicioCola;
    private Nodo finalCola;
    private int size;

    public Cola() {
        this.inicioCola = null;
        this.finalCola = null;
        this.size = 0;
    }

    public Nodo getInicioCola() {
        return inicioCola;
    }

    public Nodo getFinalCola() {
        return finalCola;
    }

    public int getSize() {
        return size;
    }

    public boolean estatus(){

        return inicioCola == null;
    }

    public void enque(Object valor){
       Nodo nuevo = new Nodo(valor);
       if (estatus()){
             inicioCola = nuevo;
             finalCola = nuevo;
       }
       else {
           finalCola.setSiguiente(nuevo);
           finalCola = nuevo;
       }

       size++;

    }

    public void ObtenerCola(){
       Nodo tmp = inicioCola;
       int contador = 0;
       if (estatus()){
           System.out.println("Cola vacia");
       }
       else {
           while (contador < size){
               System.out.println(tmp.getValor());
               System.out.println("^");
               tmp = tmp.getSiguiente();
               contador++;
           }
       }


    }
    public void deque() {
        inicioCola = inicioCola.getSiguiente();
        size--;

    }

    public void peek(){

        System.out.println("Elemento al final de la cola: " + finalCola.getValor());

    }



}
