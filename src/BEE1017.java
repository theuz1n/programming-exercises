import java.util.Scanner;
public class BEE1017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Time, mv;
        double combustivel;
        Time = sc.nextInt();
        mv = sc.nextInt();
        combustivel = (Time*mv)/12.0;
        System.out.printf("%.3f\n",combustivel);


    }
}
