import java.util.Scanner;
public class P404 {
    public static void main(String[] args) {
       
        try (Scanner ler = new Scanner(System.in)) {
            int[][] N = new int[10][10];
            int L, c, t;
            L = 0;
            c = 0;
            t = 0;
            int x = L+1;

            for(L=0;L<=9;L++) {
                for (c=0;c<=9;c++) {
                    System.out.println("Entre com o elemento linha: " + (L + 1) + " Coluna: " +(c + 1));
                    N[L][c] = ler.nextInt();
                }
            }

            System.out.println("Acima da diagonal principal");
            t = 0;
            L = 0;
            c = L+1;
            do {
                do {
               
                System.out.print("\t" + N[L][x]);   
                c++;  
                } while ( c <= 9);
                
                System.out.println();
                do {
                    System.out.print("\t");
                    t++;  
                } while ( t <= L);

            t = 0;
            L++;
            } while (L <= 8);
        }
        System.out.println();
    }

}

