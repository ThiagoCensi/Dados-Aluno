package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Estudante;

public class Programa {

	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		Estudante estudante = new Estudante();
		
		System.out.println("Olá, para saber se o Aluno foi aprovado insira os dados abaixo");
		System.out.println();
		
		System.out.print("Nome do Aluno: ");
		estudante.name = sc.nextLine();
		System.out.println();
		
		System.out.print("Nota 1: ");
		estudante.nota1 = sc.nextDouble();
		System.out.println();
		
		System.out.print("Nota 2: ");
		estudante.nota2 = sc.nextDouble();
		System.out.println();
		
		System.out.print("Nota 3: ");
		estudante.nota3 = sc.nextDouble();
		System.out.println();
		
		if (estudante.notaFinal() < 60.00) {
			
			double reprovado;
			
			reprovado = 60.00 - estudante.notaFinal();
			
			System.out.println(String.format("Nota Final: " + "%.2f" + " Pontos", estudante.notaFinal()));
			System.out.println("REPROVADO!");
			System.out.println(String.format("Faltaram: " + "%.2f" + " Pontos", reprovado));
			
			} 
		else {

			System.out.println(String.format("Nota Final: " + "%.2f" + " Pontos", estudante.notaFinal()));
			System.out.println("APROVADO !");
		}
		
		
		sc.close();
	}

}
