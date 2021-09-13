
public class Cliente implements Autenticavel {
	
	private SistemaAutenticador autenticador;

    public Cliente() {
        this.autenticador = new SistemaAutenticador();
    }
    
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}


	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
