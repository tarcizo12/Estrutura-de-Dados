import java.util.Scanner;
public class Exp {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int experimentos = prompt.nextInt();
        int c=0,r=0,s=0;
        int quantos = 0;
        for (int i=0;i<experimentos;i++){

            quantos= prompt.nextInt();
            String letra= prompt.next();
            if(quantos>=1 && quantos<=15) {

                if (letra.equals("C")) c += quantos;
                if (letra.equals("R")) r += quantos;
                if (letra.equals("S")) s += quantos;
            };

        }
        if(quantos>=1 && quantos<= 15) {
            int total = c + r + s;
            double pc = (double) c / total * 100;
            double pr = (double) r / total * 100;
            double ps = (double) s / total * 100;
            String cformatado = String.format("%.2f", pc);
            String rformatado = String.format("%.2f", pr);
            String sformatado = String.format("%.2f", ps);
            System.out.println("Total: " + total + " cobaias");
            System.out.println("Total de coelhos: " + c);
            System.out.println("Total de ratos: " + r);
            System.out.println("Total de sapos: " + s);
            System.out.println("Percentual de coelhos: " + cformatado+" %");
            System.out.println("Percentual de ratos: " + rformatado+" %");
            System.out.println("Percentual de sapos: " + sformatado+" %");
        }
    }
}