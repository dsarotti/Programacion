package old;
import java.io.Console;
import java.lang.Math;
import java.util.Random;

//Variables, operadores y estructuras condicionales
public class Ejercicios {
    public static void main(String[] args){
        //ejercicio1(args[0],args[1]);
        //ejercicio2();
        //ejercicio3();
        //ejercicio4(0,10);
        //ejercicio5();
        ejercicio6(0,1000);
    }

    public static void ejercicio1(String i, String l){
        //Indica los resultados de las operaciones 
        //basicas con los argumentos recibidos

        //convertir los argumentos a int
        int a = Integer.parseInt(i);
        int b = Integer.parseInt(l);
        int c = Integer.max(a, b);
        System.out.println("Resultado de la suma = " + (a + b));
        System.out.println("Resultado de la resta = " + (a-b));
        System.out.println("Resultado de la multiplicacion = " + (a*b));
        System.out.println("Resultado de la division = " + (a/b));
        System.out.println("Resultado del modulo = " + (a % b));
    }

    public static void ejercicio2(){
        Console c = System.console();
        System.out.println("Comparacion entre 2 numeros.");
        System.out.println("-");
        
        System.out.println("Introduce el primer numero:");
        int i = Integer.parseInt(c.readLine());
        System.out.println("Introduce el segundo numero:");
        int l = Integer.parseInt(c.readLine());

        if (i>l){
            System.out.println(i + " es mayor que " + l);
        }else if (l>i){
            System.out.println(i + " es menor que " + l);
        }else{
            System.out.println("Ambos numeros son iguales");
        }
    }
    public static void ejercicio3(){
        Console c = System.console();
        System.out.println("Introduce un entero:");
        int num = Integer.parseInt(c.readLine());
        if ((num % 2) == 0){
            System.out.println("el numero " + num + " es par");
        }else{
            System.out.println("el numero 0" + num + " es impar");
        }
    }

    public static void ejercicio4(int min, int max){
        int rand = (int)(Math.random() * (max - min) + min);
        System.out.println("un numero aleatorio entre "+ min +" y " + max + " es " + rand);
    }
    public static void ejercicio5(){
        for (int i = 1;i<=100;i++){
            System.out.print(i + " ");
        }
        System.out.println("-------");
        int i =0;
        while (i<=100){
            System.out.print(i + " ");
            i++;
        }
    }

    public static int generarAleatorio(int min, int max){
        /* devuelve un int aleatorio entre el minimo
        y el maximo para el ejercicio 6 */
        Random r = new Random();
        return r.nextInt(max+1-min)+min;
    }

    public static void ejercicio6(int min,int max){
        Console c = System.console(); //abrimos consola para recibir las respuestas
        int res = generarAleatorio(min,max);
        int cont=0;
        int intento;
        System.out.println("acierta el número entre " + min + " y " + max + ": ");
        do {
            intento = Integer.parseInt(c.readLine());
            cont++;
            if (intento > res){
                System.out.print("te has pasado, vuelve a intentarlo: ");
            }else if (intento < res){
                System.out.print("te has quedado corto, vuelve a intentarlo: ");   
            }else{
                System.out.println("Has acertado con el "+ intento);
                System.out.println("numero de intentos: " + cont);
            }
        } while (intento !=res);
    }
}