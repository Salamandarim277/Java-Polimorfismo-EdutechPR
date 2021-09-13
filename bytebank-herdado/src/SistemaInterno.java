
public class SistemaInterno {

	private int senha = 1010;
	
	public void autentica(Autenticavel f) {
		boolean autenticou = f.autentica(this.senha);
		if (autenticou) {
			System.out.println("Senha correta. Entrada no sistema liberada");	
		} else {
			System.out.println("Senha incorreta. Entrada no sistema bloqueada");
		}
	}
}
