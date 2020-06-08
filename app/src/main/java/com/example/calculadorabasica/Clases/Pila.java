package com.example.calculadorabasica.Clases;

public class Pila {

    private Nodo p;

    public Pila(){
        p = null;
    }

    public boolean estaVacia() {
        return p == null;
    }

    public boolean estaLlena(){
        return false == estaVacia();
    }

    public void agregarAlFinal(Object dato) {
        Nodo nodo = new Nodo(dato);
        if (estaVacia()) {
            p = nodo;
            return;
        }
        Nodo i = p;
        while (i.getSig() != null) {
            i = i.getSig();
        }
        i.setSig(nodo);
    }

    public String eliminarAlFinal() {
        if (estaVacia()) {
            return "Lista Vacia";
        }
        String resp;
        Nodo i = p;
        int contNodo = 1;
        while (i.getSig() != null && contNodo < numeroDeNodos() - 1) {
            i = i.getSig();
            contNodo++;
        }
        resp = i.getSig().toString();
        Nodo aux = i.getSig();
        i.setSig(null);
        try {
            aux.finalize();
        } catch (Throwable ex) {
            System.out.println(ex);
        }
        return resp;
    }

    public String buscarNodo(String Id) {
        Nodo temp = p;
        String resp;
        boolean vrf = false;
        while (temp != null) {
            String CompId = "";
            for (int i = 0; i < Id.length(); i++) {
                CompId += temp.toString().charAt(i);
            }
            if (Id.equals(CompId)) {
                resp = temp.toString();
                return resp;
            }else{
                temp = temp.getSig();
            }
        }
        return resp = "No exite el elemento en la lista";
    }

    public int numeroDeNodos() {
        int contNodo = 0;
        if (estaVacia()) {
            return contNodo;
        } else {
            Nodo i = p;
            contNodo = 1;
            while (i.getSig() != null) {
                i = i.getSig();
                contNodo++;
            }
            return contNodo;
        }
    }

    public void removeAlFinal(){
        if (estaVacia()) {
            return;
        }
        String resp;
        Nodo i = p;
        int contNodo = 1;
        while (i.getSig() != null && contNodo < numeroDeNodos() - 1) {
            i = i.getSig();
            contNodo++;
        }
        i.setSig(null);
    }

    public void removeUltimoElmt(){
        Nodo i = p;
        while (i.getSig() != null) {
            i = i.getSig();
        }
        //i = null;
        try {
            i.finalize();
        } catch (Throwable ex) {
            System.out.println(ex);
        }
    }

    public String getUltimoElemento(){
        Nodo i = p;
        String aux;
        while (i.getSig() != null) {
            i = i.getSig();
        }
        return i.getDato().toString();
    }

    public void cambiarUltimo(Object dato){
        Nodo i = p;
        while (i.getSig() != null) {
            i = i.getSig();
        }
        i.setDato(dato);
    }

    public void retirarUltimo(Object dato){
        Nodo i = p;
        while (i.getSig() != null) {
            i = i.getSig();
        }
        i.setDato(dato);
    }

    @Override
    public String toString() {
        String aux = "";
        Nodo i = p;
        while (i != null) {
            aux +="\n"+ i.toString() + "\n";
            i = i.getSig();
        }
        return aux;
    }
}
