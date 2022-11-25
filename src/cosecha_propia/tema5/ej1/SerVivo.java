package cosecha_propia.tema5.ej1;

public abstract class SerVivo {
    protected String nombreCientifico;
    protected String nombreComun;
    protected int altura;

    public SerVivo(String nombreCientifico, String nombreComun, int altura){
        this.nombreCientifico=nombreCientifico;
        this.nombreComun=nombreComun;
    }

    public int getAltura() {
        return altura;
    }

    public String getNombreCientifico(){
        return nombreCientifico;
    }

    public String getNombreComun(){
        return nombreComun;
    }
}
