import java.util.Scanner;
public class Positivo {

    public static void main(String[] args) {

        Scanner prompt = new Scanner(System.in);
        double i = 0;
        int quant = 0;
        while (i < 6) {
            double numero = prompt.nextDouble();
            if (numero > 0) {
                quant++;
            }
            i++;
        }
        System.out.println(quant + " valores positivos");
    }

}