import java.util.Scanner;

public class LendaFlavious {
    static int jos(int n, int k){

        if (n == 1) return 1;
        else return ( (jos(n-1, k ) + k-1) %n+1);

    }

    public static void main(String[] args) {
        Scanner prompt= new Scanner(System.in);
        int rep =prompt.nextInt();
        if(rep>=1&&rep<=30){
            for (int i=1;i<=rep;i++){
                int n=prompt.nextInt();
                int k=prompt.nextInt();
                System.out.println("Case " + i + ": " + jos(n, k));

            }
        }
    }
}

