package cosecha_propia.tema_2.ejercicio2;
/*  EJERCICIO TERMINADO
    Tomando como base el código del ejercicio anterior, haz que el programa nos indique que palabra está antes lexicográficamente.
*/
class Palabras{
    String palabra1;
    String palabra2;

    public void setP1(String p1){
        this.palabra1 = p1;
    }

    public void setP2(String p2){
        this.palabra2 = p2;
    }

    public String getP1(){
        return this.palabra1;
    }

    public String getP2(){
        return this.palabra2;
    }

    public boolean sonIguales(){
        return palabra1.equals(palabra2);
    }
    public int getOrdenLexic(){
    return this.palabra1.compareTo(palabra2);  
    }

}