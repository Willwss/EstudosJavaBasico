import java.util.Random;
import java.util.Scanner;

public class Jokenpo{
    public static void main(String [] args) {
        
        System.out.println("***Bem vindo ao Pedra-Papel-Tesoura***");
        System.out.println("Voce jogara contra o computador......");
        System.out.println("");

        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();

        int numeroUsuario;
        int escolhaComputador; 
        int pontosUsuario = 0 ;
        int pontosPc = 0;
        
        for(int rodada = 0; rodada < 3; rodada++){
            
            System.out.println("******Placar Atual******");
            System.out.println("Jogador: " + pontosUsuario +" Computador: " +pontosPc);
            System.out.println("*************************");
            System.out.println("");
            System.out.println("Escolha sua Jogada:");
            System.out.println("1 - Pedra");
            System.out.println("2 - Papel");
            System.out.println("3 - Tesoura");
            System.out.println("Sua jogada:");

            numeroUsuario = leitor.nextInt();
            escolhaComputador = gerador.nextInt(3) + 1 ;

            switch(escolhaComputador){//
                case 1:
                    System.out.println("Computador escolheu pedra");
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Computador escolheu papel");
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Computador escolheu tesoura");
                    System.out.println(" ");
                    break;
            }

            switch(numeroUsuario){
                case 1:
                    System.out.println("A sua escolha foi pedra ");
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("A sua escolha foi papel ");
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("A sua escolha foi tesoura ");
                    System.out.println(" ");
                    break;
            }

            if(numeroUsuario == escolhaComputador){
                System.out.println("Empate");
            }

            /*VERIFICA TODAS AS CHANCES DO USUARIO PERDER*/

            else if (numeroUsuario == 1 && escolhaComputador == 2 || 
                     numeroUsuario == 2 && escolhaComputador == 3 || 
                     numeroUsuario == 3 && escolhaComputador == 1){

                System.out.println("Você perdeu");
                pontosPc++;

            /*VERIFICA TODAS AS CHANCES DO USUARIO GANHAR*/

            }else if(numeroUsuario == 1 && escolhaComputador == 3 ||
                     numeroUsuario == 2 && escolhaComputador == 1 ||
                     numeroUsuario == 3 && escolhaComputador == 2){

                System.out.println("Você ganhou");
                pontosUsuario++;
            }
            
        }

        System.out.println("******Placar Final******");
        
        if(pontosUsuario > pontosPc){
            System.out.println("Usuario vencedor do jogo");
        }
        
        else if(pontosUsuario < pontosPc){
            System.out.println("Computador vencedor do jogo");
        }
    }
}
