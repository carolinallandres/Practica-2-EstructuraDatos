package Descartadas.Carolina.grafos.componentes;

import Descartadas.Carolina.estructuras_necesarias.ListSE;

public class Nodo implements Comparable<Nodo> { //nodo del grafo

    public String nombre; //nombre identificador del nodo
    public ListSE<Arista> aristas; //lista de aristas (conexiones) del nodo


    public Nodo(String nombre) { //constructor del nodo
        this.nombre = nombre; //asigna el nombre
        this.aristas = new ListSE<>(); //inicializa la lista de aristas vacía
    }

    @Override
    public int compareTo(Nodo o) { //comparación entre nodos (no usada realmente)
        return 0; //no se usa para ordenar, por eso devuelve 0 siempre
    }
}