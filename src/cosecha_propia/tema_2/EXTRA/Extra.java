package cosecha_propia.tema_2.EXTRA;
import java.util.ArrayList;
import java.io.Console;
import java.util.Scanner;
public class Extra {
    ArrayList<String> palabras = new ArrayList<String>();
    public void rellenar(){
    /*pide cadenas para guardar en cada posición del array
      hasta pulsar Enter sin introducir nada.
      no debe haber espacios ni mayusculas.*/

        Console c = System.console();
        String temp="init";
        while (!temp.isEmpty() && !temp.isBlank())    
        {
            System.out.println("Introduce una palabra simple sin espacios ni mayusculas");
            temp = c.readLine();
            if (!temp.isEmpty() && !temp.isBlank()){
                if (temp.contains(" ")){   
                    System.out.println("Error: se encontraron espacios en la cadena introducida, vuelve a intentarlo: ");

                } else if (!temp.contentEquals(temp.toLowerCase())){
                    System.out.println("Error: Se han encontrado mayusculas, vuelve a intentarlo: ");

                } else this.palabras.add(temp);
            }

        }
    }

    public void ordenando(){
        String temp1,temp2;
        ArrayList<String> solucion = new ArrayList<>(this.palabras) ;//copia de la lista de palabras
        solucion.sort(null); //solucion de referencia con la que comparar
        System.out.println("solucion: " + solucion);
        if (!this.palabras.equals(solucion)){
            System.out.println("Lista introducida: ");
            System.out.println(palabras);
            System.out.println("ordenalas: ");
            do {
                System.out.println("Indica dos posiciones para intercambiarlas: ");
                int t1,t2;
                System.out.println("Introduce el primer indice: ");
                t1 = pideIndice();
                System.out.println("Introduce el segundo indice: ");
                t2 = pideIndice();

                //guardo temporalmente los datos de cada posición
                temp1=this.palabras.get(t1);
                temp2 = this.palabras.get(t2);

                //Escribo los datos de las posiciones cruzadas
                this.palabras.set(t1, temp2);
                this.palabras.set(t2, temp1);
                System.out.println(this.palabras);

            } while (!this.palabras.equals(solucion));
        }
        System.out.println("Lista ordenada: " + this.palabras);
    }

    public int pideIndice(){
        Scanner sc = new Scanner(System.in);
        int i;
        do {
            i = sc.nextInt();
            if (i<0) System.out.println("el indice debe ser positivo.");
            if (i >= this.palabras.size()) System.out.println("el indice debe ser menor que " + this.palabras.size() );
        } while ((i<0) || (i >= this.palabras.size()));
        return i;
    }
}