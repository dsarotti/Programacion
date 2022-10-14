package cosecha_propia.tema_2.ejercicios.ejercicio3;
import java.io.Console;
/*  EJERCICIO TERMINADO
    Tomando como base el código del ejercicio anterior, haz que el programa nos indique que palabra está antes lexicográficamente.
*/
class clase{
    String[] palabras = new String[10];

    public void rellenar(){
        Console c = System.console();
        String temp;
            for (int idx=0;idx < this.palabras.length;idx++){
            this.palabras[idx]=c.readLine();
        }
    }

    public String getPpos(int pos){
        return this.palabras[pos];
    }

    public boolean sonIguales(int pos1, int pos2){
        return palabras[pos1].equals(palabras[pos2]);
    }
    
    /*public int getOrdenLexic(){
    return this.palabra1.compareTo(palabra2);  
    }*/

}