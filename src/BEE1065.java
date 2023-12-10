import java.util.Scanner;
public class BEE1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A,count;
        count=0;
        for (int i=0; i<5; i++){
            A = sc.nextInt();
            if (A%2==0){
                count++;
            }

        }
    System.out.println(count+ " valores pares");
    }
}
