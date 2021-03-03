import java.util.Scanner;
public class NumeroPrimo {
    public static void main(String[] args) {

        Scanner prompt = new Scanner(System.in);
        int vezes = prompt.nextInt();

        for (int a = 0; a < vezes; a++) {
            int numero = prompt.nextInt();
            int d = 0;
            for (int i = 1; i <= numero; i++) { if (numero % i == 0)  d++; }
            if (d == 2) System.out.println(numero + " eh primo");
            else  System.out.println(numero + " nao eh primo");
        }
    }
}