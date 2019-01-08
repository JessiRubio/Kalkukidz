package Reto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KalkukidzPerimetroCuadrado extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textLado;
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
	private JLabel lblByRuurArns;
	private JPanel panel;
	private JLabel lblUltimaOperacion;
	private JLabel lblCuadrado;
	private JButton b7;
	private JButton b8;
	private JButton b9;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton bComa;
	private JButton b0;
	private JButton bC;
	private JButton btnOK;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KalkukidzPerimetroCuadrado frame = new KalkukidzPerimetroCuadrado();
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
	public KalkukidzPerimetroCuadrado() {
		setTitle("KALKUKIDZ Perimetro Cuadrado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 446, 576);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmGuardar = new JMenuItem("Guardar");
		mnArchivo.add(mntmGuardar);
		
		mntmGuardarYNuevo = new JMenuItem("Guardar y Nuevo");
		mnArchivo.add(mntmGuardarYNuevo);
		
		mntmGuardarYSalir = new JMenuItem("Guardar y Salir");
		mnArchivo.add(mntmGuardarYSalir);
		
		mntmSalir = new JMenuItem("Salir");
		mnArchivo.add(mntmSalir);
		
		btnInicio = new JButton("Inicio");
		btnInicio.addActionListener(this);
		menuBar.add(btnInicio);
		
		btnBinario = new JButton("Binario");
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
		
		lblByRuurArns = new JLabel("By: Ruur Arns");
		lblByRuurArns.setBounds(5, 487, 420, 14);
		lblByRuurArns.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblByRuurArns);
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(5, 5, 420, 110);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblUltimaOperacion = new JLabel("");
		lblUltimaOperacion.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblUltimaOperacion.setOpaque(true);
		lblUltimaOperacion.setBackground(new Color(230, 230, 250));
		lblUltimaOperacion.setBounds(168, 0, 252, 51);
		panel.add(lblUltimaOperacion);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBackground(Color.WHITE);
		textField.setBorder(new LineBorder(new Color(171, 173, 179)));
		textField.setBounds(0, 51, 420, 59);
		panel.add(textField);
		textField.setColumns(10);
		
		textLado = new JTextField();
		textLado.setHorizontalAlignment(SwingConstants.RIGHT);
		textLado.setEditable(false);
		textLado.setBounds(295, 268, 88, 20);
		contentPane.add(textLado);
		textLado.setColumns(10);
		
		lblCuadrado = new JLabel("");
		lblCuadrado.setIcon(new ImageIcon(KalkukidzPerimetroCuadrado.class.getResource("/iconos/cuadrado.png")));
		lblCuadrado.setBackground(new Color(154, 205, 50));
		lblCuadrado.setBounds(273, 126, 152, 151);
		contentPane.add(lblCuadrado);
		
		b7 = new JButton("7");
		b7.addActionListener(this);
		b7.setFont(new Font("Arial", Font.PLAIN, 18));
		b7.setBackground(new Color(255, 192, 203));
		b7.setBounds(10, 300, 88, 31);
		contentPane.add(b7);
		
		b8 = new JButton("8");
		b8.addActionListener(this);
		b8.setFont(new Font("Arial", Font.PLAIN, 18));
		b8.setBackground(new Color(255, 192, 203));
		b8.setBounds(114, 300, 55, 31);
		contentPane.add(b8);
		
		b9 = new JButton("9");
		b9.addActionListener(this);
		b9.setFont(new Font("Arial", Font.PLAIN, 18));
		b9.setBackground(new Color(255, 192, 203));
		b9.setBounds(188, 300, 88, 31);
		contentPane.add(b9);
		
		b4 = new JButton("4");
		b4.addActionListener(this);
		b4.setFont(new Font("Arial", Font.PLAIN, 18));
		b4.setBackground(new Color(255, 192, 203));
		b4.setBounds(10, 342, 88, 31);
		contentPane.add(b4);
		
		b5 = new JButton("5");
		b5.addActionListener(this);
		b5.setFont(new Font("Arial", Font.PLAIN, 18));
		b5.setBackground(new Color(255, 192, 203));
		b5.setBounds(114, 342, 55, 31);
		contentPane.add(b5);
		
		b6 = new JButton("6");
		b6.addActionListener(this);
		b6.setFont(new Font("Arial", Font.PLAIN, 18));
		b6.setBackground(new Color(255, 192, 203));
		b6.setBounds(188, 342, 88, 31);
		contentPane.add(b6);
		
		b1 = new JButton("1");
		b1.addActionListener(this);
		b1.setFont(new Font("Arial", Font.PLAIN, 18));
		b1.setBackground(new Color(255, 192, 203));
		b1.setBounds(10, 384, 88, 31);
		contentPane.add(b1);
		
		b2 = new JButton("2");
		b2.addActionListener(this);
		b2.setFont(new Font("Arial", Font.PLAIN, 18));
		b2.setBackground(new Color(255, 192, 203));
		b2.setBounds(114, 384, 55, 31);
		contentPane.add(b2);
		
		b3 = new JButton("3");
		b3.addActionListener(this);
		b3.setFont(new Font("Arial", Font.PLAIN, 18));
		b3.setBackground(new Color(255, 192, 203));
		b3.setBounds(188, 384, 88, 31);
		contentPane.add(b3);
		
		bComa = new JButton(",");
		bComa.addActionListener(this);
		bComa.setFont(new Font("Arial", Font.PLAIN, 18));
		bComa.setBackground(new Color(255, 192, 203));
		bComa.setBounds(10, 426, 88, 31);
		contentPane.add(bComa);
		
		b0 = new JButton("0");
		b0.addActionListener(this);
		b0.setFont(new Font("Arial", Font.PLAIN, 18));
		b0.setBackground(new Color(255, 192, 203));
		b0.setBounds(114, 426, 55, 31);
		contentPane.add(b0);
		
		bC = new JButton("C");
		bC.addActionListener(this);
		bC.setFont(new Font("Arial", Font.PLAIN, 18));
		bC.setBackground(new Color(255, 192, 203));
		bC.setBounds(188, 426, 88, 31);
		contentPane.add(bC);
		
		btnOK = new JButton("OK");
		btnOK.addActionListener(this);
		btnOK.setBackground(new Color(255, 192, 203));
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnOK.setBounds(315, 315, 89, 127);
		contentPane.add(btnOK);
	}


	String mensajeError = "";
	String lado = "";
	double ladoNum = 0;
	String UltimaOperacion = "";
	String operacion = "";
	double resultado = 0;
	boolean coma = false;
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		// Comprobamos si el usuario quiere pasar de la ventana de Area Cuadrado a alguna de las principales:
		//Inicio, Binario, Aritmeticas o Geometricas.
		if (o == btnInicio) {
			this.setVisible(false);
			KalkukidzInicio i = new KalkukidzInicio();
			i.setVisible(true);
		}
		else if (o == btnBinario) {
			this.setVisible(false);
			KalkukidzBinario b = new KalkukidzBinario();
			b.setVisible(true);
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
		
		// Comprobamos el valor introducido
		if ((o == b0) || (o == b1) || (o == b2) || (o == b3) || (o == b4)||
				(o == b5) || (o == b6) || (o == b7) || (o == b8) || (o == b9)){
			
			if(((lado == "") && (o != b0)) || (lado != "")) {
				lado = lado + ((JButton)o).getText();
			}
			
		}
		else if (o == bComa) {
			if (!coma) {
				if (lado != "") {
					lado = lado + ".";
				}
				else if (lado == ""){
					lado = "0.";
				}
				coma = true;
			}
			else {
				mensajeError = "Un numero no puede llevar dos comas";
				lado = "";
			}
		}
		else if (o == bC) {
			lado = "";
		}
		//Realizamos la operación
		else if (o == btnOK) {
			UltimaOperacion = operacion;
			lblUltimaOperacion.setText(UltimaOperacion);
			ladoNum = Double.parseDouble(lado);
			resultado = ladoNum*4;
			operacion = "4 X " + ladoNum + "=" + resultado;
			textField.setText(operacion);
			lado = "";
		}
		textLado.setText(lado);
		
	}
}