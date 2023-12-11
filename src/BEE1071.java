import java.util.Scanner;
public class BEE1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,min,max,soma;
        x = sc.nextInt();
        y = sc.nextInt();
        soma=0;
        
        if(x<y){
            min=x;
            max=y;
        } else
            max = x;
            min = y;

        for(int i=min+1; i<max; i++){
            if(i%2!=0){
                soma+=i;
            }

        }
        System.out.println(soma);
    }
}
