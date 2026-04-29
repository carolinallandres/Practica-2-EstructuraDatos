package Descartadas.Carolina.grafos.componentes;

import Descartadas.Carolina.estructuras_necesarias.ListSE;
import Descartadas.Carolina.grafos.json.Tripleta;

public class Grafo { //estructura principal del grafo

    public ListSE<Nodo> nodos; //lista de nodos del grafo

    public ListSE<Tripleta> tripletas = new ListSE<>(); //lista de tripletas (sujeto, predicado, objeto)


    public Grafo() { //constructor del grafo
        nodos = new ListSE<>(); //inicializa la lista de nodos
    }


    public Nodo buscarNodo(String nombre) { //busca un nodo por su nombre
        for (int i = 0; i < nodos.getSize(); i++) { //recorre toda la lista de nodos
            Nodo n = nodos.get(i); //obtiene el nodo en la posición i

            if (n.nombre.equals(nombre)) { //si el nombre coincide
                return n; //lo devuelve
            }
        }
        return null; //si no lo encuentra devuelve null
    }


    public Nodo obtenerONuevo(String nombre) { //devuelve un nodo si existe o lo crea si no existe
        Nodo n = buscarNodo(nombre); //intenta buscarlo primero

        if (n == null) { //si no existe
            n = new Nodo(nombre); //lo crea
            nodos.addLast(n); //lo añade a la lista de nodos
        }

        return n; //devuelve el nodo encontrado o creado
    }


    public void agregarTripleta(String sujeto, String predicado, String objeto) { //añade una relación al grafo

        Nodo s = obtenerONuevo(sujeto); //obtiene o crea el nodo sujeto
        Nodo o = obtenerONuevo(objeto); //obtiene o crea el nodo objeto

        Arista a = new Arista(predicado, o); //crea la arista con la relación

        s.aristas.addLast(a); //añade la arista al nodo sujeto

        tripletas.addLast(new Tripleta(sujeto, predicado, objeto)); //guarda también la tripleta
    }


    public void cargarDesdeTripletas(ListSE<Tripleta> lista) { //carga un grafo desde una lista de tripletas

        for (int i = 0; i < lista.getSize(); i++) { //recorre todas las tripletas

            Tripleta t = lista.get(i); //obtiene la tripleta actual

            agregarTripleta(t.s, t.p, t.o); //la añade al grafo
        }
    }
}