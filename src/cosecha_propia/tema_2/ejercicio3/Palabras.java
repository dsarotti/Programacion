package cosecha_propia.tema_2.ejercicio3;
import java.io.Console;
import java.util.Arrays;
/*  EJERCICIO TERMINADO
    Haz ahora que el programa permita introducir hasta 10 palabras y las almacene en un array de cadenas. 
    El usuario podrá interrumpir la introducción de cadenas si pulsa ENTER sin escribir nada (cadena vacía).
    Una vez terminada la introducción de cadenas muestra al usuario la lista de palabras introducidas.
*/
class Palabras{
    String[] palabras = new String[10];
    public void rellenar(){
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

    public boolean sonIguales(int pos1, int pos2){
        return this.palabras[pos1].equals(this.palabras[pos2]);
    }
}