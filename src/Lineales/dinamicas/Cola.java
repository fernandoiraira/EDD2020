/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lineales.dinamicas;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Cola {

    private Nodo frente;
    private Nodo fin;

    public Cola() {
        this.frente = null;
        this.fin = null;
    }

    public boolean sacar() {
        boolean exito = true;

        if (this.frente == null) {
            exito = false;
        } else {
            this.frente = this.frente.getEnlace();
            if (this.frente == null) {
                this.fin = null;
            }
        }

        return exito;
    }

    public boolean poner(Object elem) {
        Nodo nuevo = new Nodo(elem, null);

        if (this.frente == null) {
            this.frente = nuevo;
            this.fin = nuevo;
        } else {
            this.fin.setEnlace(nuevo);
            this.fin = nuevo;
        }

        return true;
    }

    public Object obtenerFrente() {
        return this.frente.getElem();
    }

    public boolean esVacia() {
        return this.frente == null;
    }

    public void vaciar() {
        this.frente = null;
        this.fin = null;
    }

    public Cola clone() {
        Cola clon = new Cola();
        Nodo aux = this.frente;
        Nodo aux2;

        if (aux != null) {
            clon.frente = new Nodo(aux.getElem(), null);
            clon.fin = clon.frente;
            aux = aux.getEnlace();

            while (aux != null) {
                aux2 = new Nodo(aux.getElem(), null);
                clon.fin.setEnlace(aux2);
                clon.fin = aux2;
                aux = aux.getEnlace();
            }

        }

        return clon;
    }

    @Override
    public String toString() {
        String s;

        if (this.esVacia()) {
            s = "[]";
        } else {
            s = "[";
            Nodo aux = this.frente;
            while (aux != null) {
                //agrega el texto del elemento que tiene el nodo y avanza
                s += " " + aux.getElem();
                aux = aux.getEnlace();
            }
            s += "]";
        }
        return s;
    }
}
