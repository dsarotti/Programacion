package copiando_al_profesor.tarea1;

import java.io.Console;

public class Tarea1 {
    public static final String SEPARADOR = ", ";
    public static String[] leerPalabras(String linea) {
        return linea.split(SEPARADOR);
    }
    private static int seleccionDeOpcion(String[] opciones){
        Console c = System.console();
        System.out.println("Elija opción");
        System.out.println("------------");
        for (int i = 0;i < opciones.length;i++){
            System.out.println(i+") "+ opciones[i]);
        }
        System.out.println("1) Filtrar");
        System.out.println("2) Dividir");
        System.out.println("3) Salir");
        return 0;
    }
    public static void main(String[] args) {
        Console c = System.console();
        String linea = c.readLine("Introduzca una lista de palabras separadas por \"" + SEPARADOR + "\"");
   }
}