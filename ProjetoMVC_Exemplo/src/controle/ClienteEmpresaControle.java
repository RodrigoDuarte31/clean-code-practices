package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.ClienteEmpresaDAO;
import modelo.ClienteEmpresa;
import visao.JanelaCadastro;

public class ClienteEmpresaControle implements ActionListener {

	private ClienteEmpresa cliente;
	private JanelaCadastro janela;
	private ClienteEmpresaDAO clienteDAO;
	
	public ClienteEmpresaControle(ClienteEmpresa cliente, JanelaCadastro janela) {
		this.janela = janela;
		this.cliente = cliente;
		clienteDAO = new ClienteEmpresaDAO();
		
		this.janela.getBtnSalvar().addActionListener(this);
		this.janela.getBtnSair().addActionListener(this);
	}
	
	public void salvar() {
		
		String codigo = this.janela.getFieldCodigo().getText();
		String nome = this.janela.getFieldNome().getText();
		String cnpj = this.janela.getFieldCnpj().getText();
		String endereco = this.janela.getFieldEndereco().getText();
		
		cliente = new ClienteEmpresa(codigo, nome, cnpj, endereco);
		
		boolean resultado = clienteDAO.salvarClienteEmpresa(cliente);
		
		if(resultado) {
			janela.avisoCadastro(true);
		} else {
			janela.avisoCadastro(false);
		}
		
		limparCampos();
	}
	
	public void limparCampos() {
		this.janela.getFieldCodigo().setText("");
		this.janela.getFieldNome().setText("");
		this.janela.getFieldCnpj().setText("");
		this.janela.getFieldEndereco().setText("");
	}
	
	public void sair() {
		System.exit(0);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Salvar")) {
			salvar();
		} else if(e.getActionCommand().equals("Sair")) {
			sair();
		}
	}
	
}
