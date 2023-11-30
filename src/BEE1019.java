import java.util.Scanner;
public class BEE1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora,minutos,entrada,segundos_in,segundos;

        segundos_in = sc.nextInt();

        hora = segundos_in/3600;

        minutos = (segundos_in%3600)/60;

        segundos = segundos_in%60;

        System.out.printf("%d:%d:%d\n ",hora,minutos,segundos);


    }
}
