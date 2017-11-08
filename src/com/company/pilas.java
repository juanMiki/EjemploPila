package com.company;

import com.company.nodo;

/**
 * Created by Mauuu on 08/11/2017.
 */
public class pilas {
    private nodo top;

    public pilas () {
        top = null;
    }

    public  boolean vaciar() {
        return (top==null);
    }

    public void push(int valor) {
        nodo nuevoNodo;
        if( vaciar())
            top = new nodo (valor);
        else{
            nuevoNodo = new nodo (valor);
            nuevoNodo.setProx(top);
            top = nuevoNodo;
        }
    }

    public void peek(){
        nodo temp = top;
        if(temp!=null) {
            System.out.println("LA PILA ES: ");
            while ( temp!=null ) {
                System.out.println(temp.getValor());
                temp=temp.getProx();
            }
        }
        else
            System.out.println("PILA VACÍA.");
    }

    public void cima() {
        if ( !vaciar())
            System.out.println("Cima: "+top.getValor());
        else
            System.out.println("La pila esta vacia");

    }

    public void pop(){
        if(!vaciar()){

            System.out.println("Dato estraido: "+top.getValor());
            top = top.getProx();
        }
        else
            System.out.println("La pila esta vacia");
    }


}
