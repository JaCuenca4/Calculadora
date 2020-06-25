package com.example.calculadorabasica.Clases;

/**
 * The type Pila.
 */
public class Pila {

    private Nodo p;

    /**
     * Instantiates a new Pila.
     */
    public Pila(){
        p = null;
    }

    /**
     * Esta vacia boolean.
     *
     * @return the boolean
     */
    public boolean estaVacia() {
        return p == null;
    }

    /**
     * Esta llena boolean.
     *
     * @return the boolean
     */
    public boolean estaLlena(){
        return false == estaVacia();
    }

    /**
     * Agregar al final.
     *
     * @param dato the dato
     */
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

    /**
     * Eliminar al final string.
     *
     * @return the string
     */
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

    /**
     * Buscar nodo string.
     *
     * @param Id the id
     * @return the string
     */
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

    /**
     * Numero de nodos int.
     *
     * @return the int
     */
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

    /**
     * Remove al final.
     */
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

    /**
     * Remove ultimo elmt.
     */
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

    /**
     * Get ultimo elemento string.
     *
     * @return the string
     */
    public String getUltimoElemento(){
        Nodo i = p;
        String aux;
        while (i.getSig() != null) {
            i = i.getSig();
        }
        return i.getDato().toString();
    }

    /**
     * Cambiar ultimo.
     *
     * @param dato the dato
     */
    public void cambiarUltimo(Object dato){
        Nodo i = p;
        while (i.getSig() != null) {
            i = i.getSig();
        }
        i.setDato(dato);
    }

    /**
     * Retirar ultimo.
     *
     * @param dato the dato
     */
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
