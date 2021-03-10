
import java.util.Scanner;


public class Idade {

    public static void main(String[] args)  {
        int idade;
        int soma =0;
        int cont=0;
        Scanner prompt= new Scanner(System.in);
        do{
            idade=prompt.nextInt();
            if(idade>0){
            soma+= idade;
            cont++;
            }
        }while(idade>0);
        double media = (double) soma/cont;
        System.out.printf("%.2f\n",media );

    }

}