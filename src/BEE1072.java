import java.util.Scanner;
public class BEE1072 {
    public static void main(String[] args) {
        int A,B,x,N,countout,countin;
        Scanner sc = new Scanner(System.in);

        A=10;
        B=20;
        countout=0;
        countin=0;
        N= sc.nextInt();
        for (int i=0; i<N; i++){
            x = sc.nextInt();
            if(x<A || x>B){
                countout++;
            }else
                countin++;

        }
        System.out.println(countin+" in");
        System.out.println(countout+" out");
    }
}
