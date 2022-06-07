import java.util.Stack;
import java.util.Scanner;

public class Inverter {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira uma frase:");
        
	String frase = ler.nextLine();
        
	System.out.println("\nAntes da inversão:\n" + frase);
        
	Stack<Character> pilhaCaracteres = new Stack<Character>();
        
	for (int i = 0; i < frase.length(); i++){ 
            pilhaCaracteres.push(frase.charAt(i));
        }
        StringBuilder fraseInvertida = new StringBuilder();
        
        while(!pilhaCaracteres.empty()){
            fraseInvertida.append(pilhaCaracteres.pop());
        }
        
        System.out.println("\nFrase invertida:");
        
        System.out.print(fraseInvertida);
        
	System.out.println();
        
    }
}
