import java.util.Scanner;
public class BEE1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A, B, C, P,Ap;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        if (( C < (A+B)) && (A < (B+C)) && (B < (C+A)) ) {
            P = (A + B + C);
            System.out.println("Perimetro = "+P);
        }
        else{
            Ap =  (A+B)*C/2;
            System.out.println("Area = "+Ap);
        }


    }
}
