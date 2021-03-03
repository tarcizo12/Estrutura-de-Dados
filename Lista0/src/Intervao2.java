import java.util.Scanner;
public class Intervao2 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int i=0;
        int in=0, out =0;

        int N =prompt.nextInt();

        if(N<10000){

            while(i<N){
                int X =prompt.nextInt();
                if(X>=10 && X<=20)in++;
                else out++;
                i++;
            }
            System.out.println(in+" in");
            System.out.println(out+" out");
        }

    }
}