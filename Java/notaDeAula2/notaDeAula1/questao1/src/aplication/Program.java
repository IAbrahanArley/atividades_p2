package aplication;

import java.util.Scanner;

import entites.Funcionario;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Matricula:");
		int mat = sc.nextInt();
		System.out.println("Nome:");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.println("Salario:");
		double sal = sc.nextDouble();
		
		Funcionario func = new Funcionario(mat, nome, sal);
		
		System.out.println(func.toString());
		sc.close();
	}

}
