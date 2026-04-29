package Descartadas.Carolina.grafos.json;

import Descartadas.Carolina.estructuras_necesarias.ListSE;

public class ExportarNTriples { //clase para exportar tripletas en formato n-triples

    public static void exportar(ListSE<Tripleta> lista) { //imprime la lista en formato n-triples

        for (int i = 0; i < lista.getSize(); i++) { //recorre todas las tripletas

            Tripleta t = lista.get(i); //coge la tripleta actual

            System.out.println( //imprime en formato rdf simple
                    "<" + t.s + "> " + //sujeto
                            "<" + t.p + "> " + //predicado
                            "<" + t.o + "> ." //objeto y punto final
            );
        }
    }
}