package com.example.calculadorabasica.Interfaces;

/**
 * Interfaces que pueden ser utilzadas por las clases
 * de acuerdo con la su funcionalidad, esta puede ser de tipo View, Model o Presenter
 */
public interface InterfacesMainActivity {


    /**
     * Interfaz para las vistas
     */
    interface View{
        void findElement();
        void showResult(String result);
    }


    /**
     * Interfaz para los presenters
     */
    interface Presenter{
        void operacion_sumar(int numero1, int numero2);
        void operacion_restar(int numero1, int numero2);
        void operacion_multiplicar(int numero1, int numero2);
        void operacion_dividir(int numero1, int numero2);
        void enviar_resultado (float numero);
    }


    /**
     * Interfaz para los modelos
     */
    interface Model{
        void sumar(int numero1,int numero2);
        void restar(int numero1,int numero2);
        void multiplicar(int numero1,int numero2);
        void dividir(int numero1,int numero2);

    }
}
