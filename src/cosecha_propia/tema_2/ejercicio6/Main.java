package cosecha_propia.tema_2.ejercicio6;
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
       
        System.out.println("Mostrando contenido original: ");
        for (String cadena:objeto.getPalabras()){
            if (cadena != null)
            System.out.println(cadena);
        }

        System.out.println("Mostrando contenido de copia ordenada: ");
        for (String cadena:Palabras.copiaOrdena(objeto.getPalabras())){
            if (cadena != null)
            System.out.println(cadena);
        }

        
    }
}