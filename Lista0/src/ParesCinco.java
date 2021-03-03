import java.util.Scanner;
public class ParesCinco {

    public static void main(String[] args)  {

        Scanner prompt= new Scanner(System.in);
        double i=0;
        int quant=0;
        double somador=0;
        while(i<5){
            double  numero = Float.parseFloat(prompt.nextLine());
            if(numero%2==0){
                quant++;
            }
            i++;

        }

        System.out.println(quant+" valores pares");
    }

}