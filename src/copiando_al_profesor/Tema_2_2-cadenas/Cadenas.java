import java.io.Console;
public class Cadenas {
    public static void main(String[] args) {
        metodo1();
    }
    public static void metodo1(){
        Console c = System.console();
        String str1 = "12";
        String str2 = "12";
        System.out.println("empieza");
        switch (str1.compareTo(str2)){
            case 0:
                System.out.printf("\"%s\" y \"%s\" son iguales.%n",str1,str2);
                break;
            default:
                System.out.printf("\"%s\" y \"%s\" no son iguales.%n",str1,str2);
                break;
        }
    }
}