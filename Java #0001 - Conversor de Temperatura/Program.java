package entities;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Temperature temperatura = new Temperature();
		
		System.out.println("--- Conversor de Temperatura em Celsius ---");
		System.out.println("");
		System.out.print("Informe o valor da Temperatura em ºC: ");
		Double celsius = sc.nextDouble();
		System.out.println("Em qual temperatura você quer converter este valor?");
		System.out.println("1 = Kelvin");
		System.out.println("2 = Réaumur");
		System.out.println("3 = Rankine");
		System.out.println("4 = Fahrenheit");
		Integer resposta = sc.nextInt();
		
		switch (resposta) {
		case 1:
			System.out.printf("Valor em Kelvin = %.2f%n",temperatura.conversorKelvin(celsius));
			break;
		case 2:
			System.out.printf("Valor em Réaumur = %.2f%n",temperatura.conversorReaumur(celsius));
			break;
		case 3:
			System.out.printf("Valor em Rankine = %.2f%n",temperatura.conversorRankine(celsius));
			break;
		case 4:
			System.out.printf("Valor em Fahrenheit = %.2f%n",temperatura.conversorFahrenheit(celsius));
			break;
		default:
			System.out.println("Entrada Inválida!");
		}
		
		sc.close();
		
	}

}
