import java.util.Scanner;
public class BEE1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N,cobaias,TotalCobaias;
        double TotalC,TotalS,TotalR,TotalPorc_C,TotalPorc_S,TotalPorc_R;
        String tipo;
        TotalPorc_C=0;
        TotalPorc_S=0;
        TotalPorc_R=0;
        cobaias=0;
        TotalC=0;
        TotalS=0;
        TotalR=0;
        TotalCobaias=0;
        N = sc.nextInt();
        for (int i = 0; i<N; i++ ){
            cobaias= sc.nextInt();
            tipo = sc.next();
            TotalCobaias+=cobaias;
            if(tipo.equals("C") || tipo.equals("c")){
                TotalC+=cobaias;
            }if (tipo.equals("S") ||tipo.equals("s")) {
                TotalS+=cobaias;
            }if(tipo.equals("R") || tipo.equals("r")) {
                TotalR += cobaias;
            }
            TotalPorc_C = ((TotalC*100)/TotalCobaias);
            TotalPorc_S = ((TotalS*100)/TotalCobaias);
            TotalPorc_R = ((TotalR*100)/TotalCobaias);
        }
        System.out.println("Total: "+TotalCobaias+ " cobaias");
        System.out.printf("Total de coelhos: %.0f\n",TotalC);
        System.out.printf("Total de ratos: %.0f\n",TotalR);
        System.out.printf("Total de sapos: %.0f\n",TotalS);
        System.out.printf("Percentual de coelhos: %.2f ",(TotalPorc_C));
        System.out.print("%\n");
        System.out.printf("Percentual de ratos: %.2f ",TotalPorc_R);
        System.out.print("%\n");
        System.out.printf("Percentual de sapos: %.2f ",(TotalPorc_S));
        System.out.print("%\n");




    }
}
