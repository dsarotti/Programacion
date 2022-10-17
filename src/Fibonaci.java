public class Fibonaci{
    //TERMINADO
    public static void main(String[] args){
        int n = 0;
        for (int i = 1;i < 9999;i = (n+i)){ 
            System.out.println(n);
            System.out.println(i);
           
            n=(n+i);
        }
    }
}