package old;
public class App {
    public static void main(String[] args){
        asignatura(0);
    }

    public static void asignatura(int nota){
        if (nota <5 && nota >0) {
            System.out.println("suspenso");
        }else if(nota <6 && nota >0){
            System.out.println("suficiente");
        }else if(nota <7 && nota >0){
            System.out.println("bien");
        }else if (nota<9 && nota >0){
            System.out.println("notable");
        }else if (nota<11 && nota >0){
            System.out.println("sobresaliente");
        }else{
            System.out.println("nota inválida");
        }
    }
}