package copiando_al_profesor.tarea1.E4;

import java.security.InvalidParameterException;
import java.util.Arrays;

public class NumerosE4 {
    private int[] valores;

    public NumerosE4(int[] valores) {
        this.valores = valores.clone();
        Arrays.sort(this.valores);
    }
    public int longitud(){
        return valores.length;

    }
    public void insertar (int vlaor, int posicion){
        valores[valores.length];
        try {
            int a = 5/0;
        }catch (ArithmeticException e) {
            System.out.println("Detectada excepcion aritmetica.");
        }catch (Exception e){
            System.out.println("Detectada una excepcion de algun tipo.");
        }
    }
}