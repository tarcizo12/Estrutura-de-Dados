import java.util.ArrayList;
import java.util.Scanner;
public class ImparesConsecutivos {
    public static void main(String[] args)  {
        Scanner prompt= new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer> ();

        int i=0, somador=0;
        int maior  = 0, menor  =0;
        int x= prompt.nextInt(), y=prompt.nextInt();

        if(x>y){
            maior= x;
            menor= y;
        }else{
            maior= y;
            menor= x;
        }
        int intervalo = maior-menor-1;
        int aux=menor+1;


        while(i<intervalo){
            numeros.add(aux++);
            if(numeros.get(i)%2!=0){
                somador=numeros.get(i)+somador;
            }
            i++;
        }
        System.out.println(somador);
    }

}
