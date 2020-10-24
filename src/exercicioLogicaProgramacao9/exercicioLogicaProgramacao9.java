package exercicioLogicaProgramacao9;

public class exercicioLogicaProgramacao9 {

	public static void main(String[] args) {
		
Percentuais percentuais = new Percentuais();
		
		percentuais.setVotos();
		
		System.out.println("Percentual de votos Validos: " +percentuais.percentualValidos() + "%");
		System.out.println("Percentual de votos em Branco: "+percentuais.percentualBrancos() + "%");
		System.out.println("Percentual de votos Nulos: "+percentuais.percentualNulos() + "%");

	}

}
