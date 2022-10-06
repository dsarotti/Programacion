package clasesOld;

public class Cuadrado extends FormaGeometrica {
    int lado;
    public void ponLado(int l){
        this.lado=l;
        System.out.println("lado puesto");
    }
    public void muestraLado(){
        System.out.println(this.lado);
    }   
}