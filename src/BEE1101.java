import java.util.Scanner;
public class BEE1101 {
    public static void main(String[] args) {
        int sum,m,n;
        Scanner sc = new Scanner(System.in);

        while( (m = sc.nextInt()) > 0 && (n = sc.nextInt()) > 0){

            sum=0;
            if (m>n){
                for(int i=n; i<=m; i++){
                    sum+=i;
                    System.out.print(i+" ");
                }//System.out.println("Sum="+sum+"\n");
            }else
                for (int i=m; i<=n; i++) {
                    sum += i;
                    System.out.print(i + " ");
                }System.out.println("Sum="+sum+"\n");
        }

    }
}


