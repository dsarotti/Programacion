package cosecha_propia.tema_2.ejercicios.ejercicio1;
/*  EJERCICIO TERMINADO
    Escribe un programa que pida al usuario dos palabras por consola e indique si son iguales o disntintas.
*/
class clase{
    String palabra1;
    String palabra2;

    public void setP1(String p1){
        this.palabra1 = p1;
    }
    public void setP2(String p2){
        this.palabra2 = p2;
    }
    public boolean sonIguales(){
        return palabra1.equals(palabra2);
    }
}