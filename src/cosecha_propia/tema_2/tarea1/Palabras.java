package cosecha_propia.tema_2.tarea1;

import java.io.Console;
import java.util.Arrays;

public class Palabras {
    private String[] lista = null;

    public String[] getLista() {
        return this.lista;
    }

    public void introducir(String entrada) {
        if (entrada.split(", ").length > 0) {
            this.lista = new String[entrada.split(", ").length]; // genera el array de tamaño fijo.
            this.lista = entrada.split(", "); // divide la lista por comas y la guarda en el array creado antes.
            for (int i = 0; i < this.lista.length; i++) {
                this.lista[i] = this.lista[i].strip(); // quita posibles espacios en blanco antes y después de cada
                                                       // palabra.
            }
            if (this.lista.length == 1) { // si sólo se introducen palabras vacías, se deja la lista como null.
                if (this.lista[0].isBlank())
                    this.lista = null;
            }
        }
    }

    public String[] filtrar(String filtro) {
        /*
         * Filtra la lista de este objeto y devuelve la nueva lista con las palabras que
         * cumplan el filtro.
         * si el parámetro filtro esta vacío se devuelve una lista vacía.
         */
        String res = "";
        if (this.lista != null && !(filtro.isEmpty())) {
            char[] tempChars;
            char[] filtroChars = filtro.toCharArray();// pasamos el filtro a array de chars para comparar.
            boolean sw; // lo utilizaremos para controlar si se encuentra el patrón.
            for (int i = 0; i < this.lista.length; i++) { // recorremos todas las palabras.
                sw = false;
                tempChars = this.lista[i].toCharArray(); // alojamos temporalmente la palabra en un array de Chars.

                if ((filtroChars.length <= tempChars.length) && (tempChars[0] == filtroChars[0])) {// si el filtro cabe
                                                                                                   // en la palabra y la
                                                                                                   // primera letra
                                                                                                   // concuerda.
                    sw = true;
                    for (int n = 1; (n < filtroChars.length) && (sw); n++) {// recorremos la palabra comparando con el
                                                                            // filtro.
                        if (tempChars[n] != filtroChars[n]) { // si en algun momento el filtro no concuerda se cambia sw
                                                              // a false.
                            sw = false; // lo que provoca que se pare el bucle para esa palabra y no se añada a la
                                        // lista.
                        }
                    }
                    if (sw)
                        res = res + "," + this.lista[i]; // si al recorrer la palabra sw sigue siendo true, el filtro
                                                         // concuerda, se añade la palabra.
                    tempChars.toString();
                }
            }
        }
        return res.split(",");
    }

    public String[][] dividir(String divisor) {
        /*
         * ordena la lista de este objeto y luego la divide por la primera
         * ocurrencia del divisor que recibe como parámetro de entrada
         * devuelve un array de dos dimensiones con dos posiciones en la primera
         * dimensión y las que sean necesarias en la segunda dimensión
         */
        String[] temp = this.lista.clone(); // clonamos para no modificar el array original.
        Arrays.sort(temp); // ordenamos la copia.
        int clave = Arrays.binarySearch(temp, divisor); // obtenemos el índice por el que dividir el array.
        Console c = System.console();

        if (clave < 0)
            do {
                System.out.println("esa palabra no existe en la lista,a prueba con otra: ");
                clave = Arrays.binarySearch(temp, c.readLine());
            } while (clave < 0);

        String[][] res = new String[2][];
        res[0] = new String[clave];
        res[1] = new String[temp.length - clave];

        for (int i = 0; i < temp.length; i++) {
            if (i < clave) {
                res[0][i] = temp[i];
            } else {
                res[1][i - clave] = temp[i];
            }
        }
        return res;
    }
}