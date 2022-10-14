package cosecha_propia.tema_2.ejercicios.ejercicio1;
import java.io.Console;
/*  EJERCICIO TERMINADO
    Escribe un programa que pida al usuario dos palabras por consola e indique si son iguales o disntintas.
*/
public class Main {
    public static void main(String[] args) {
        clase objeto = new clase();
        objeto.setP1(pide());
        objeto.setP2(pide());
        comprobar(objeto);
    }
    public static String pide (){
        Console c = System.console();
        return c.readLine();
    }
    public static void comprobar(clase obj){
        System.out.print("las cadenas ");
        if (!obj.sonIguales())
            System.out.print("no ");
        System.out.println("son iguales");
    }

}