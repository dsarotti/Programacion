import java.util.Scanner;
public class E_scanner {
    public static void main() {
        System.out.println("Introducir numero entero");
        Scanner num = new Scanner(System.in);
            int a = num.nextInt();
            num.close();
            System.out.println(a);
    }
}
