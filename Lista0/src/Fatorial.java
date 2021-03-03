import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int numero =prompt.nextInt();
        int fatorial= numero;
        if(numero>0 && numero<13) {
            while (numero > 1){
                fatorial = fatorial * (numero - 1);
                numero--;

            }
            System.out.println(fatorial);
        }

    }
}