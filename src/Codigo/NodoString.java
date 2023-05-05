package Codigo;

public class NodoString {

    //Necesitamos 2 cosas
    //1 - El dato
    //2 - El puntero
    private String dato;
    private NodoString siguiente;

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoString getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoString siguiente) {
        this.siguiente = siguiente;
    }
}
