package cosecha_propia.tema5.ejImprovisado;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int[] lista = new int[10];
        for (int i = 0; i < lista.length; i++) {
            lista[i]=r.nextInt(1,101);
        }
        System.out.println("numeros generados: " + lista);

        for (int i = 0;i<10;i++){
            if(esPrimo(lista[i])){
                System.out.println("el número " + lista[i] + " es primo");
            }else{
                System.out.println("El numero " + lista[i] + " no es primo, pero es divisible por " + primerDivisor(lista[i]) );
            }
        }
    }

    public static int primerDivisor(int numero) {
        int res=numero;
        for (int i = numero - 1; i > 1; i--) {
            if (numero % i == 0) {
                res = i;
                break;
            }
        }
        return res;
    }

    public static boolean esPrimo(int numero) {
        boolean res = true;
        for (int i = numero - 1; i > 1; i--) {
            if (numero % i == 0) {
                res = false;
                break;
            }
        }
        return res;
    }

}
