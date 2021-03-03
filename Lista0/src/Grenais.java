import java.util.Scanner;
public class Grenais {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int gremio,inter;
        int goli=0, golg=0, grenal=0,ver;
        int cont1=0;
        int cont2=0;
        int empate=0;

        while(1==1)
        {

            inter = prompt.nextInt();
            gremio =prompt.nextInt();
            if(inter>gremio) cont1++;
            if(inter<gremio) cont2++;
            if(inter==gremio) empate++;
            goli+=inter;
            golg+=gremio;
            grenal++;
            System.out.printf("Novo grenal (1-sim 2-nao)\n");
            ver = prompt.nextInt();
            if(ver==1)
                continue;
            if(ver==2)
                break;

        }
        System.out.printf("%d grenais\n", grenal);
        System.out.printf("Inter:%d\n",cont1);
        System.out.printf("Gremio:%d\n",cont2);
        System.out.printf("Empates:%d\n",empate);
        if(cont1>cont2)
            System.out.printf("Inter venceu mais\n");
        if(cont1<cont2)
            System.out.printf("Gremio venceu mais\n");
        if(cont1==cont2)
            System.out.printf("Nao houve vencedor\n");
    }
}