package Pilas;

import org.example.Nodo;

public class Pila {

    private Nodo inicio;
    private int size;

    public Pila() {
        this.inicio = null;
        this.size = 0;
    }

    public boolean estatus() {
        return inicio == null;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public int getSize() {
        return size;
    }

    public void push(Object valor) {
        Nodo nuevo = new Nodo(valor);
        if (estatus()) {
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }

        size++;
    }

    public void pop() {
        Object retorno = inicio.getValor();
        inicio = inicio.getSiguiente();
        size--;
        System.out.println("Elemento eliminado: " + "[" + retorno + "]");
    }

    public void buscar(int index) {
        Nodo tmp = inicio;
        int contador = size - 1;
        if (index >= size){
            System.out.println("El indice ingresado no existe en la pila");
        }
        else {
            while (contador > index) {
                System.out.println("Iteracion: " + tmp.getValor());
                tmp = tmp.getSiguiente();
                contador--;
            }
            System.out.println("Elemento encontrado: " + tmp.getValor());
        }

    }


    public void ObtenerPila(){
       Nodo tmp = inicio;
       while (tmp != null){
           System.out.println("[" + tmp.getValor() + "]");
           System.out.println("--------");
           tmp = tmp.getSiguiente();

       }

    }

    public void peek(){
        Object valor = this.inicio.getValor();

        System.out.println("Valor en el tope de la pila: " + valor);
    }



}
