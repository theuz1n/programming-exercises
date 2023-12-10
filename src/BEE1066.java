import java.util.Scanner;
public class BEE1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,countP,countI,countN,countpos;
        countP=0;
        countI=0;
        countN=0;
        countpos=0;
        for (int i = 0; i<5; i++ ){
            A = sc.nextInt();
            if (A%2==0){countP++;}
            if(A%2!=0){countI++;}
            if (A<0){countN++;}
            if(A>0){countpos++;}
        }
        System.out.println(countP+" valor(es) par(es)");
        System.out.println(countI+" valor(es) impar(es)");
        System.out.println(countpos+" valor(es) positivo(s");
        System.out.println(countN+" valor(es) negativo(s)");


    }

}
