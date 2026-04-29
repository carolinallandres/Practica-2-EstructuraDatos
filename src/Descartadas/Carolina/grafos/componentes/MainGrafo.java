package Descartadas.Carolina.grafos.componentes;

import Descartadas.Carolina.grafos.json.Tripleta;

public class MainGrafo { //main de prueba del grafo básico

    public static void main(String[] args) {

        Grafo g = new Grafo(); //crea el grafo vacío

        // ===== añadir tripletas =====
        g.agregarTripleta("Juan", "es_amigo_de", "Pedro"); //juan conectado con pedro
        g.agregarTripleta("Juan", "vive_en", "Madrid"); //juan vive en madrid
        g.agregarTripleta("Pedro", "vive_en", "Barcelona"); //pedro vive en barcelona
        g.agregarTripleta("Ana", "trabaja_con", "Juan"); //ana trabaja con juan
        g.agregarTripleta("Ana", "vive_en", "Madrid"); //ana vive en madrid

        // ===== grafo (estructura nodos/aristas) =====
        System.out.println("===== GRAFO =====");

        for (int i = 0; i < g.nodos.getSize(); i++) { //recorre los nodos

            Nodo n = g.nodos.get(i); //nodo actual

            System.out.println("Nodo: " + n.nombre); //imprime el nodo

            for (int j = 0; j < n.aristas.getSize(); j++) { //recorre sus aristas

                Arista a = n.aristas.get(j); //arista actual

                System.out.println("  --[" + a.etiqueta + "]--> " + a.destino.nombre); //imprime conexión
            }

            System.out.println(); //salto de línea
        }

        // ===== tripletas (rdf real) =====
        System.out.println("===== TRIPLETAS RDF =====");

        for (int i = 0; i < g.tripletas.getSize(); i++) { //recorre tripletas

            Tripleta t = g.tripletas.get(i); //tripleta actual

            System.out.println( //imprime formato rdf
                    "<" + t.s + "> " +
                            "<" + t.p + "> " +
                            "<" + t.o + "> ."
            );
        }

        // ===== buscar nodo =====
        System.out.println("\n===== BUSCAR NODO: Juan =====");

        Nodo buscado = g.buscarNodo("Juan"); //busca el nodo juan

        if (buscado != null) { //si existe

            System.out.println("Nodo encontrado: " + buscado.nombre); //lo muestra

            for (int i = 0; i < buscado.aristas.getSize(); i++) { //recorre conexiones

                Arista a = buscado.aristas.get(i); //arista

                System.out.println("  --[" + a.etiqueta + "]--> " + a.destino.nombre); //muestra relación
            }
        }
    }
}