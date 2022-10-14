package cosecha_propia.tema_2.ejercicios.ejercicio2;
import java.io.Console;
/*  EJERCICIO TERMINADO
    Tomando como base el código del ejercicio anterior, haz que el programa nos indique que palabra está antes lexicográficamente.*/
public class Main {
    public static void main(String[] args) {
        clase objeto = new clase();
        objeto.setP1(pide());
        objeto.setP2(pide());
        comprobar(objeto);
        orden(objeto);
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

    public static void orden (clase obj){
        if (obj.getOrdenLexic()<0 )
            System.out.println(obj.getP1() + " va antes que " + obj.getP2());
        else    
            System.out.println(obj.getP2() + " va antes que " + obj.getP1());
    }


}