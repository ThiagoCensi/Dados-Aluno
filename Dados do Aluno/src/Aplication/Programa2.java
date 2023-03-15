package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Estudante;

public class Programa2 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Estudante estudante = new Estudante();
		estudante.name = sc.nextLine();
		estudante.nota1 = sc.nextDouble();
		estudante.nota2 = sc.nextDouble();
		estudante.nota3 = sc.nextDouble();
		System.out.printf("Grade Final: %.2f Pontos%n", estudante.notaFinal());
		if (estudante.notaFinal() < 60.0) {
		System.out.println("REPROVADO");
		System.out.printf("Faltaram %.2f Pontos!", estudante.missingPoints());
		}
		else {
		System.out.println("APROVADO");
		}
		sc.close();

	}

}
