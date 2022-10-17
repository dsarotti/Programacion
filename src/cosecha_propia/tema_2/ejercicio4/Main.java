package cosecha_propia.tema_2.ejercicio4;
import java.io.Console;
import java.util.Arrays;
/*  EJERCICIO TERMINADO
    Haz ahora que el programa permita introducir hasta 10 palabras y las almacene en un array de cadenas. 
    El usuario podrá interrumpir la introducción de cadenas si pulsa ENTER sin escribir nada (cadena vacía).
    Una vez terminada la introducción de cadenas muestra al usuario la lista de palabras introducidas.
*/
public class Main {
    public static void main(String[] args) {
        Palabras objeto = new Palabras();

        System.out.println("Introduce hasta 10 cadenas de caracteres: ");
        objeto.rellenar();
        System.out.println("Relleno completado.");
        System.out.println("ordenando...");
        objeto.ordenar();

        System.out.println("Mostrando contenido ordenado: ");
        for (String cadena:objeto.getPalabras()){
            if (cadena != null)
            System.out.println(cadena);
        }
    }
}