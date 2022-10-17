package cosecha_propia.tema_2.ejercicio5;
import java.io.Console;
/*  EJERCICIO TERMINADO
    Haz ahora que el programa permita introducir hasta 10 palabras y las almacene en un array de cadenas. 
    El usuario podrá interrumpir la introducción de cadenas si pulsa ENTER sin escribir nada (cadena vacía).
    Una vez terminada la introducción de cadenas muestra al usuario la lista de palabras introducidas.
*/
class Palabras{
    String[] palabras = new String[10];
    public void rellenar(){
        //pide hasta 10 veces una cadena para guardar en cada posición del array
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

    public void mayus(){
        int i =0;
        for (String palabra : this.palabras) {
            if (palabra == null) 
                break;
            else {
                char palabrach[] = palabra.toCharArray();
                palabrach[0] = Character.toUpperCase(palabrach[0]);
                palabra = new String(palabrach);
                this.palabras[i] = palabra;
                i++;
            }
                
        }
    }
}