import java.util.Scanner;
public class BEE1134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,alcool,gasolina,diesel,stop;
        stop=4;
        alcool=0;
        gasolina=0;
        diesel=0;
        while((a=sc.nextInt()) != stop){
            if (a == 1){
                alcool++;
            } else if (a == 2) {
                gasolina++;
            } else if (a == 3) {
                diesel++;
            }else if(a == 4){

                break;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+alcool+"\nGasolina: "+gasolina+"\nDiesel: "+diesel);
    }
}
