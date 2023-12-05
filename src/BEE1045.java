import java.util.Scanner;
public class BEE1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A,B,C,aux;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        if (B>A){
            aux = A;
            A = B;
            B = aux;
            System.out.println(A);
        }if(C>A){
            aux = A;
            A = C;
            C = aux;
        }
        if (A>=(B+C)){
            System.out.println("NAO FORMA TRIANGULO");

        }else{
            if((A*A) > (B*B)+ (C*C)){
                System.out.println("TRIANGULO OBTUSANGULO");

            }else if((A*A) <  (B*B) + (C*C)){
                System.out.println("TRIANGULO ACUTANGULO");

            }else{
                System.out.println("TRIANGULO RETANGULO");
            }
            if (A==B && B==C){
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || A == C || B==C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }


    }
}
