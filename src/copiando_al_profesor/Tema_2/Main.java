package Copiando_al_profesor.Tema_2;
import java.util.Calendar;
import java.util.Random;
class Main{
    public static void main(String[] args) {
        String arg1 = args [0];
        String arg2 = args [1];
        int min = Integer.parseInt(arg1);
        int max = Integer.parseInt(arg2);

        Random random = new Random();

        int aleatorio1 = random.nextInt();
        int aleatorio2 = random.nextInt();

        System.out.println("El primer número es: " + aleatorio1 + ".");
        //System.out.println("El primer número es: %d.%n", aleatorio1);
        System.out.println("El segundo número es: " + aleatorio2 + ".");

        int max_aleat = Math.max(aleatorio1,aleatorio2);

        Calendar cal = Calendar.getInstance();
        cal.get(Calendar.MONTH);

        //System.out.println("El número mayor entre (%s y %d) es %d.%n",aleatorio1, aleatorio2, max_aleat);

    }
}

