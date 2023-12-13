import java.util.Scanner;
public class BEE1080 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int A,maior,maiorp;
        maior=0;
        maiorp=1;
        for (int i=1; i<=2; i++){
            A = sc.nextInt();
            if (i==1){
                maior=A;
                maiorp=1;
            }else if (A>maior){
                maior = A;
                maiorp = i;
            }

        }
        System.out.println(maior+"\n"+maiorp);

    }
}
