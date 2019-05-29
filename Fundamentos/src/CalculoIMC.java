import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
	
		double peso , altura , imc;
		System.out.println("Calculo IMC");
		Scanner leia = new Scanner (System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
		System.out.print("Digite o seu peso: ");
		peso = leia.nextDouble();
		System.out.print("Digite a sua altura: ");
		altura = leia.nextDouble();
		imc = peso /(altura * altura);
		System.out.print("IMC:" + formatador.format(imc));
		//Para criar um intervalo usamos o operador AND(&&)
		if (imc < 18.5) {
			System.out.println("Abaixo do peso");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("Peso normal");
		} else if (imc >= 25 && imc <30) {
			System.out.println("Acima do peso");
		} else {
			System.out.println("Obeso");
		}
		
			
		leia.close();

	}

}
