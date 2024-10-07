package application;

public class Program {

	public static void main(String[] args) {
		
		double faturamentoSP = 67836.43, faturamentoRJ = 36678.66, faturamentoMG = 29229.88, faturamentoES = 27165.48, outrosFaturamentos = 19849.53;
		
		double total = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + outrosFaturamentos;
		
		double porcSP = (100 * faturamentoSP) / total;
		double porcRJ = (100 * faturamentoRJ) / total;
		double porcMG = (100 * faturamentoMG) / total;
		double porcES = (100 * faturamentoES) / total;
		double porcOutros = (100 * outrosFaturamentos) / total;
		
		System.out.println("Porcentagem SP: " + String.format("%.0f", porcSP) + "%");
		System.out.println("Porcentagem RJ: " + String.format("%.0f", porcRJ) + "%");
		System.out.println("Porcentagem MG: " + String.format("%.0f", porcMG) + "%");
		System.out.println("Porcentagem ES: " + String.format("%.0f", porcES) + "%");
		System.out.println("Porcentagem Outros: " + String.format("%.0f", porcOutros) + "%");
		
	}

}
