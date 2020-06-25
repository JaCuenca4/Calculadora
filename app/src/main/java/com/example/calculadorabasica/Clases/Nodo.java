package com.example.calculadorabasica.Clases;

/**
 * The type Nodo.
 */
public class Nodo {

    private Object dato;
    private Nodo sig;

    /**
     * Instantiates a new Nodo.
     *
     * @param dato the dato
     */
    public Nodo(Object dato){
        this.dato = dato;
        sig = null;
    }

    /**
     * Gets dato.
     *
     * @return the dato
     */
    public Object getDato() {
        return dato;
    }

    /**
     * Sets dato.
     *
     * @param dato the dato
     */
    public void setDato(Object dato) {
        this.dato = dato;
    }

    /**
     * Gets sig.
     *
     * @return the sig
     */
    public Nodo getSig() {
        return sig;
    }

    /**
     * Sets sig.
     *
     * @param sig the sig
     */
    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
