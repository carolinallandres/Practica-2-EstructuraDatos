package Descartadas.Carolina.grafos.json;

import Descartadas.Carolina.estructuras_necesarias.ListSE;
import com.google.gson.Gson;

import java.io.FileReader;

public class ArchivosJson { //clase para cargar datos desde un json

    private static class ContenedorTripletas { //estructura auxiliar para leer el json
        Tripleta tripletas[]; //array de tripletas dentro del json
    }

    public static ListSE<Tripleta> cargar(String ruta) { //carga el archivo json y lo convierte en lista

        ListSE<Tripleta> lista = new ListSE<>(); //lista donde se guardan las tripletas

        try { //bloque para evitar errores al leer archivo

            Gson gson = new Gson(); //crea el parser de json

            ContenedorTripletas data =
                    gson.fromJson(new FileReader(ruta), ContenedorTripletas.class); //lee el json y lo convierte

            if (data != null && data.tripletas != null) { //si hay datos válidos

                for (int i = 0; i < data.tripletas.length; i++) { //recorre el array
                    lista.addLast(data.tripletas[i]); //añade cada tripleta a la lista
                }
            }

        } catch (Exception e) { //si hay error leyendo el archivo
            e.printStackTrace(); //imprime el error
        }

        return lista; //devuelve la lista final
    }
}