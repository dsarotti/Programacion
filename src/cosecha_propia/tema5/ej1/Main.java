package cosecha_propia.tema5.ej1;

public class Main {
    public static void main(String[] args) {
        Animal juan = new Animal("Animalus brutus", "jabalí", 90, 78);
        Vegetal dante = new Vegetal("VegetalusFlacuchus", "berenjena", 164);
        
        System.out.println(juan.alimentar()+ " que se llama "+ juan.getNombreCientifico()+ " AKA " + juan.getNombreComun() + ", pesa " + juan.getPeso() + " kilos y mide " + juan.getAltura() + " cm.");

        System.out.println(dante.alimentar() + " que se llama " + dante.getNombreCientifico() + " AKA " + dante.getNombreComun() + " y mide " + dante.getAltura() + " metros.");

    }
    
}
