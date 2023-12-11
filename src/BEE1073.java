import java.util.Scanner;
public class BEE1073 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int N,R;
        N= sc.nextInt();
        for (int i = 1; i<=N; i++){
            if(i%2==0){
                R=i*i;
                System.out.println(i+"^2 = "+R);
            }

        }
    }
}
