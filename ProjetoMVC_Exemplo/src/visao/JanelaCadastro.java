package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class JanelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField fieldCodigo;
	private JTextField fieldNome;
	private JTextField fieldCnpj;
	private JTextField fieldEndereco;
	private JButton btnSalvar;
	private JButton btnSair;

	public JanelaCadastro() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(JanelaCadastro.class.getResource("/figuras/main-icon.png")));
		setTitle("Empresa de TI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 611, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlightText);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblImagem = new JLabel("");
		lblImagem.setBounds(0, 0, 120, 100);
		try {
			lblImagem.setIcon(new ImageIcon(ImageIO.read(JanelaCadastro.class.getResource("/figuras/main-logo.png")).getScaledInstance(lblImagem.getWidth(), lblImagem.getHeight(), BufferedImage.TYPE_INT_RGB)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		panel.setLayout(new MigLayout("", "[100px,grow][310px,grow]", "[90.00px]"));
		panel.add(lblImagem, "cell 0 0,alignx center,aligny center");
		
		JLabel lblTitulo = new JLabel("CADASTRO DE CLIENTES");
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblTitulo, "cell 1 0,alignx center,aligny center");
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel2, BorderLayout.CENTER);
		panel2.setLayout(new MigLayout("", "[100px][]", "[][][][][15][15][15][]"));
		
		JLabel lblCodigo = new JLabel("C\u00F3digo");
		lblCodigo.setFont(new Font("Arial", Font.PLAIN, 14));
		panel2.add(lblCodigo, "cell 0 0");
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 14));
		panel2.add(lblNome, "cell 1 0");
		
		fieldCodigo = new JTextField();
		fieldCodigo.setForeground(Color.BLACK);
		fieldCodigo.setFont(new Font("Arial", Font.PLAIN, 12));
		panel2.add(fieldCodigo, "cell 0 1,growx");
		fieldCodigo.setColumns(10);
		
		fieldNome = new JTextField();
		fieldNome.setFont(new Font("Arial", Font.PLAIN, 12));
		panel2.add(fieldNome, "cell 1 1, pushx, growx, alignx left");
		fieldNome.setColumns(10);
		
		JLabel lblCnpj = new JLabel("CNPJ");
		lblCnpj.setFont(new Font("Arial", Font.PLAIN, 14));
		panel2.add(lblCnpj, "cell 0 3");
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o");
		lblEndereco.setFont(new Font("Arial", Font.PLAIN, 14));
		panel2.add(lblEndereco, "cell 1 3");
		
		fieldCnpj = new JTextField();
		fieldCnpj.setFont(new Font("Arial", Font.PLAIN, 12));
		panel2.add(fieldCnpj, "cell 0 4,growx,alignx left");
		fieldCnpj.setColumns(10);
		
		fieldEndereco = new JTextField();
		fieldEndereco.setFont(new Font("Arial", Font.PLAIN, 12));
		panel2.add(fieldEndereco, "cell 1 4,pushx ,growx");
		fieldEndereco.setColumns(10);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnSalvar.setIcon(new ImageIcon(JanelaCadastro.class.getResource("/figuras/save-icon.png")));
		panel2.add(btnSalvar, "flowx,cell 1 7,alignx right");
		
		btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Arial", Font.PLAIN, 14));
		btnSair.setIcon(new ImageIcon(JanelaCadastro.class.getResource("/figuras/exit-icon.png")));
		panel2.add(btnSair, "cell 1 7,alignx right");
	}

	public JTextField getFieldCodigo() {
		return fieldCodigo;
	}

	public void setFieldCodigo(JTextField fieldCodigo) {
		this.fieldCodigo = fieldCodigo;
	}

	public JTextField getFieldNome() {
		return fieldNome;
	}

	public void setFieldNome(JTextField fieldNome) {
		this.fieldNome = fieldNome;
	}

	public JTextField getFieldCnpj() {
		return fieldCnpj;
	}

	public void setFieldCnpj(JTextField fieldCnpj) {
		this.fieldCnpj = fieldCnpj;
	}

	public JTextField getFieldEndereco() {
		return fieldEndereco;
	}

	public void setFieldEndereco(JTextField fieldEndereco) {
		this.fieldEndereco = fieldEndereco;
	}

	public JButton getBtnSalvar() {
		return btnSalvar;
	}

	public void setBtnSalvar(JButton btnSalvar) {
		this.btnSalvar = btnSalvar;
	}

	public JButton getBtnSair() {
		return btnSair;
	}

	public void setBtnSair(JButton btnSair) {
		this.btnSair = btnSair;
	}
	
	public void avisoCadastro(boolean sinal) {
		
		if(sinal) {
			JOptionPane.showMessageDialog(this, "Cliente salvo!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(this, "Não foi possível salvar o cliente!", "Aviso", JOptionPane.ERROR_MESSAGE);
		}
		
	}

}
