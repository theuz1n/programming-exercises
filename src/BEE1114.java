import java.util.Scanner;
public class BEE1114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha,pc;
        senha = 2002;
        pc = sc.nextInt();
        while(pc!=senha){
            System.out.println("Senha Invalida");
            pc = sc.nextInt();
        }System.out.println("Acesso Permitido");


    }
}
