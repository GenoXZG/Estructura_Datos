package org.example;

public class ListaDoble {
    private NodoDoble inicio;
    private NodoDoble ultimo;

    private int size;

    public ListaDoble() {
        this.inicio = null;
        this.ultimo = null;
        this.size = 0;

    }

    public NodoDoble getInicio() {
        return inicio;
    }

    public void setInicio(NodoDoble inicio) {
        this.inicio = inicio;
    }

    public NodoDoble getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoDoble ultimo) {
        this.ultimo = ultimo;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public boolean estatus(){

        return inicio == null;
    }

    public void insertarInicio( Object e){
        NodoDoble nuevo = new NodoDoble(e);
        if (inicio == null) {
            inicio = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
        size++;


    }

    public void insertarUltimo (Object e){
            NodoDoble nuevo = new NodoDoble(e);
            if (inicio == null) {
                inicio = nuevo;
                ultimo = nuevo;
            } else {
                ultimo.setSiguiente(nuevo);
                nuevo.setAnterior(ultimo);
                ultimo = nuevo;
            }
            size++;
    }

    public void buscar(int i){

        NodoDoble nuevo = inicio;
        int contador = 0;
        while (contador < i && nuevo != null) {

             nuevo = nuevo.getSiguiente();
             contador++;
        }
        System.out.println("El valor en la posicion " + i + " es: " + nuevo.getValor() );

    }

    public void insertarByIn(int index, Object e){
        NodoDoble nuevo = new NodoDoble(e);
        NodoDoble tmp = inicio;
        int contador = 0;

        while (contador < index -1 && tmp != null){

            tmp = tmp.getSiguiente();
            contador++;

        }
        nuevo.setAnterior(tmp);
        nuevo.setSiguiente(tmp.getSiguiente());
        tmp.setSiguiente(nuevo);
        tmp.getSiguiente().setAnterior(nuevo);

    }

    public void eliminar(int index) {
        if (index < 0 || index > size) {

            System.out.println("Indice no valido");
            return;
        }

        NodoDoble tmp = inicio;
        int contador = 0;

        while (contador < index) {
            tmp = tmp.getSiguiente();
            contador++;
        }

        if (tmp == inicio) {
            inicio = tmp.getSiguiente();
            if (inicio != null) {
                inicio.setAnterior(null);
            } else {
                ultimo = null;
            }
        } else {

            tmp.getAnterior().setSiguiente(tmp.getSiguiente());
            if (tmp.getSiguiente() != null) {
                tmp.getSiguiente().setAnterior(tmp.getAnterior());
            } else {

                ultimo = tmp.getAnterior();
            }
        }

        size--;
        System.out.println("Nodo eliminado: " + tmp.getValor());
    }






    public String toString() {
        NodoDoble tmp = inicio;
        String cadena = "";

        while (tmp != null) {
            cadena = cadena + "<--" + tmp.getValor() + "--> ";
            tmp = tmp.getSiguiente();
        }

        return "[null " + cadena + "null]";
    }

    public String myString() {

        return "Lista Doble: " + inicio + ultimo;
    }
}


