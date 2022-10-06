public class Fibonaci{
    public static void main(String[] args){
        int n = 0;
        for (int i = 1;i < 999999;i += n){
            System.out.println(i);
            n=i;
        }
    }
}