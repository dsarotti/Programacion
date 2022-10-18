package cosecha_propia.tema_2.ejercicio6;
import java.io.Console;
import java.util.Arrays;

import org.apache.commons.collections4.ComparatorUtils;

//EJERCICIO
//Crea un método (estático) que reciba un array de palabras como entrada y 
//devuelva una copia del array con las palabras ordenadas.
class Palabras{
    String[] palabras = new String[10];
    public void rellenar(){
        //pide cadena para guardar en cada posición del array
        //hasta llenar las 10 posiciones o pulsar Enter sin introducir cadena.

        Console c = System.console();
        String temp="init";
        int i = 0;
        while (!temp.isEmpty() && !temp.isBlank() && (i < this.palabras.length))    
        {
            temp = c.readLine();
            if (!temp.isEmpty() && !temp.isBlank())
            this.palabras[i]=temp;
            i++;
        }
    }

    public String[] getPalabras(){
        return this.palabras;
    }

    public String getPos(int pos){
        return this.palabras[pos];
    }

    public static String[] copiaOrdena(String[] lista){
        String[] copia = Arrays.copyOf(lista,lista.length);
        Arrays.sort(copia, ComparatorUtils.nullLowComparator(null));
        return copia;
    }
}