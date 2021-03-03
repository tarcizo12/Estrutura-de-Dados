import java.util.ArrayList;
import java.util.Scanner;
public class MaiorePosicao {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int i=0;
        ArrayList<Integer> numeros= new ArrayList<>();
        int maior=0;
        int menor=999999999;
        int indexmaior = 0;
        while (i<100){
            int valor= prompt.nextInt();
            numeros.add(valor);
            if(numeros.get(i)>maior){
                maior= numeros.get(i);
                indexmaior= i+1;
            }
            if(menor>numeros.get(i)){
                menor=numeros.get(i);
            }


            i++;
        }

        System.out.println(maior);
        System.out.println(indexmaior);
    }
}
