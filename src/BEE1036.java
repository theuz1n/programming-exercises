import java.util.Scanner;
public class BEE1036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A,B,C,delta,R1,R2;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        if ( A==0 || (B*B)-(4*A*C)<0  ){
            System.out.println("Impossivel calcular");
        }
        else {
            delta = Math.sqrt((B * B) - 4 * A * C);
            R1= (-B +delta) / (2*A);
            R2 = (-B -delta) / (2*A);
            System.out.printf("R1 = %.5f\n",R1);
            System.out.printf("R2 = %.5f\n",R2);
        }

    }
}
