package Codigo;

public class ListaSimple {

    private NodoString raiz;
    private NodoString cola;

    public ListaSimple() {
        raiz = null;
        cola = null;
    }

    public void insertarString(String nuevoString) {
        if (raiz == null) {
            NodoString nuevoNodo = new NodoString();
            nuevoNodo.setDato(nuevoString);
            nuevoNodo.setSiguiente(null);
            raiz = nuevoNodo;
            //Dado que solo existe 1 dato, entonces raiz = cola
            cola = raiz;
        } else {
            NodoString nuevoNodo = new NodoString();
            nuevoNodo.setDato(nuevoString);
            nuevoNodo.setSiguiente(null);
            cola.setSiguiente(nuevoNodo);
            cola = nuevoNodo;
        }
    }

    public boolean buscarString(String stringBuscado) {
        NodoString actual = raiz;
        while (actual != null) {
            if (actual.getDato().equals(stringBuscado)) {
                return true;
            }
            actual = actual.getSiguiente();
            if (actual == raiz) {
                // Se ha recorrido toda la lista
                break;
            }
        }
        return false;
    }

    public void imprimirLista() {
        NodoString actual = raiz;
        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }
    }
}
