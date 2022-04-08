import java.util.Scanner;

public class palindromoTeste {
    public static void main (String[] args){
        Scanner digito = new Scanner(System.in);
        System.out.println("Qual palavra você acha que é um palindromo?");
        String palavra = digito.nextLine();
        String palavraInvertida = "";
        
        for (int i = palavra.length() - 1; i >= 0; i--){
            palavraInvertida += palavra.charAt(i);
        }
        if(palavra.equals(palavraInvertida)){
            System.out.println("Palindromo encontrado!");

        }else{
            System.out.println("Não é um palindromo!");
        }
    }
}