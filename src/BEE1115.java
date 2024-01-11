import java.util.Scanner;
public class BEE1115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,y,stop;
        stop=0;
        while((x=sc.nextDouble())!=stop && (y= sc.nextDouble())!=stop){

            if (x > 0 && y > 0 ){
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");

            } else if (x < 0 && y < 0) {
                System.out.println("terceciro");
            }else if (y < 0 && x > 0) {
                System.out.println("quarto");
            }
        }

    }


}

