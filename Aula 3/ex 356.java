import java.util.Scanner;      
public class P356 {
    public static void main(String args[]) {
        var ler = new Scanner(System.in);
        int L, c, t;
        int media [] = new int [15];
        String nome [] = new String[15];
        String sit []= new String[15];
        float pr1 [] = new float[15];
        float pr2 [] = new float[15];
        
        for (L=0; L<=14; L++){
            System.out.println("Digite " + (L+1)+ "nome:");
            nome[L] = ler.nextLine();
            while ((nome[L].length()) > 30){
                System.out.println("Nomes com até 30 caracteres");
                System.out.println("DIgite "+(L+1)+ "nome:");
                nome[L] = ler.nextLine();
            }
            t=30 - nome[L].length();
            for(c=1;c<=t;c++){
                nome[L] = nome[L].concat(" ");
            }
            System.out.println("Digite 1 nota: ");
            pr1[L] = ler.nextFloat();
            System.out.println("Digite 2 nota: ");
            pr2[L] = ler.nextFloat();
            media[L] = (int)((pr1[L] + pr2[L])/2);
            if(media[L]>=5){
                sit[L]="AP";
            }else{
                sit[L] = "RP";
            }
        }
        System.out.println("Relação final");
        for(L=0; L<=14; L++){
            System.out.println((L + 1) + " - " + nome[L] + "\t" + pr1[L] + "\t" + pr2[L] + "\t" + media[L] + "\t" + sit[L]);
        }
    }
}
