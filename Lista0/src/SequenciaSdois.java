public class SequenciaSdois {
    public static void main(String[] args) {
        double a,b=1,c, soma=0;
        for(a=1; a<=39; a+=2)
        { c=a/b;
            soma+=c;
            b*=2; }

        System.out.printf("%.2f\n",soma );
    }
}