package aplication;

import java.util.Scanner;

import entities.Calculator;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Menu: \n 1- soma\n 2- subtraçao \n 3- multiplicaçao \n 4- divisao");
		int opt = sc.nextInt();
		System.out.println("Digite o primeiro numero:");
		double num1 = sc.nextDouble();
		
		System.out.println("Digite o segundo numero:");
		double num2 = sc.nextDouble();
		Calculator cal = new Calculator(num1, num2);
		
		switch (opt) {
		case 1:
			System.out.println(cal.somar());
			break;
			
		case 2:
			System.out.println(cal.subtrair());
			break;

		case 3:
			System.out.println(cal.multiplicar());
			break;

		case 4:
			System.out.println(cal.dividir());
			break;

		default:
			System.out.println("opçao invalida");
			break;
		}
		
		sc.close();
	}

}
