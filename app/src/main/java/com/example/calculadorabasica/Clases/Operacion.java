package com.example.calculadorabasica.Clases;

public class Operacion {

    Evaluador evaluador = new Evaluador();

    public Operacion(){
    }

    public Numero calcularOperacion(String operacion){
        Numero respuesta = new Numero();
        try{
            if(evaluador.EvaluarFuncion(operacion)){
                respuesta.setNumero(Float.parseFloat(evaluador.getPila().toString()));
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

    public Numero calFactorial(String operacion){
        Numero respuesta = new Numero();
        double num = Double.parseDouble(operacion.substring(0,operacion.length()-1));
        respuesta.setNumero(factorial(num));
        return respuesta;
    }

    public double factorial(double numero){
        if(numero==0){
            return 1;
        }else {
            return numero * factorial(numero-1);
        }
    }
}
