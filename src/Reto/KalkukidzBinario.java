package Reto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class KalkukidzBinario extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenuItem mntmGuardar;
	private JMenuItem mntmGuardarYNuevo;
	private JMenuItem mntmGuardarYSalir;
	private JMenuItem mntmSalir;
	private JButton btnInicio;
	private JButton btnBinario;
	private JButton btnAritmeticas;
	private JButton btnGeometricas;
	private JLabel lblNewLabel;
	private JLabel lblOperacionesRealizadas;
	private JPanel panel_botones;
	private JButton btnAnd;
	private JButton btnOr;
	private JButton btnCero;
	private JButton btnUno;
	private JPanel panel_pantalla;
	private JButton btnOk;
	private JButton btnCe;

	/**
	 * Launch the application.
	 */
	//Constructora de la calculadora Binario, que permite realizar operaciónes de AND/OR con n bits.
 	public static void main(String[] args) { 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KalkukidzBinario frame = new KalkukidzBinario();
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
	public KalkukidzBinario() {
		setResizable(false);
		setTitle("KALKUKIDZ Binario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 446, 577);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		mnArchivo.addActionListener(this);
		menuBar.add(mnArchivo);
		
		mntmGuardar = new JMenuItem("Guardar");
		mntmGuardar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_MASK));
		mntmGuardar.addActionListener(this);
		mnArchivo.add(mntmGuardar);
		
		mntmGuardarYNuevo = new JMenuItem("Guardar y Nuevo");
		mntmGuardarYNuevo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		mntmGuardarYNuevo.addActionListener(this);
		mnArchivo.add(mntmGuardarYNuevo);
		
		mntmGuardarYSalir = new JMenuItem("Guardar y salir");
		mntmGuardarYSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mntmGuardarYSalir.addActionListener(this);
		mnArchivo.add(mntmGuardarYSalir);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_MASK));
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		btnInicio = new JButton("Inicio");
		btnInicio.addActionListener(this);
		menuBar.add(btnInicio);
		
		btnBinario = new JButton("Binario");
		btnBinario.setEnabled(false);
		btnBinario.addActionListener(this);
		menuBar.add(btnBinario);
		
		btnAritmeticas = new JButton("Aritmeticas");
		btnAritmeticas.addActionListener(this);
		menuBar.add(btnAritmeticas);
		
		btnGeometricas = new JButton("Geometricas");
		btnGeometricas.addActionListener(this);
		menuBar.add(btnGeometricas);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("By: Ruur Arns");
		lblNewLabel.setBounds(5, 494, 420, 14);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		panel_botones = new JPanel();
		panel_botones.setBackground(new Color(135, 206, 235));
		panel_botones.setBounds(10, 128, 415, 355);
		contentPane.add(panel_botones);
		panel_botones.setLayout(null);
		
		btnOr = new JButton("OR");
		btnOr.addActionListener(this);
		btnOr.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnOr.setBackground(new Color(250, 250, 210));
		btnOr.setBounds(207, 11, 198, 90);
		panel_botones.add(btnOr);
		
		btnCero = new JButton("0");
		btnCero.addActionListener(this);
		btnCero.setBackground(new Color(250, 250, 210));
		btnCero.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btnCero.setBounds(10, 186, 187, 169);
		panel_botones.add(btnCero);
		
		btnUno = new JButton("1");
		btnUno.addActionListener(this);
		btnUno.setBackground(new Color(250, 250, 210));
		btnUno.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btnUno.setBounds(10, 11, 187, 169);
		panel_botones.add(btnUno);
		
		btnOk = new JButton("Ok");
		btnOk.setBackground(new Color(250, 250, 210));
		btnOk.addActionListener(this);
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnOk.setBounds(209, 214, 98, 141);
		panel_botones.add(btnOk);
		
		btnCe = new JButton("CE");
		btnCe.addActionListener(this);
		btnCe.setForeground(Color.RED);
		btnCe.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnCe.setBackground(new Color(250, 250, 210));
		btnCe.setBounds(317, 214, 88, 141);
		panel_botones.add(btnCe);
		
		btnAnd = new JButton("AND");
		btnAnd.setBounds(207, 113, 198, 90);
		panel_botones.add(btnAnd);
		btnAnd.addActionListener(this);
		btnAnd.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnAnd.setBackground(new Color(250, 250, 210));
		
		panel_pantalla = new JPanel();
		panel_pantalla.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_pantalla.setBackground(Color.WHITE);
		panel_pantalla.setBounds(5, 11, 420, 104);
		contentPane.add(panel_pantalla);
		panel_pantalla.setLayout(null);
		
		lblOperacionesRealizadas = new JLabel("");
		lblOperacionesRealizadas.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblOperacionesRealizadas.setBounds(163, 0, 257, 48);
		panel_pantalla.add(lblOperacionesRealizadas);
		lblOperacionesRealizadas.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOperacionesRealizadas.setOpaque(true);
		lblOperacionesRealizadas.setAutoscrolls(true);
		lblOperacionesRealizadas.setBackground(new Color(230, 230, 250));
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setEditable(false);
		textField.setBounds(0, 48, 420, 55);
		panel_pantalla.add(textField);
		textField.addActionListener(this);
		textField.setColumns(10);
	}
	//Inicializamos variables que creemos necesarias utilizar
	String num1 = "";
	String num2 = "";
	String op = "";
	String operacion = "";
	String ultimaOperacion = "";
	String resultado = "";
	boolean n1completo = false;
	boolean n2completo = false;
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		// Miramos si el usuario solicita cambiar a otra de las calculadoras.
		if (o == btnInicio) {
			this.setVisible(false);
			KalkukidzInicio i = new KalkukidzInicio();
			i.setVisible(true);
		}
		else if (o == btnAritmeticas) {
			this.setVisible(false);
			KalkukidzAritmetica a = new KalkukidzAritmetica();
			a.setVisible(true);
		}
		else if (o == btnGeometricas) {
			this.setVisible(false);
			KalkukidzGeometrica g = new KalkukidzGeometrica();
			g.setVisible(true);
		}
		
		if (!n1completo) {
			if ((o == btnCero)||(o == btnUno)) {
				num1 = num1 + ((JButton)o).getText();
				operacion = operacion + ((JButton)o).getText();
			}
			else if ((o == btnAnd)||(o == btnOr)) {
				n1completo = true;
				op = ((JButton)o).getText();
				operacion = operacion +"_" + ((JButton)o).getText() + "_";
				
			}
		}
		else if (!n2completo) {
			if ((o == btnCero)||(o == btnUno)) {
				num2 = num2 + ((JButton)o).getText();
				operacion = operacion + ((JButton)o).getText();
			}
			if (o == btnOk) {
				lblOperacionesRealizadas.setText(ultimaOperacion);
				n2completo = true;
				resultado = selectOpBin(op, num1, num2);
				operacion = operacion + " = " + resultado;
				ultimaOperacion = operacion;
				num1 = "";
				num2 = "";
			}
		}
		else if (o == btnCe) {
			num1 = "";
			num2 = "";
			op = "";
			operacion = "";
			resultado = "";
			n1completo = false;
			n2completo = false;
		}
		textField.setText(operacion);
	}
	// Selecciona mediante el operando que función (operación) debemos realizar.
	private String selectOpBin(String op, String n1, String n2) {
		String result = "";
		switch (op) {
		case "AND":
			result = andBin(n1,n2);
			break;
		case "OR":
		result = orBin(n1,n2);
			break;
		default:
			break;
		}
		
		return result;
	}
	// calcula la operación or.
	private String orBin(String n1, String n2) {
		String result = "";
		int pos = 0;
		int posmax = 0;
		if (n1.length() > n2.length()){
			posmax = n1.length() - 1;	
			while (n1.length() > n2.length()) {
				n2 = "0" + n2;
			}
		}
		else if (n2.length() > n1.length()){
			posmax = n2.length() - 1;
			n1 = "0" + n1;
		}
		else {
			posmax = n1.length();
		}//recorremos el String de la primera a la ultima posicion
		for(pos=0; pos <posmax ; pos ++){ 
			result =  orBinPos(n1.charAt(pos), n2.charAt(pos)) + result;

		}
		return result;
	}
	//Calcula la operacion or bit a bit
	private String orBinPos(char charAt, char charAt2) {
		String resultado = "0";
		if ((charAt == '1')||(charAt2 == '1')) {
			resultado = "1";
		}
		return resultado;
	}
	// calcula la operación and
	private String andBin(String n1, String n2) {
		String result = "";
		int pos = 0;
		int posmax = 0;
		if (n1.length() > n2.length()){
			posmax = n1.length() - 1;	
			while (n1.length() > n2.length()) {
				n2 = "0" + n2;
			}
		}
		else if (n2.length() > n1.length()){
			posmax = n2.length() - 1;
			n1 = "0" + n1;
		}
		else {
			posmax = n1.length();
		}
		for(pos=0; pos <posmax ; pos ++){
			result = andBinPos(n1.charAt(pos), n2.charAt(pos)) + result;
		}
		
		return result;
	}
	//Calcula la operacion and bit a bit
	private String andBinPos(char charAt, char charAt2) {
		String resultado = "0";
		if ((charAt == '1')&&(charAt2 == '1')) {
			resultado = "1";
		}
		return resultado;
	}
}
