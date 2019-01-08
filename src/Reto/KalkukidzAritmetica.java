package Reto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class KalkukidzAritmetica extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JPanel panel_botones;
	private JButton btnPI;
	private JButton btnAbrir;
	private JButton btnCe;
	private JButton btnCerrar;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn0;
	private JButton btncoma;
	private JButton btnSumar;
	private JButton btnResta;
	private JButton btnMult;
	private JButton btnDivisor;
	private JButton btnC;
	private JButton btnIgual;
	private JTextField textOperación;
	private JLabel lblNewLabel;
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
	private JPanel panel_pantalla;
	private JLabel lblUltimaOperación;
	
	/**
	 * Launch the application.
	 */
	/*Constructora de la calculadora Aritmetica. Permite operaciones simples de suma, resta, multiplicación
	 * y división con numeros enteros o decimales.*/
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KalkukidzAritmetica frame = new KalkukidzAritmetica();
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
	public KalkukidzAritmetica() {
		setResizable(false);
		setTitle("KALKUKIDZ Aritmeticas");
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
		
		mntmGuardarYNuevo = new JMenuItem("Guardar y nuevo");
		mntmGuardarYNuevo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		mntmGuardarYNuevo.addActionListener(this);
		mnArchivo.add(mntmGuardarYNuevo);
		
		mntmGuardarYSalir = new JMenuItem("Guardar y Salir");
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
		btnBinario.addActionListener(this);
		menuBar.add(btnBinario);
		
		btnAritmeticas = new JButton("Aritmeticas");
		btnAritmeticas.setEnabled(false);
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
		
		panel_botones = new JPanel();
		panel_botones.setBackground(new Color(135, 206, 235));
		panel_botones.setBounds(10, 152, 420, 374);
		contentPane.add(panel_botones);
		panel_botones.setLayout(null);
		
		btnPI = new JButton("\u03C0");
		btnPI.setEnabled(false);
		btnPI.addActionListener(this);
		btnPI.setBackground(new Color(127, 255, 212));
		btnPI.setBounds(0, 48, 159, 31);
		btnPI.setFont(new Font("Arial", Font.PLAIN, 18));
		panel_botones.add(btnPI);
		
		btnAbrir = new JButton("(");
		btnAbrir.setEnabled(false);
		btnAbrir.addActionListener(this);
		btnAbrir.setBackground(new Color(127, 255, 212));
		btnAbrir.setBounds(0, 11, 201, 31);
		btnAbrir.setFont(new Font("Arial", Font.PLAIN, 18));
		panel_botones.add(btnAbrir);
		
		btnCerrar = new JButton(")");
		btnCerrar.setEnabled(false);
		btnCerrar.addActionListener(this);
		btnCerrar.setBackground(new Color(127, 255, 212));
		btnCerrar.setBounds(211, 11, 203, 31);
		btnCerrar.setFont(new Font("Arial", Font.PLAIN, 18));
		panel_botones.add(btnCerrar);
		
		btnCe = new JButton("CE");
		btnCe.setToolTipText("Borra la \u00FAltima operaci\u00F3n.");
		btnCe.addActionListener(this);
		btnCe.setBackground(new Color(127, 255, 212));
		btnCe.setForeground(Color.RED);
		btnCe.setBounds(264, 48, 150, 31);
		btnCe.setFont(new Font("Arial", Font.PLAIN, 18));
		panel_botones.add(btnCe);
		
		btn7 = new JButton("7");
		btn7.setBackground(new Color(127, 255, 212));
		btn7.addActionListener(this);
		btn7.setBounds(0, 90, 88, 31);
		btn7.setFont(new Font("Arial", Font.PLAIN, 18));
		panel_botones.add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(this);
		btn8.setBackground(new Color(127, 255, 212));
		btn8.setBounds(104, 90, 55, 31);
		btn8.setFont(new Font("Arial", Font.PLAIN, 18));
		panel_botones.add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(this);
		btn9.setBackground(new Color(127, 255, 212));
		btn9.setBounds(178, 90, 88, 31);
		btn9.setFont(new Font("Arial", Font.PLAIN, 18));
		panel_botones.add(btn9);
		
		btnSumar = new JButton("+");
		btnSumar.setBackground(new Color(127, 255, 212));
		btnSumar.addActionListener(this);
		btnSumar.setBounds(326, 90, 84, 31);
		btnSumar.setFont(new Font("Arial", Font.PLAIN, 18));
		panel_botones.add(btnSumar);
		
		btn4 = new JButton("4");
		btn4.addActionListener(this);
		btn4.setBackground(new Color(127, 255, 212));
		btn4.setBounds(0, 132, 88, 31);
		btn4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel_botones.add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(this);
		btn5.setBackground(new Color(127, 255, 212));
		btn5.setBounds(104, 132, 55, 31);
		btn5.setFont(new Font("Arial", Font.PLAIN, 18));
		panel_botones.add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(this);
		btn6.setBackground(new Color(127, 255, 212));
		btn6.setBounds(178, 132, 88, 31);
		btn6.setFont(new Font("Arial", Font.PLAIN, 18));
		panel_botones.add(btn6);
		
		btnResta = new JButton("-");
		btnResta.addActionListener(this);
		btnResta.setBackground(new Color(127, 255, 212));
		btnResta.setBounds(326, 132, 84, 31);
		btnResta.setFont(new Font("Arial", Font.PLAIN, 18));
		panel_botones.add(btnResta);
		
		btn1 = new JButton("1");
		btn1.addActionListener(this);
		btn1.setBackground(new Color(127, 255, 212));
		btn1.setBounds(0, 174, 88, 31);
		btn1.setFont(new Font("Arial", Font.PLAIN, 18));
		panel_botones.add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(this);
		btn2.setBackground(new Color(127, 255, 212));
		btn2.setBounds(104, 174, 55, 31);
		btn2.setFont(new Font("Arial", Font.PLAIN, 18));
		panel_botones.add(btn2);
		
		btn3 = new JButton("3");
		btn3.setBackground(new Color(127, 255, 212));
		btn3.addActionListener(this);
		btn3.setBounds(178, 174, 88, 31);
		btn3.setFont(new Font("Arial", Font.PLAIN, 18));
		panel_botones.add(btn3);
		
		btnMult = new JButton("X");
		btnMult.setBackground(new Color(127, 255, 212));
		btnMult.addActionListener(this);
		btnMult.setBounds(326, 174, 84, 31);
		btnMult.setFont(new Font("Arial", Font.PLAIN, 18));
		panel_botones.add(btnMult);
		
		btncoma = new JButton(",");
		btncoma.addActionListener(this);
		btncoma.setBackground(new Color(127, 255, 212));
		btncoma.setBounds(0, 216, 88, 31);
		btncoma.setFont(new Font("Arial", Font.PLAIN, 18));
		panel_botones.add(btncoma);
		
		btn0 = new JButton("0");
		btn0.setBackground(new Color(127, 255, 212));
		btn0.addActionListener(this);
		btn0.setBounds(104, 216, 55, 31);
		btn0.setFont(new Font("Arial", Font.PLAIN, 18));
		panel_botones.add(btn0);
		
		btnC = new JButton("C");
		btnC.setToolTipText("Borra el \u00FAltimo caracter introducido");
		btnC.addActionListener(this);
		btnC.setBackground(new Color(127, 255, 212));
		btnC.setBounds(178, 216, 88, 31);
		btnC.setFont(new Font("Arial", Font.PLAIN, 18));
		panel_botones.add(btnC);
		
		btnDivisor = new JButton("/");
		btnDivisor.setBackground(new Color(127, 255, 212));
		btnDivisor.addActionListener(this);
		btnDivisor.setBounds(326, 216, 84, 31);
		btnDivisor.setFont(new Font("Arial", Font.PLAIN, 18));
		panel_botones.add(btnDivisor);
		
		btnIgual = new JButton("=");
		btnIgual.addActionListener(this);
		btnIgual.setBackground(new Color(127, 255, 212));
		btnIgual.setForeground(new Color(0, 0, 0));
		btnIgual.setBounds(0, 269, 410, 66);
		btnIgual.setFont(new Font("Arial", Font.PLAIN, 18));
		panel_botones.add(btnIgual);
		
		lblNewLabel = new JLabel("By: Ruur Arns");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 333, 420, 30);
		panel_botones.add(lblNewLabel);
		
		panel_pantalla = new JPanel();
		panel_pantalla.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_pantalla.setBackground(Color.WHITE);
		panel_pantalla.setBounds(10, 32, 410, 109);
		contentPane.add(panel_pantalla);
		panel_pantalla.setLayout(null);
		
		lblUltimaOperación = new JLabel("");
		lblUltimaOperación.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblUltimaOperación.setOpaque(true);
		lblUltimaOperación.setBackground(new Color(230, 230, 250));
		lblUltimaOperación.setBounds(154, 0, 256, 51);
		panel_pantalla.add(lblUltimaOperación);
		
		textOperación = new JTextField();
		textOperación.setBackground(Color.WHITE);
		textOperación.setHorizontalAlignment(SwingConstants.RIGHT);
		textOperación.setEditable(false);
		textOperación.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textOperación.setBounds(0, 50, 410, 57);
		panel_pantalla.add(textOperación);
		textOperación.setColumns(10);
	}
	//Creación e inicialización de las variables que necesitamos para poder 
	 // realizar las operaciones
	String anterior = "";
	String num1 = "";
	String num2 = "";
	String operacion = "";
	String mensaje;
	String op;
	String op2;
	String operacionAnterior;
	double n1 = 0;
	double n2 = 0;
	double resultado = 0;
	boolean num1Completo = false;
	boolean num2Completo = false;
	boolean coma1 = false;
	boolean coma2 = false;
	boolean negativoN1 = false;
	boolean negativoN2 = false;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		//Comprueba si lo que se quiere hacer es cambiar a otra calculadora. 
		 // En caso de que así sea hara el cambio.
		
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
		else if (o == btnGeometricas) {
			this.setVisible(false);
			KalkukidzGeometrica g = new KalkukidzGeometrica();
			g.setVisible(true);
		}

		//Asigna a cada parte de la operación su valor.
		if (o == btnCe) {
			operacion.substring(0, 0);
			num1 = "";
			num2 = "";
			operacion = "";
			mensaje = "";
			op = "";
			op2 = "";
			n1 = 0;
			n2 = 0;
			resultado = 0;
			num1Completo = false;
			num2Completo = false;
			coma1 = false;
			coma2 = false;
			negativoN1 = false;
			negativoN2 = false;
		}
		else if ((o == btnC)&&(anterior != "=")) {
			borrarUltimaOperacion();
		}
		else if (!num1Completo) { //completa el valor de num1.
			if((o == btn0)|| (o == btn1)|| (o == btn2) || (o == btn3)
					|| (o == btn4) || (o == btn5) || (o == btn6) || (o == btn7)
					|| (o == btn8) || (o == btn9) || (o == btncoma)) {
				
				if ((o == btncoma) && (!coma1)){
					if (num1 == "") {
						num1 = "0.";
					}
					else {
						num1 = num1 + ".";
					}

					coma1 = true;
				}
				else if ((o == btncoma) && (coma1)) {
					mensaje = "operación invalida";
					textOperación.setText(mensaje);
					num1 = "";
					coma1 = false;
				}
				else if (((num1 == "") && (o != btn0)) || (num1 != "")){
					num1 = num1 + ((JButton)o).getText();
				}
				operacion = num1;
			} // comprueba que sea la primera operación a realizar.
			else if ((o == btnSumar) || (o == btnResta) || (o == btnMult) || (o == btnDivisor)) { 
				if ((anterior == "") && (o ==btnResta)){
					negativoN1 = true;
					num1 = ((JButton)o).getText() + num1;
				}
				
				else {
					// completa el valor de la operación que más tarde haremos y asigna el valor a n1
					op = ((JButton)o).getText();
					operacion = operacion + op;
					num1Completo = true;
					n1 = Double.parseDouble(num1);
					if (negativoN1) {
						n1 = -n1;
					}
				}
				resultado = n1;
			}
		} // Asignamos los valores al segundo operando.
		else if (!num2Completo){ 
			if((o == btn0)|| (o == btn1)|| (o == btn2) || (o == btn3)
					|| (o == btn4) || (o == btn5) || (o == btn6) || (o == btn7)
					|| (o == btn8) || (o == btn9) || (o == btncoma)) {
				
				if ((o == btncoma) && (!coma2)){
					if (num2 == "") {
						num2 = "0.";
						operacion = operacion + num2;
					}
					else {
						num2 = num2 + ".";
					}
					coma2 = true;
				}
				else if ((o == btncoma) && (coma2)) {
					mensaje = "operación invalida";
					textOperación.setText(mensaje);
					num1 = "";
					num1Completo = false;
					num2 = "";
					num2Completo = false;
					op = "";
				}
				else if (((num2 == "") && (o != btn0)) || (num2 != "")){
					num2 = num2 + ((JButton)o).getText();
					operacion = operacion + ((JButton)o).getText();
				}

			} // comprobamos el siguiente operando.
			else if ((o == btnSumar) || (o == btnResta) || (o == btnMult) || (o == btnDivisor)) { 
				if ((o ==btnResta) && ((anterior == "+")|| (o == btnMult) || (o == btnDivisor))) {
						negativoN2 = true;
						operacion = operacion + ((JButton)o).getText();
				}
				else if((anterior == btnSumar.getText()) || (anterior == btnResta.getText()) || 
						(anterior == btnMult.getText()) || (anterior == btnDivisor.getText())) {
					
					if ((o == btnMult)|| (o == btnDivisor)) {
						op = btnMult.getText();
						operacion = borrarUltimoChar(operacion) + op;
					}	
					else if (o == btnSumar) {
						operacion = operacion;
					}

				}
				else {
					// completa el valor de la operación que más tarde haremos
					op2 = ((JButton)o).getText();
					operacion = operacion + op2;
					num2Completo = true;
					n2 = Double.parseDouble(num2);
					if (negativoN2) {
						n2 = -n2;
					}
					resultado = selectOp(op, resultado, n2);
					num2Completo = false;
					num2 = "";
					n2 = 0;
					negativoN2 = false;
					op = op2;
				}


			} //Comprobamos que sea el fin de la operación.
			else if (o == btnIgual) {
				num2Completo = true;
				n2 = Double.parseDouble(num2);
				if (negativoN2) {
					n2 = -n2;
				}
				resultado = selectOp(op, resultado, n2);	
				operacion = operacion + "=" + String.valueOf(resultado);
				operacionAnterior = operacion;
				lblUltimaOperación.setText(operacionAnterior);
			}
		}
		textOperación.setText(operacion);
		anterior = ((JButton)o).getText();
	}


	// Selecciona dependiendo del operando que operación debe realizar la calculadora.
	private double selectOp(String op2, double n12, double n22) {
		double resul = 0;
		switch (op) {
		case "+":
			resul = sumaNum(resultado,n2);
			break;
		case "-":
			resul = restaNum(resultado,n2);
			break;
		case "X":
			resul = multNum(resultado, n2);
			break;
		case "/":
			resul = divNum(resultado,n2);
			break;

		default:
			break;
		}
		return resul;
	}

	//Operaciones de Suma, Resta, Multiplicación y división
	private double sumaNum(double n12, double n22) {
		double result;
		result = n12 + n22;
		return result;
	}
	private double divNum(double n12, double n22) {
		double result;
		result = n12 / n22;
		return result;
	}

	private double multNum(double n12, double n22) {
		double result;
		result = n12 * n22;
		return result;
	}

	private double restaNum(double n12, double n22) {
		double result;
		result = n12 - n22;
		return result;
	}
	private String borrarUltimoChar(String operacion2) {
		String borrado = operacion2.substring(0, operacion2.length()-1);
		return borrado;
	}
	private void borrarUltimaOperacion() {
		operacion.substring(0, 0);
		num1 = "";
		num2 = "";
		operacion = "";
		mensaje = "";
		op = "";
		op2 = "";
		n1 = 0;
		n2 = 0;
		resultado = 0;
		num1Completo = false;
		num2Completo = false;
		coma1 = false;
		coma2 = false;
		negativoN1 = false;
		negativoN2 = false;

	}
}
