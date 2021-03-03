import java.util.Scanner;
public class TipoCombustivel {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int i=0;
        int gasolina=0, alcool=0, diesel=0;


        do{
            int combustivel= prompt.nextInt();
            if(combustivel==1)alcool++;
            if(combustivel==2)gasolina++;
            if(combustivel==3)diesel++;
            if(combustivel==4)break;


        }while(true);
        System.out.println("MUITO OBRIGADO\n"+ "Alcool: "+alcool+"\n"+"Gasolina: "+gasolina+"\n"+"Diesel: "+diesel);
    }
}