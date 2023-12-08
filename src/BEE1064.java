import java.util.Scanner;
public class BEE1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A,media,soma;
        int count = 0;

        soma=0;
        for(int i=0; i<6; i++){
            A = sc.nextDouble();
            if (A>0){
                soma+=A;
                count++;
            }
        }
        System.out.println(count+" valores positivos");
        media = soma/count;
        System.out.printf("%.1f", media);


    }
}
