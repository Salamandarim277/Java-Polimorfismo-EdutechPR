
public class CalculadorDeImposto {

	double valorTotalDosImpostos;
	
	public void calculaImposto (Tributavel conta) {
		valorTotalDosImpostos += conta.getValorDoImposto();
	}
	
	public double getValorTotalDosImpostos() {
		return valorTotalDosImpostos;
	}
	
}
