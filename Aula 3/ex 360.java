import java.util.Scanner;
public class P360 {
    public static void main(String[] args) {       
        try (Scanner ler = new Scanner(System.in)) {
            int dia, data,  mes;
            int i = 0;
            int[] ultdia = new int[12];
            String[] signo = new String[12];    
             
            for(i=0;i<12;i++){
             System.out.println("Digite signo");      
                signo[i] = ler.next();
             System.out.println("Digite ultimo dia: ");
                ultdia[i] = ler.nextInt();
            } 
            
            System.out.println("Digite data no formato ddmm ou 9999 para terminar: ");
             data =  ler.nextInt();
    
            do {
                dia = data/100;
                mes = data % 100;                        
                mes--;
    
                if (dia > ultdia[mes]) {
                    mes = (mes + 1) % 12;               
                }
                    System.out.println("Signos : " + signo[mes] + "\n");
                    System.out.println("Digite data formato ddmm ou 9999 para terminar: ");
                    data = ler.nextInt();
                    System.out.println();   
            } while (data != 9999);
        }
    
        }
}
