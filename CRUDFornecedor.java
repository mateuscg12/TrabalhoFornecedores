import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CRUDFornecedor {
	
	public static void criarTela() {
		
		JFrame tela = new JFrame("Cadastro De Fornecedores");
		tela.setSize(500, 500);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(new FlowLayout());
		tela.setLocationRelativeTo(null);
		
		criarFormulario(tela);
		
		tela.setVisible(true);
		
	}
	
	public static void criarFormulario(JFrame tela) {
		JLabel lblNome = new JLabel("Nome Do Fornecedor:");
		JTextField fieldNome = new JTextField(25);
		
		JLabel lblEmail =  new JLabel("Email Do Fornecedor: ");
		JTextField fieldEmail = new JTextField(25);
		
		JButton btnSalvar = new JButton("Salvar"); 
		JButton btnCancelar = new JButton("Cancelar");
		
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String strNome = fieldNome.getText();
				String strEmail = fieldEmail.getText();
				
//				clsFornecedor fornecedor = new clsFornecedor(strNome, strEmail);
				
				clsFornecedor.criarFornecedor(strNome, strEmail);
			}
		});
		
		tela.add(lblNome);
		tela.add(fieldNome);
		tela.add(lblEmail);
		tela.add(fieldEmail);
		tela.add(btnSalvar);
		tela.add(btnCancelar);
		
		
	}

	public static void main(String[] args) {
		criarTela();
		
		
	}
}
