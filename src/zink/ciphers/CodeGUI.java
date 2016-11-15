package zink.ciphers;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class CodeGUI extends JFrame {

	CodeMachine machine = new CodeMachine();

	private JPanel contentPane;
	private JTextField txtEnterCodeHere;
	private JTextField textEncFac;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CodeGUI frame = new CodeGUI();
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
	public CodeGUI() {
		
		//FRAME INITIALIZATION
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// FIELDS AND LABELS
		
		txtEnterCodeHere = new JTextField();
		txtEnterCodeHere.setText("Enter Text/Code Here");
		txtEnterCodeHere.setBounds(6, 43, 259, 26);
		contentPane.add(txtEnterCodeHere);
		txtEnterCodeHere.setColumns(10);
		
		JLabel lblOutputlbl = new JLabel("Output:");
		lblOutputlbl.setBounds(6, 204, 61, 16);
		contentPane.add(lblOutputlbl);
		
		JLabel lblTitle = new JLabel("CodeMachine by Henry Zink");
		lblTitle.setBounds(6, 6, 190, 16);
		contentPane.add(lblTitle);
		
		JLabel lblOutput = new JLabel("(Output Goes Here)");
		lblOutput.setBounds(62, 204, 134, 16);
		contentPane.add(lblOutput);
		
		JLabel lblCaesarEncryptFactor = new JLabel("Caesar Encrypt Factor:");
		lblCaesarEncryptFactor.setBounds(6, 232, 149, 16);
		contentPane.add(lblCaesarEncryptFactor);
		
		textEncFac = new JTextField();
		textEncFac.setText("1");
		textEncFac.setBounds(150, 227, 30, 26);
		contentPane.add(textEncFac);
		textEncFac.setColumns(10);
		
		// BUTTONS
		
		JButton btnEncryptCaesar = new JButton("Encrypt Caesar");
		btnEncryptCaesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO Call CodeMachine Function with parameters
				String output = machine.caesar_encrypt(txtEnterCodeHere.getText(), Integer.parseInt(textEncFac.getText()));
				lblOutput.setText(output);
				txtEnterCodeHere.setText(output);
			}
		});
		btnEncryptCaesar.setBounds(6, 81, 117, 29);
		contentPane.add(btnEncryptCaesar);
		
		JButton btnDecryptCaesar = new JButton("Decrypt Caesar");
		btnDecryptCaesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO Call CodeMachine Function with parameters
				String output = machine.caesar_decrypt(txtEnterCodeHere.getText(), Integer.parseInt(textEncFac.getText()));
				lblOutput.setText(output);
				txtEnterCodeHere.setText(output);
			}
		});
		btnDecryptCaesar.setBounds(135, 81, 130, 29);
		contentPane.add(btnDecryptCaesar);
		
		JButton btnAlphanumeric = new JButton("Alphanumeric");
		btnAlphanumeric.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO Call CodeMachine Function with parameters
				String output = machine.alphanumeric(txtEnterCodeHere.getText());
				lblOutput.setText(output);
				txtEnterCodeHere.setText(output);
			}
		});
		btnAlphanumeric.setBounds(6, 122, 259, 29);
		contentPane.add(btnAlphanumeric);
		
		JButton btnReverse = new JButton("Reverse");
		btnReverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO Call CodeMachine Function with parameters
				String output = machine.reverse(txtEnterCodeHere.getText());
				lblOutput.setText(output);
				txtEnterCodeHere.setText(output);
			}
		});
		btnReverse.setBounds(6, 163, 259, 29);
		contentPane.add(btnReverse);
		

		
	}
}
