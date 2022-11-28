package cosecha_propia.tema5.ej3;

public class Recta {
    public Punto inicio;
    public Punto fin;
    
    public Recta(Punto inicio, Punto fin) {
        this.inicio = inicio;
        this.fin = fin;
    }
    public Punto getInicio() {
        return inicio;
    }
    public void setInicio(Punto inicio) {
        this.inicio = inicio;
    }
    public Punto getFin() {
        return fin;
    }
    public void setFin(Punto fin) {
        this.fin = fin;
    }
    
}
