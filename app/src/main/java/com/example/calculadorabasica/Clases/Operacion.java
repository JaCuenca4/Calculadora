package com.example.calculadorabasica.Clases;

/**
 * The type Operacion.
 */
public class Operacion {

    /**
     * The Evaluador.
     */
    Evaluador evaluador = new Evaluador();

    /**
     * Instantiates a new Operacion.
     */
    public Operacion(){
    }

    /**
     * Calcular operacion numero.
     *
     * @param operacion the operacion
     * @return the numero
     */
    public Numero calcularOperacion(String operacion){
        Numero respuesta = new Numero();
        try{
            if(evaluador.EvaluarFuncion(operacion)){
                respuesta.setNumero(Double.parseDouble(evaluador.getPila().getUltimoElemento()));
                evaluador.reset();
                return respuesta;
            }else{
                return null;
            }
        }catch (Exception e){
            System.out.printf("Problemas en la operacion");
            return null;
        }
    }

    /**
     * Cal factorial numero.
     *
     * @param operacion the operacion
     * @return the numero
     */
    public Numero calFactorial(String operacion){
        Numero respuesta = new Numero();
        double num = Double.parseDouble(operacion);
        respuesta.setNumero(factorial(num));
        return respuesta;
    }

    /**
     * Factorial double.
     *
     * @param numero the numero
     * @return the double
     */
    public double factorial(double numero){

        if(numero==0){
            return 1;
        }else {
            return numero * factorial(numero-1);
        }
    }

}
