import java.util.Scanner;
public class BEE1060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = 0;
        for (int i = 0; i<6; i++){
            double a = sc.nextDouble();
            if (a>0){
                pos++;
            }

        }
        System.out.println(pos+" valores positivos");
    }
}
