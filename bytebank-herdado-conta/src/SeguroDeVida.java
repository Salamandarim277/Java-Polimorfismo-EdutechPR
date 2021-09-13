
public class SeguroDeVida implements Tributavel {

	double valorDoSeguro = 1000;
	
	@Override
	public double getValorDoImposto() {	
		return valorDoSeguro * 0.10;
	}

}
