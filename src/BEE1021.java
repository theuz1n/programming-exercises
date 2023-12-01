import java.util.Scanner;
public class BEE1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dinheiro,troco;
        dinheiro = sc.nextDouble();
        System.out.println(dinheiro);

        troco=dinheiro/100.00;
        System.out.printf("%.2f  nota(s) de R$ 100,00\n",troco);
        dinheiro %= 100.00;

        troco=dinheiro/50;
        System.out.printf("%.2f nota(s) de R$ 50,00\n",troco);
        dinheiro %= 50.0;

        troco=dinheiro/20.0;
        System.out.printf("%.2f nota(s) de R$ 20,00\n",troco);
        dinheiro %= 20.0;

        troco=dinheiro/10.0;
        System.out.printf("%.2f nota(s) de R$ 10,00\n",troco);
        dinheiro %= 10.0;

        troco=dinheiro/5.0;
        System.out.printf("%.2f nota(s) de R$ 5,00\n",troco);
        dinheiro %= 5.0;

        troco=dinheiro/2.0;
        System.out.printf("%.2f nota(s) de R$ 2,00\n",troco);
        dinheiro %= 2.0;

        System.out.printf("Moedas: ");

        troco=dinheiro/1.0;
        System.out.printf("%.2f moeda(s) de R$ 1,00\n",troco);
        dinheiro%=1.0;

        troco = dinheiro/0.50;
        System.out.printf("%.2f moeda(s) de R$ 0,50\n",troco);
        dinheiro%=0.50;

        troco = dinheiro/0.25;
        System.out.printf("%.2f moeda(s) de R$ 0,25\n",troco);
        dinheiro%=0.25;

        troco = dinheiro/0.10;
        System.out.printf("%.2f moeda(s) de R$ 0,10\n",troco);
        dinheiro%=0.10;

        troco = dinheiro/0.05;
        System.out.printf("%.2f moeda(s) de R$ 0,05\n",troco);
        dinheiro%=0.05;

        troco = dinheiro/0.01;
        System.out.printf("%.2f moeda(s) de R$ 0,01\n",troco);

    }
}
