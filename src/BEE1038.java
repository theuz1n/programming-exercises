import java.util.Scanner;
public class BEE1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cod,qnt;
        cod = sc.nextInt();
        qnt = sc.nextInt();
        switch (cod){
            case 1:
                System.out.printf("Total: R$ %.2f\n",(qnt*4.00));
                break;
            case 2:
                System.out.printf("Total: R$ %.2f\n",(4.50*qnt));
                break;
            case 3:
                System.out.printf("Total: R$ %.2f\n",(5.00*qnt));
                break;
            case 4:
                System.out.printf("Total: R$ %.2f\n",(2.00*qnt));
                break;
            case 5:
                System.out.printf("Total: R$ %.2f\n",(1.50*qnt));
                break;

        }
    }
}
