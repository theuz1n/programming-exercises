import java.util.Scanner;
public class BEE1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N,A;
        N = sc.nextInt();
        for (int i = 0; i<=N; i++){
            A = sc.nextInt();
            if (A>0 && A%2==0){
                System.out.println(A+" EVEN POSITIVE");
            } else if (A<0 && A%2==0) {
                System.out.println(A+" EVEN NEGATIVE");
            } else if (A>0 && A%2!=0) {
                System.out.println(A+" ODD POSITIVE");
                
            } else if(A<0 && A%2!=0) {
                System.out.println(A + " ODD NEGATIVE");
            }else
                System.out.println(A+" NULL");

        }
    }

}
