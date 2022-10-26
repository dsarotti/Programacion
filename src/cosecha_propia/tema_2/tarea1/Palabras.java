package cosecha_propia.tema_2.tarea1;
//import java.util.Arrays;

public class Palabras {
    String[] lista;

    public void introducir(String entrada){
        this.lista = new String[entrada.split(", ").length]; //genera el array de tamaño fijo.
        this.lista = entrada.split(", ");//divide la lista por comas y la guarda en el array creado antes.
        for (int i = 0 ;i < this.lista.length;i++){ //quita posibles espacios en blanco antes y después de cada palabra.
            this.lista[i]=this.lista[i].strip();
        }    
    }

    public String[] filtrar(String filtro){
        String res="";
        char tempChars[];
        char filtroChars[]=filtro.toCharArray();//pasamos el filtro a array de chars para comparar.
        boolean trigger;
        for (int i = 0;i<this.lista.length;i++){ //recorremos todas las palabras.
            trigger=false;
            tempChars=this.lista[i].toCharArray(); //alojamos temporalmente cada palabra en un array de Chars.
            
            if ((filtroChars.length<=tempChars.length) && (tempChars[0] == filtroChars[0]) ){   //si el filtro cabe en la palabra y
                trigger=true; 
                for(int n = 1 ;(n < filtroChars.length) || (!trigger);n++){//recorremos la palabra comparando con el filtro. 
                    if (tempChars[n]!=filtroChars[n]){    //si en algun momento el filtro no concuerda se pasa trigger a false.
                        trigger=false;              //lo que provoca que se pare el bucle para esa palabra y no se añada a la lista.
                    }
                }
                if (trigger){
                res=res+","+tempChars.toString();
                }
            }
        }
        return res.split(",");
    }
}