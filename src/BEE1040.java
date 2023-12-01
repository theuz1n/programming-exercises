import java.util.Scanner;
import java.text.DecimalFormat;
public class BEE1040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        double n1,n2,n3,n4,media,media_final,n_exame;
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        n4 = sc.nextDouble();
        media = (n1*2+n2*3+n3*4+n4*1)/(10);
        System.out.println("Media: "+ df.format(media));
        if(media >= 7.0){
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else if (media>=5.0 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            n_exame = sc.nextDouble();
            System.out.println("Nota do exame: "+n_exame);
            media_final = (media + n_exame) / 2.0;
            if (media_final>=5.0) {
                System.out.println("Aluno aprovado.");
                System.out.println("Media final: "+media_final);
            }else
                System.out.println("Aluno reprovado\nMedia final: "+media_final);
        }

    }

}
