package org.example;

public class Lista {

     private Nodo cabeza;
     private int size;

    public Lista() {
        this.cabeza = null;
        this.size = 0;

    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Lista{" +
                "cabeza=" + cabeza +
                ", size=" + size +
                '}';
    }

    public  boolean estatus (){
         if (this.cabeza == null){
             System.out.println("La lista esta vacia");
          return true;
        }
         else {
             System.out.println("La lista contiene: " + this.size + " elementos");
           return false;
         }

    }

    public void add(Nodo i){

        if (i.getValor() == null ){

            System.out.println("No se puede agregar un elemento vacio a la lista\nError en el elemento: " + i);


        }
        else {
            i.enlace(cabeza);  ;
            cabeza = i;
            System.out.println("Se añadio el elemento de forma correcta");
            this.size++;
        }



    }

    public void search(int x) {
        int contador = 0;
        Nodo busqueda = cabeza;

        while (contador < x && busqueda != null) {
            busqueda = busqueda.getSiguiente();
            contador++;
        }

        if (busqueda == null) {
            System.out.println("Posicion inexistente");
        }
        System.out.println( "Elemento requisitado encontrado: " + busqueda.getValor());

    }

    public void delete(int index){
        if(index == 0){
            cabeza = cabeza.getSiguiente();
        }
        else {
            int contador = 0;
            Nodo tmp = cabeza;
            while ( contador < index - 1 ){
                tmp = tmp.getSiguiente();
                contador++;
            }
            tmp.enlace(tmp.getSiguiente().getSiguiente());

        }

        size--;
    }

}
