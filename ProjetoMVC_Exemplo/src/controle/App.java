package controle;

import modelo.ClienteEmpresa;
import visao.JanelaCadastro;

public class App {
	
	public static void main(String[] args) {
		
		ClienteEmpresa cliente = new ClienteEmpresa();
		JanelaCadastro janela = new JanelaCadastro();
		janela.setVisible(true);
		ClienteEmpresaControle controle = new ClienteEmpresaControle(cliente, janela);
		
	}

}
