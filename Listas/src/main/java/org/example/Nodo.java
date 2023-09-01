package org.example;

public class Nodo {

    private Object valor;
    private Nodo siguiente;

    public Nodo() {
    }

    public Nodo(Object valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "valor=" + valor +
                ", apuntando a: " + siguiente +
                '}';
    }

    public void enlace (Nodo i){

        siguiente = i;


    }







}
