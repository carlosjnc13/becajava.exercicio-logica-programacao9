package exercicioLogicaProgramacao9;

import java.util.Scanner;

public class Percentuais {

	public Scanner Leitor = new Scanner(System.in);
	private int totalEleitores;
	private double votosValidos;
	private double votosBrancos;
	private double votosNulos;
	
	public void setVotos() {
		
		 System.out.println("Total de eleitores: ");
		 totalEleitores = Leitor.nextInt();
		 System.out.println("Total de votos validos: ");
		 votosValidos = Leitor.nextInt();
		 System.out.println("Total de votos em branco: ");
		 votosBrancos = Leitor.nextInt();
		 System.out.println("Total de votos nulos: ");
		 votosNulos = Leitor.nextInt();	
	}
	public double percentualValidos() {
		 return (votosValidos/totalEleitores) * 100;
		  
	}
	public double percentualBrancos() {
		return (votosBrancos/totalEleitores) * 100;
		
	}
	public double percentualNulos() {
		return (votosNulos/totalEleitores) * 100;
		
	}

}
