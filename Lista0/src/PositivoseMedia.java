import java.util.Scanner;
public class PositivoseMedia {

    public static void main(String[] args)  {

        Scanner prompt= new Scanner(System.in);
        double i=0;
        int quant=0;
        double somador=0;
        while(i<6){
            double  numero = Float.parseFloat(prompt.nextLine());
            if(numero>0){
                somador = numero+somador;
                quant++;
            }
            i++;

        }
        double media= somador/quant;

        System.out.printf(quant + " valores positivos\n" +"%.1f\n", media);


    }

}