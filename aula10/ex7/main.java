import java.util.Random;

public class exc7 {
    public static void main(String[] args) {
        Fila fila = new Fila();
        Random rdm = new Random();
        Fila filaInvertida = new Fila();

        for(int i=0; i<20; i++){
            fila.push(rdm.nextInt());
        }
        

        System.out.println("Fila antes de ser invertida:");
        while(!fila.empty()){
            filaInvertida.push(fila.peek());
            System.out.println(fila.pop());
        }
        
        filaInvertida.inverterFila();
        
        System.out.println("\nFila Invertida:");
        while(!filaInvertida.empty()){
            System.out.println(filaInvertida.pop());
        }
    }

}
