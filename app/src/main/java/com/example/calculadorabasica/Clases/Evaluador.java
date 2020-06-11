package com.example.calculadorabasica.Clases;

import java.util.ArrayList;

public class Evaluador {

    private String numAux = "";
    private int i;
    private ArrayList<String> postfija = new ArrayList<>();
    private String postfija2 = "";
    private Pila pila = new Pila();

    public Evaluador() {
    }

    public boolean EvaluarFuncion(String infija) {
        //Recorrer la cadena Infija
        try {
            boolean verfNum = false;
            for (i = 0; i < infija.length(); i++) {
                switch (infija.charAt(i)) {
                    case '-':
                        if (numAux.equals("")) {
                            numAux += String.valueOf(infija.charAt(i));
                        } else {
                            postfija.add(numAux);
                            numAux = "";
                            compararOperadores(1, "+");
                            i--;
                        }
                        break;
                    case '+':
                        if (numAux.equals("")) {
                            compararOperadores(1, "+");
                        } else {
                            postfija.add(numAux);
                            numAux = "";
                            i--;
                        }
                        if (infija.length() - 2 == i && !numAux.equals("")) {
                            postfija.add(numAux);
                        }
                        break;
                    case '*':
                        if (numAux.equals("")) {
                            compararOperadores(2, "*");
                        } else {
                            postfija.add(numAux);
                            numAux = "";
                            i--;
                        }
                        if (infija.length() - 2 == i && !numAux.equals("")) {
                            postfija.add(numAux);
                        }
                        break;
                    case '/':
                        if (numAux.equals("")) {
                            compararOperadores(2, "/");
                        } else {
                            postfija.add(numAux);
                            numAux = "";
                            i--;
                        }
                        if (infija.length() - 2 == i && !numAux.equals("")) {
                            postfija.add(numAux);
                        }
                        break;
                    case '%':
                        if (numAux.equals("")) {
                            compararOperadores(2, "%");
                        } else {
                            postfija.add(numAux);
                            numAux = "";
                            i--;
                        }
                        if (infija.length() - 2 == i && !numAux.equals("")) {
                            postfija.add(numAux);
                        }
                        break;
                    case '√':
                        postfija.add("0.5");
                        compararOperadores(4, "√");
                        break;
                    case '^':
                        if (numAux.equals("")) {
                            compararOperadores(4, "^");
                        } else {
                            postfija.add(numAux);
                            numAux = "";
                            i--;
                        }
                        if (infija.length() - 2 == i && !numAux.equals("")) {
                            postfija.add(numAux);
                        }
                        break;
                    case '(':
                        if (numAux.equals("")) {
                            compararOperadores(5, "(");
                        } else {
                            postfija.add(numAux);
                            numAux = "";
                            i--;
                        }
                        if (infija.length() - 2 == i && !numAux.equals("")) {
                            postfija.add(numAux);
                        }
                        break;
                    case ')':
                        if (numAux.equals("")) {
                            while (!pila.getUltimoElemento().equals("(")) {
                                postfija.add(pila.getUltimoElemento());
                                pila.eliminarAlFinal();
                            }
                            if (pila.numeroDeNodos() == 1) {
                                pila = new Pila();
                            } else {
                                pila.eliminarAlFinal();
                            }
                        } else {
                            postfija.add(numAux);
                            numAux = "";
                            i--;
                        }

                        break;
                    default:
                        numAux += String.valueOf(infija.charAt(i));
                        if (infija.length() - 1 == i && !numAux.equals("")) {
                            postfija.add(numAux);
                        }
                        break;
                }

            }
            while (pila.numeroDeNodos() > 0) {
                if (pila.numeroDeNodos() == 1) {
                    postfija.add(pila.getUltimoElemento());
                    pila.retirarUltimo("");
                    break;
                } else {
                    postfija.add(pila.getUltimoElemento());
                    pila.eliminarAlFinal();
                }

            }
            operar(postfija);

            for (int j = 0; j < postfija.size(); j++) {
                postfija2 += postfija.get(j);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private void operar(ArrayList postfija) {
        double num1, num2;
        for (int i = 0; i < postfija.size(); i++) {
            if (isNumeric(postfija.get(i).toString())) {
                if (pila.numeroDeNodos() == 1 && pila.getUltimoElemento().equals("")) {
                    pila.retirarUltimo(postfija.get(i));
                } else {
                    pila.agregarAlFinal(postfija.get(i));
                }
            } else {
                num2 = Double.parseDouble(pila.getUltimoElemento());
                pila.eliminarAlFinal();
                if (pila.numeroDeNodos() == 1) {
                    num1 = Double.parseDouble(pila.getUltimoElemento());
                    pila.retirarUltimo("");
                } else {
                    num1 = Double.parseDouble(pila.getUltimoElemento());
                    pila.eliminarAlFinal();
                }
                if (pila.numeroDeNodos() == 1 && pila.getUltimoElemento().equals("")) {
                    pila.retirarUltimo(operacion(postfija.get(i).toString().charAt(0), num1, num2));
                } else {
                    pila.agregarAlFinal(operacion(postfija.get(i).toString().charAt(0), num1, num2));
                }

            }
        }
    }

    private static boolean isNumeric(String cadena) {
        try {
            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private int prioridadEnPila(char operador) {
        if (operador == '^' || operador == '√') {
            return 3;
        }
        if (operador == '*' || operador == '/') {
            return 2;
        }
        if (operador == '+' || operador == '-') {
            return 1;
        }
        if (operador == '(') {
            return 0;
        }
        return 0;
    }

    public void compararOperadores(int valor, String operador) {
        if (pila.estaVacia()) {
            pila.agregarAlFinal(operador);
        } else {
            if (valor <= prioridadEnPila(pila.getUltimoElemento().charAt(0))) {
                postfija.add(String.valueOf(pila.getUltimoElemento().charAt(0)));
                if (pila.numeroDeNodos() == 1) {
                    pila.retirarUltimo(operador);
                } else {
                    pila.removeAlFinal();
                    pila.agregarAlFinal(operador);
                }
            } else {
                pila.agregarAlFinal(operador);
            }
        }
    }

    private double operacion(char letra, double num1, double num2) {
        Double numero = num1;
        if (letra == '*') {
            return num1 * num2;
        }
        if (letra == '√') {
            return raiz(num2);
        }
        if (letra == '/') {
            return num1 / num2;
        }
        if (letra == '%') {
            double residuo = num1 % num2;
            if (residuo > 0 && num1 < 0) {
                residuo -= num2;
            }
            if (residuo > 0 && num2 < 0) {
                residuo += num2;
            }
            if (residuo < 0 && num1 < 0) {
                residuo += num2;
            }
            if (residuo < 0 && num2 < 0 && num1 < 0) {
                residuo -= num2;
            }
            return residuo;

        }
        if (letra == '+') {
            return num1 + num2;
        }
        if (letra == '-') {
            if (numero == null) {
                return (-num2);
            } else {
                return num1 - num2;
            }
        }
        if (letra == '^') {
            return Math.pow(num1, num2);//potencia
        }
        if (letra == 'L') {
            int b = (int) num1;
            double n = num2;
            double val = 0;
            int i, accurate = 10, reps = 0;
            while (n != 1 && accurate >= 0) {
                for (i = 0; n >= b; i++) n /= b;
                n = p(n, 10);
                val = 10 * (val + i);
                accurate--;
                reps++;
            }
            return (double) val / p(10, reps);
        }
        return 0;
    }

    public double p(double x, int i) {
        double r = 1.0;
        for (int j = i; j > 0; j--) r *= x;
        return r;
    }


    public double raiz(double num){
        double x = 1.0;
        for (int i = 1; i < 10; i++) {
            x = (x + num/x) / 2;
        }
        return x;
    }

    public void reset() {
        pila = new Pila();
        numAux = "";
        postfija2 = "";
        postfija.clear();
    }

    public ArrayList<String> getPostfija() {
        return postfija;
    }

    public void setPostfija(ArrayList<String> postfija) {
        this.postfija = postfija;
    }

    public Pila getPila() {
        return pila;
    }

    public void setPila(Pila pila) {
        this.pila = pila;
    }

    public String getPostfija2() {
        return postfija2;
    }

    public void setPostfija2(String postfija2) {
        this.postfija2 = postfija2;
    }
}
