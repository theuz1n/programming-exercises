import java.util.Scanner;
public class BEE1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dinheiro, troco;
        dinheiro = sc.nextInt();

        System.out.println(dinheiro);
        troco=dinheiro/100;
        System.out.println(troco+" nota(s) de R$ 100,00");
        dinheiro %= 100;

        troco=dinheiro/50;
        System.out.println(troco+" nota(s) de R$ 50,00");
        dinheiro %= 50;

        troco=dinheiro/20;
        System.out.println(troco+" nota(s) de R$ 20,00");
        dinheiro %= 20;

        troco=dinheiro/10;
        System.out.println(troco+" nota(s) de R$ 10,00");
        dinheiro %= 10;

        troco=dinheiro/5;
        System.out.println(troco+" nota(s) de R$ 5,00");
        dinheiro %= 5;

        troco=dinheiro/2;
        System.out.println(troco+" nota(s) de R$ 2,00");
        dinheiro %= 2;

        troco=dinheiro/1;
        System.out.println(troco+" nota(s) de R$ 1,00");
    }
}
