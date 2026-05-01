package Seleccionadas.estructuras_necesarias;

public class ElementoSimpleEnlazada<T> {
    T elemento;
    public ElementoSimpleEnlazada<T> next;

    public ElementoSimpleEnlazada(T elemento) {
        this.elemento = elemento;
        this.next = null;
    }

}

