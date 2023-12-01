import java.util.Scanner;
public class BEE1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade,ano,mes,dias,resto;

        idade = sc.nextInt();

        ano = idade/365;
        resto = idade%365;

        mes = resto/30;

        dias = resto%30;
        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)",ano,mes,dias);
    }
}
