
public class TesteSistema {

	public static void main(String[] args) {
		 
		
		  Gerente g = new Gerente();
		  g.setSenha(1010);
		  
		  Administrador adm = new Administrador();	  
		  adm.setSenha(1000);
		  
		  SistemaInterno si = new SistemaInterno();
		  si.autentica(g); si.autentica(adm);
		 
	}

}
