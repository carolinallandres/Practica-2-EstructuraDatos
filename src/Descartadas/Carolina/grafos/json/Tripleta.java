package Descartadas.Carolina.grafos.json;

public class Tripleta implements Comparable<Tripleta> { //estructura que representa una tripleta rdf (sujeto, predicado, objeto)

    public String s; //sujeto
    public String p; //predicado
    public String o; //objeto

    public Tripleta(String sujeto, String predicado, String objeto) { //constructor de la tripleta
        this.s = sujeto; //asigna sujeto
        this.p = predicado; //asigna predicado
        this.o = objeto; //asigna objeto
    }

    @Override
    public String toString() { //convierte la tripleta a formato n-triples
        return "<" + s + "> <" + p + "> <" + o + "> .";
    }

    @Override
    public boolean equals(Object o) { //compara si dos tripletas son iguales
        if (this == o) return true; //si es el mismo objeto
        if (!(o instanceof Tripleta)) return false; //si no es tripleta no vale

        Tripleta t = (Tripleta) o; //castea el objeto

        return s.equals(t.s) && //compara sujeto
                p.equals(t.p) && //compara predicado
                o.equals(t.o); //compara objeto
    }

    @Override
    public int compareTo(Tripleta o) { //comparación (no usada realmente)
        return 0; //no se usa para ordenar, por eso se deja fijo
    }
}