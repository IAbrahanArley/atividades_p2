package aplication;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Seu nome:");
		String nome = sc.nextLine();
		System.out.println("Digite a primeira nota");
		int nota1 = sc.nextInt();
		System.out.println("digite a segunda nota:");
		int nota2 = sc.nextInt();
		System.out.println("digite a terceira nota:");
		int nota3 = sc.nextInt();
		
		Aluno aluno = new Aluno(nome, nota1, nota2, nota3);
		
		System.out.println(aluno.calcularMedia());
		sc.close();

	}

}
