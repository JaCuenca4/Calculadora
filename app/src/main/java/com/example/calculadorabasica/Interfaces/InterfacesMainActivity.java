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
        void showResultMemory(String result);
    }

    /**
     * Interfaz para los presenters
     */
    interface Presenter{
        void operacionSumar(float numero1, float numero2);
        void operacionRestar(float numero1, float numero2);
        void operacionMultiplicar(float numero1, float numero2);
        void operacionDividir(float numero1, float numero2);
        void guardarMemoria(String numero);
        void mostrarMemoria();
        void enviarResultado(String result);
        void enviarResultadoMemoria(String result);
        void operacionSumarMemoria(String result);
        void operacionRestarMemoria(String result);

    }

    /**
     * Interfaz para los modelos
     */
    interface Model{
        void sumar(float numero1,float numero2);
        void restar(float numero1,float numero2);
        void multiplicar(float numero1,float numero2);
        void dividir(float numero1,float numero2);
        void guardarMemoria(String num);
        void mostrarMemoria();
        void sumarMemoria(String num);
        void restarMemoria(String num);

    }
}
