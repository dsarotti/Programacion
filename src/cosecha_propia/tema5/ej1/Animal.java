package cosecha_propia.tema5.ej1;

public class Animal extends SerVivo {
    private int peso;
    private final String ALIMENTACION = "me alimento como un animal";
    
    public Animal(String nombreCientifico, String nombreComun, int altura, int peso){
        super(nombreCientifico, nombreComun, altura);
        this.peso = peso;
    }

    public void setPeso(int peso){
        this.peso=peso;
    }

    public void setAltura(int altura){
        this.altura= altura;
    }

    public String alimentar(){
        return ALIMENTACION;
    }

    public int getPeso() {
        return peso;
    }

    public int getAltura() {
        return altura;
    }
}
