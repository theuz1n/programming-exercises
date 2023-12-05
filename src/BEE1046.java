import java.util.Scanner;
public class BEE1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Hi,Hf;
        Hi = sc.nextInt();
        Hf= sc.nextInt();

        if (Hi>Hf){
            System.out.println("O JOGO DUROU " + (24-(Hi-Hf))+ " HORA(S)");

        } else if (Hf>Hi) {
            System.out.println("O JOGO DUROU " + (Hi-Hf)+ " HORA(S)");
        }else
            System.out.println("O JOGO DUROU 24 HORA(S)");



    }
}
