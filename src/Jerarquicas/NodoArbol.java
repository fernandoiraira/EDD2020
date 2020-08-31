/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jerarquicas;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class NodoArbol {

    Object elem;
    NodoArbol izquierdo;
    NodoArbol derecho;

    public NodoArbol(Object elem, NodoArbol izq, NodoArbol der) {
        this.elem = elem;
        this.izquierdo = izq;
        this.derecho = der;
    }

    public Object getElem() {
        return this.elem;
    }

    public NodoArbol getIzquierdo() {
        return this.izquierdo;
    }

    public NodoArbol getDerecho() {
        return this.derecho;
    }

    public void setElem(Object elem) {
        this.elem = elem;
    }

    public void setIzquierdo(NodoArbol izq) {
        this.izquierdo = izq;
    }

    public void setDerecho(NodoArbol der) {
        this.derecho = der;
    }

}
