import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int y, a=0,b=1,c=0;
        Scanner prompt = new Scanner(System.in);
        int x= prompt.nextInt();
        if(x>0 && x <46){
            for(y=1; y<x; y++)
            {
                if(y%2==1)
                {
                    System.out.printf("%d ",c);
                    c=a+b;
                    a=c;
                }
                else if(y==2)
                    System.out.printf("%d ",c);
                else if(y%2==0)
                {
                    System.out.printf("%d ",c);
                    c=a+b;
                    b=c;
                }
            }
            System.out.printf("%d\n",c);
        }
    }
}