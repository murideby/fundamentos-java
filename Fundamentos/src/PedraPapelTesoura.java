import java.util.Scanner;

public class PedraPapelTesoura {

	public static void main(String[] args) {
		// lógica do jogador
		int jogador;
		Scanner mao = new Scanner(System.in);
		System.out.println("________________");
		System.out.println("_____JoKenPo____");
		System.out.println("_________________");
		System.out.println("1.Pedra");
		System.out.println("2.Papel");
		System.out.println("3.Tesoura");
		System.out.println("Digite a opção desejada: ");
		jogador = mao.nextInt();
		switch (jogador) {
		//estrutura switch case admite apenas tipo int e char
		case 1:
			System.out.println("jogador escolheu PEDRA");
			break;
		case 2:
			System.out.println("jogador escolheu PAPEl");
			break;
		case 3:
			System.out.println("jogador escolheu TESOURA");
			break;
		default:
			System.out.println("Opção inválida");
		
		}
		//lógica do computador
		//a linha abaixo gera números aleatórios entre 0 e 2
		//(int) converte para inteiros (casting)
		//+1 soma 1 ao resultado (1 ou 2 ou 3)
		int computador =(int)(Math.random() * 3 + 1);
		switch (computador) {
		
		case 1:
			System.out.println("Computador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Computador escolheu PAPEl");
			break;
		case 3:
			System.out.println("Computador escolheu TESOURA");
			break;
		}
		//lógica para determinar o vencedor ou empate
		if(jogador == computador) {
			System.out.println("EMPATE");
		}else{
			if((jogador == 1 && computador == 3) ||(jogador == 2 && computador == 1 ) || (jogador == 3 && computador == 2) ) {
			System.out.println("JOGADOR VENCEU");	
		}else{
			System.out.println("COMPUTADOR VENCEU");
		}
		}
		mao.close();
		

	}
	}


