package cosecha_propia.tema_2.ejercicio3;
import java.io.Console;
/*  EJERCICIO TERMINADO
    Haz ahora que el programa permita introducir hasta 10 palabras y las almacene en un array de cadenas. 
    El usuario podrá interrumpir la introducción de cadenas si pulsa ENTER sin escribir nada (cadena vacía).
    Una vez terminada la introducción de cadenas muestra al usuario la lista de palabras introducidas.
*/
class Palabras{
    String[] palabras = new String[10];

    public void rellenar(){
        Console c = System.console();
        String temp = "init";
        int i = 0;
        while (!temp.isEmpty() || i < palabras.length)    
        {
            temp = c.readLine();
            palabras[i]=temp;
            i++;
        }
    }

    public String getPos(int pos){
        return this.palabras[pos];
    }

    public boolean sonIguales(int pos1, int pos2){
        return palabras[pos1].equals(palabras[pos2]);
    }
}