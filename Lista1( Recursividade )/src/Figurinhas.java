import java.util.Scanner;

public class Figurinhas {

    public static int MDC(int a, int b) {
        if (b == 0) return a;
        int resto = a % b;
        a = b;
        b = resto;
        return MDC(a, b);
    }

    public static void main(String[] args) {
        Scanner prompt= new Scanner(System.in);
        int rep= prompt.nextInt();

        for (int i = 0; i < rep; i++) {
            int a= prompt.nextInt();
            int b= prompt.nextInt();
            System.out.println(MDC(a, b));
        }

    }
}

