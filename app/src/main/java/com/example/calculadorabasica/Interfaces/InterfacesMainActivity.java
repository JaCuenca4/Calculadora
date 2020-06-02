package com.example.calculadorabasica.Interfaces;

public interface InterfacesMainActivity {
    interface View{
        void findElement();
        void showResult(String result);
    }
    interface Presenter{
        void operacion_sumar(int numero1, int numero2);
        void operacion_restar(int numero1, int numero2);
        void operacion_multiplicar(int numero1, int numero2);
        void operacion_dividir(int numero1, int numero2);
        void enviar_resultado (float numero);
    }
    interface Model{
        void sumar(int numero1,int numero2);
        void restar(int numero1,int numero2);
        void multiplicar(int numero1,int numero2);
        void dividir(int numero1,int numero2);

    }
}
