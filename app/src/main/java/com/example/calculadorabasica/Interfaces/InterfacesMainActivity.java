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
        void showMemoria(String result);
        void showOperaciones(String result);
}

    /**
     * Interfaz para los presenters
     */
    interface Presenter{
        void calcular(String operacion);
        void factorial(String operacion);
        void limpiarMemoria();
        void sumarMemoria(String numero);
        void restarMemoria(String numero);
        void recuperarMemoria();
        void enviarResultado(String result);
        void enviarResultadoMemoria(String result);
        void enviarResultadoOperaciones(String result);
    }

    /**
     * Interfaz para los modelos
     */
    interface Model {
        void calcular(String operacion);

        void factorial(String operacion);
        void enviarResultado();

        void limpiarMemoria();

        void sumarMemoria(String num);

        void restarMemoria(String num);

        void recuperarMemoria();

    }
}
