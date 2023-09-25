package visao;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import modelo.Pessoa;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPrimeiroNome;
	private JTextField txtSobrenome;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 348, 247);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbPrimeiroNome = new JLabel("Primeiro Nome");
		lbPrimeiroNome.setBounds(22, 34, 82, 20);
		lbPrimeiroNome.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		contentPane.add(lbPrimeiroNome);

		txtPrimeiroNome = new JTextField();
		txtPrimeiroNome.setBounds(114, 31, 86, 20);
		contentPane.add(txtPrimeiroNome);
		txtPrimeiroNome.setColumns(10);

		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setBounds(22, 65, 82, 20);
		lblSobrenome.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		contentPane.add(lblSobrenome);

		txtSobrenome = new JTextField();
		txtSobrenome.setBounds(114, 65, 86, 20);
		contentPane.add(txtSobrenome);
		txtSobrenome.setColumns(10);

		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nome = txtPrimeiroNome.getText();
				String Sobrenome = txtSobrenome.getText();

				if (nome.isEmpty() || Sobrenome.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
				} else {
					Pessoa p = new Pessoa();
					p.setPrimeiroNome(nome);
					p.setSobrenome(Sobrenome);
					String msg = "Cadastrado com Sucesso\n" +
					"Voce Cadastrou:" + p.getPrimeiroNome() + " " + p.getSobrenome();
					JOptionPane.showMessageDialog(null ,msg);
				}
			}
		});
		btnNewButton.setBounds(111, 107, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Limpa Tela");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPrimeiroNome.setText ("");
				txtSobrenome.setText ("");
				
			}
		});
		btnNewButton_1.setBounds(111, 151, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
