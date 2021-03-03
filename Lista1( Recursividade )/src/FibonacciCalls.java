import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciCalls {
    public static int calls=0;

    public static int fib(int n){
        if(n==0)return 0;

        else if(n==1) return 1;

        else  {
            calls +=2;
            return   fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner prompt= new Scanner(System.in);
        int rep= prompt.nextInt();
        ArrayList <Integer> n= new ArrayList();

        if(rep>=1&& rep<=39) {
            for (int i=0;i<rep;i++){
                n.add(prompt.nextInt());
            }
            for (int i = 0; i < rep; i++) {
                fib(n.get(i));
                System.out.println("fib(" + n.get(i) + ") " + "= "+ calls+ " calls = " + fib(n.get(i)));
                calls =0;
            }
        }
    }
}

