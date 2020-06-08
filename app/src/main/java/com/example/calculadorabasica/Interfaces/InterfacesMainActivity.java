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
        void showMemory(String result);
}

    /**
     * Interfaz para los presenters
     */
    interface Presenter{
        void calcular(String operacion);
        void factorial(String operacion);
        void limparMemoria();
        void sumarMemoria();
        void restarMemoria();
        void recuperarMemoria();
        void enviarResultado(String result);
    }

    /**
     * Interfaz para los modelos
     */
    interface Model{
        void calcular(String operacion);
        void factorial(String operacion);
        void enviarResultado();
        void mostrarMemoria();
    }
}
