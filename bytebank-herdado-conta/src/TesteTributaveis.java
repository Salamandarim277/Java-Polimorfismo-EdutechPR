
public class TesteTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(1000);		
		SeguroDeVida sv = new SeguroDeVida();
		
		CalculadorDeImposto calculador = new CalculadorDeImposto();
		calculador.calculaImposto(sv);
		calculador.calculaImposto(cc);
		
		System.out.println(calculador.getValorTotalDosImpostos());
	}
}
