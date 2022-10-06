package clases;
public class Main {
    public static void main(String[] args) {
        MiClase mi_objeto1 = new MiClase();
        mi_objeto1.id = 1;
        mi_objeto1.nombre = "Dantecillo";
        
        MiClase mi_objeto2 = new MiClase();
        mi_objeto2.id = 2;
        mi_objeto2.nombre = "Gervasio";

        System.out.println(mi_objeto1);
        System.out.println(mi_objeto2);
    }
}