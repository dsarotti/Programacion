package cosecha_propia.tema5.ej1;

public class Vegetal extends SerVivo {
    private final String ALIMENTACION= "me alimento como un vegetal";

    
    public Vegetal(String nombrecientifico,String nombreComun,int altura) {
        super(nombrecientifico,nombreComun,altura);
    }
    
    public String alimentar(){
        return ALIMENTACION;
    }


    
}
