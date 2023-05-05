package Extra;

public class ListaSimple {

    //Aqui es donde definimos el comportamiento de la lista
    //Definimos nuestra "cabeza" o "head" o "raiz"
    private NodoSimple raiz;
    //Definimos nuesta "cola" o "final" o "end"
    private NodoSimple cola;

    public ListaSimple() {
        raiz = null;
        cola = null;
    }

    //Definir el metodo insertar al inicio
    public void insertarAlInicio(String dato) {
        //Se verifica que la lista no este vacia
        if (raiz == null) {
            NodoSimple nuevoNodo = new NodoSimple();
            nuevoNodo.setDato(dato);
            nuevoNodo.setSiguiente(null);
            raiz = nuevoNodo;
            //Dado que solo existe 1 dato, entonces raiz = cola
            cola = raiz;
        } else {
            NodoSimple nuevoNodo = new NodoSimple();
            nuevoNodo.setDato(dato);
            nuevoNodo.setSiguiente(raiz);
            //Ahora la raiz esta apuntando al nuevo nodo que insertamos
            raiz = nuevoNodo;
        }
    }

    //Definir el metodo insertar al final
    public void insertarAlFinal(String dato) {
        //Se verifica que la lista no este vacia
        if (raiz == null) {
            NodoSimple nuevoNodo = new NodoSimple();
            nuevoNodo.setDato(dato);
            nuevoNodo.setSiguiente(null);
            raiz = nuevoNodo;
            //Dado que solo existe 1 dato, entonces raiz = cola
            cola = raiz;
        } else {
            NodoSimple nuevoNodo = new NodoSimple();
            nuevoNodo.setDato(dato);
            nuevoNodo.setSiguiente(null);
            cola.setSiguiente(nuevoNodo);
            cola = nuevoNodo;
        }
    }

    //Definir el metodo insertar donde quieras
    public void insertarEnIndice(String dato, int indice) {
        //Se verifica que la lista no este vacia
        if (raiz == null) {
            if (indice == 0) {
                NodoSimple nuevoNodo = new NodoSimple();
                nuevoNodo.setDato(dato);
                nuevoNodo.setSiguiente(null);
                raiz = nuevoNodo;
                //Dado que solo existe 1 dato, entonces raiz = cola
                cola = raiz;
            } else {
                System.out.println("El indice no es valido. ");
            }
        } else {
            NodoSimple nuevoNodo = new NodoSimple();
            nuevoNodo.setDato(dato);
            nuevoNodo.setSiguiente(null);
            //Ahora insertamos en el indice
            NodoSimple temporal = raiz;
            int contador = 0;
            while (temporal != null) {
                if (contador == indice) {
                    //Caso 1 - Se quiere insertar al inicio
                    if (indice == 0) {
                        nuevoNodo.setSiguiente(raiz);
                        //Ahora la raiz esta apuntando al nuevo nodo que insertamos
                        raiz = nuevoNodo;
                        break;
                    } //Caso 2 - Se quiere insertar al final
                    else if (temporal.getSiguiente() == null) {
                        nuevoNodo.setSiguiente(null);
                        cola.setSiguiente(nuevoNodo);
                        cola = nuevoNodo;
                        break;
                    } //Caso 3 - Se quiere insertar en medio
                    else {
                        nuevoNodo.setSiguiente(temporal.getSiguiente());
                        temporal.setSiguiente(nuevoNodo);
                        break;
                    }
                }
            }
        }
    }

    //Definir recorrer toda la lista
    public void recorrerLista() {
        //Crear una variable temporal para recorrer la lista
        NodoSimple temporal = raiz;
        int contador = 1;
        while (temporal != null) {
            System.out.println("Imprimiendo el nodo " + contador);
            System.out.println("\tDato " + temporal.getDato());
            contador++;
            temporal = temporal.getSiguiente();
        }
    }
}
