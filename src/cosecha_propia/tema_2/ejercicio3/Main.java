package cosecha_propia.tema_2.ejercicio3;
import java.io.Console;
import java.util.Arrays;
/*  EJERCICIO TERMINADO
    Modifica el programa anterior para que ordene las palabras introducidas previamente por el usuario.
*/
public class Main {
    public static void main(String[] args) {
        Palabras objeto = new Palabras();

        System.out.println("Introduce hasta 10 cadenas de caracteres: ");
        objeto.rellenar();
        System.out.println("Relleno completado.");
        System.out.println("ordenando...");

        System.out.println("Mostrando contenido ordenado: ");
        for (String cadena:objeto.getPalabras()){
            if (cadena != null)
            System.out.println(cadena);
        }
        System.out.println(Arrays.toString(objeto.getPalabras()));
    }
}