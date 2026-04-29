package Descartadas.Carolina.grafos.componentes;

public class Arista implements Comparable<Arista> { //representa una arista del grafo

    //Atributos
    public String etiqueta; //nombre o peso de la arista
    public Nodo destino; //nodo al que apunta la arista


    //Constructores
    public Arista(String etiqueta, Nodo destino) { //constructor de la arista
        this.etiqueta = etiqueta; //asigna la etiqueta
        this.destino = destino; //asigna el nodo destino
    }

    @Override
    public int compareTo(Arista o) { //comparación entre aristas (no implementada)
        return 0; //siempre devuelve 0 porque no se usa para ordenar
    }
}