import java.util.Scanner;
public class BEE1042 {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner sc = new Scanner(System.in);

        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        if (n1 < n2 && n1 < n3) {
            System.out.println(n1);//menor numero até o momento
            if (n2<n3){
                System.out.println(n2);// numero do meio
                System.out.println(n3);
            }else {
                System.out.println(n3);// numero do meio
                System.out.println(n2);
            }
        } else if (n2<n3) {
            System.out.println(n2);
            if (n1<n3){
                System.out.println(n1);
                System.out.println(n3);
            }else{
                System.out.println(n3);
                System.out.println(n1);
            }
        }else {
            System.out.println(n3);
            if (n1 < n2) {
                System.out.println(n1);
                System.out.println(n2);
            } else {
                System.out.println(n2);
                System.out.println(n1);
            }
        }
        System.out.println("");
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }

}

