import java.util.Scanner;
public class ParesImpares {
    public static void main(String[] args)  {

        Scanner prompt= new Scanner(System.in);
        int i=0;
        int impar=0,par=0,positv=0,negativ=0;
        while(i<5) {
            int numero = prompt.nextInt();
            if(numero>0){positv++;}
            if(numero<0){negativ++;};
            if(numero%2==0){par++;};
            if(numero%2!=0){impar++;};
            i++;
        }
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positv + " valor(es) positivo(s)");
        System.out.println(negativ + " valor(es) negativo(s)");
    }

}