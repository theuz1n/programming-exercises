import java.util.Scanner;
public class BEE1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();
        int count=0;
        for (int i=x; count<6; i++){
            if(i%2!=0){
                System.out.println(i);
                count++;
            }





        }
    }
}
