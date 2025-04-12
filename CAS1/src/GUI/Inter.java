package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CLASE.Cilindro;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inter extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel;
	private JLabel lblAltura;
	private JButton btnNewButton;
	private JTextField txtRadio;
	private JTextField txtAltura;
	private JTextArea txtS;
	private JButton btnPrueba;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inter frame = new Inter();
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
	public Inter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 252, 606, 128);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
		{
			lblNewLabel = new JLabel("Radio:");
			lblNewLabel.setBounds(53, 55, 45, 13);
			contentPane.add(lblNewLabel);
		}
		{
			lblAltura = new JLabel("Altura:");
			lblAltura.setBounds(53, 95, 45, 13);
			contentPane.add(lblAltura);
		}
		{
			btnNewButton = new JButton("CALCULAR VOLÚMEN");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(369, 55, 161, 53);
			contentPane.add(btnNewButton);
		}
		{
			txtRadio = new JTextField();
			txtRadio.setBounds(108, 52, 96, 19);
			contentPane.add(txtRadio);
			txtRadio.setColumns(10);
		}
		{
			txtAltura = new JTextField();
			txtAltura.setColumns(10);
			txtAltura.setBounds(108, 92, 96, 19);
			contentPane.add(txtAltura);
		}
		{
			btnPrueba = new JButton("PRUEBA");
			btnPrueba.addActionListener(this);
			btnPrueba.setBounds(369, 142, 161, 53);
			contentPane.add(btnPrueba);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnPrueba) {
			do_btnPrueba_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		double radio=Double.parseDouble(txtRadio.getText());
		double altura=Double.parseDouble(txtAltura.getText());
		
		Cilindro ci=new Cilindro(radio,altura);
		
		txtS.append("El volumen del cilindro es: "+ci.Volumen(radio, altura));
	}
	protected void do_btnPrueba_actionPerformed(ActionEvent e) {
		
	}
}
