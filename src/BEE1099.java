import java.util.Scanner;

public class BEE1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,x,y,soma;
        n = sc.nextInt();

        for(int i=0; i<n; i++){
            soma=0;
            x = sc.nextInt();
            y = sc.nextInt();

            if(x>y){
                for(int j=y+1; j<x; j++) {
                    if (j % 2 != 0) {
                        soma += j;
                    }
                }
            } else
                for(int j=x+1; j<y; j++) {
                    if (j % 2 != 0) {
                        soma += j;
                    }

                }
            System.out.println(soma);
            }

        }

    }


