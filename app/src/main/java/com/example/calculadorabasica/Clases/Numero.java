package com.example.calculadorabasica.Clases;

/**
 * The type Numero.
 */
public class Numero {
    private double numero;

    /**
     * Instantiates a new Numero.
     */
    public Numero(){}

    /**
     * Instantiates a new Numero.
     *
     * @param numero the numero
     */
    public Numero(float numero){
        this.numero = numero;
    }

    /**
     * Gets numero.
     *
     * @return the numero
     */
    public double getNumero() {
        return numero;
    }

    /**
     * Sets numero.
     *
     * @param numero the numero
     */
    public void setNumero(double numero) {
        this.numero = numero;
    }
}
