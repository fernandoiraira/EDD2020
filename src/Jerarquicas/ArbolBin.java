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
public class ArbolBin {

    NodoArbol raiz;

    public ArbolBin() {
        this.raiz = null;
    }

    public boolean insertar(Object elemNuevo, Object elemPadre, char lugar) {
        boolean exito = true;

        if (this.raiz != null) {
            this.raiz = new NodoArbol(elemNuevo, null, null);
        } else {

        }

        return exito;
    }

}
