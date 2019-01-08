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
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class KalkukidzPerimetroTriangulos extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textLadoA;
	private JTextField textLadoB;
	private JTextField textLadoC;
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
	private JLabel lblUltimaOp;
	private JLabel lblTriangulo;
	private JButton bu7;
	private JButton bu8;
	private JButton bu9;
	private JButton bu4;
	private JButton bu5;
	private JButton bu6;
	private JButton bu1;
	private JButton bu2;
	private JButton bu3;
	private JButton bu0;
	private JButton buComa;
	private JButton buC;
	private JButton btnOK;
	
	

	/**
	 * Launch the application.
	 */
public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KalkukidzPerimetroTriangulos frame = new KalkukidzPerimetroTriangulos();
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
	public KalkukidzPerimetroTriangulos() {
		setTitle("KALKUKIDZ Perimetros Triangulo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 446, 577);
		
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
		lblByRuurArns.setBounds(5, 488, 420, 14);
		lblByRuurArns.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblByRuurArns);
		
		panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(5, 5, 420, 110);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblUltimaOp = new JLabel("");
		lblUltimaOp.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblUltimaOp.setOpaque(true);
		lblUltimaOp.setBackground(new Color(230, 230, 250));
		lblUltimaOp.setBounds(168, 0, 252, 51);
		panel.add(lblUltimaOp);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBorder(new LineBorder(new Color(171, 173, 179)));
		textField.setBounds(0, 51, 420, 59);
		panel.add(textField);
		textField.setColumns(10);
		
		textLadoA = new JTextField();
		textLadoA.setHorizontalAlignment(SwingConstants.RIGHT);
		textLadoA.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				focoA = true;
				focoB = false;
				focoC = false;
			}
		});
		textLadoA.setBounds(243, 180, 55, 20);
		contentPane.add(textLadoA);
		textLadoA.setColumns(10);
		
		textLadoB = new JTextField();
		textLadoB.setHorizontalAlignment(SwingConstants.RIGHT);
		textLadoB.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				focoA = false;
				focoB = true;
				focoC = false;
			}
		});
		textLadoB.setBounds(304, 257, 55, 20);
		contentPane.add(textLadoB);
		textLadoB.setColumns(10);
		
		textLadoC = new JTextField();
		textLadoC.setHorizontalAlignment(SwingConstants.RIGHT);
		textLadoC.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				focoA = false;
				focoB = false;
				focoC = true;
			}
		});
		textLadoC.setBounds(365, 180, 55, 20);
		contentPane.add(textLadoC);
		textLadoC.setColumns(10);
		
		lblTriangulo = new JLabel("");
		lblTriangulo.setIcon(new ImageIcon(KalkukidzPerimetroTriangulos.class.getResource("/iconos/triangulo.png")));
		lblTriangulo.setBackground(new Color(154, 205, 50));
		lblTriangulo.setBounds(268, 126, 152, 151);
		contentPane.add(lblTriangulo);
		
		bu7 = new JButton("7");
		bu7.addActionListener(this);
		bu7.setFont(new Font("Arial", Font.PLAIN, 18));
		bu7.setBackground(new Color(255, 192, 203));
		bu7.setBounds(10, 288, 88, 31);
		contentPane.add(bu7);
		
		bu8 = new JButton("8");
		bu8.addActionListener(this);
		bu8.setFont(new Font("Arial", Font.PLAIN, 18));
		bu8.setBackground(new Color(255, 192, 203));
		bu8.setBounds(114, 288, 55, 31);
		contentPane.add(bu8);
		
		bu9 = new JButton("9");
		bu9.addActionListener(this);
		bu9.setFont(new Font("Arial", Font.PLAIN, 18));
		bu9.setBackground(new Color(255, 192, 203));
		bu9.setBounds(188, 288, 88, 31);
		contentPane.add(bu9);
		
		bu4 = new JButton("4");
		bu4.addActionListener(this);
		bu4.setFont(new Font("Arial", Font.PLAIN, 18));
		bu4.setBackground(new Color(255, 192, 203));
		bu4.setBounds(10, 330, 88, 31);
		contentPane.add(bu4);
		
		bu5 = new JButton("5");
		bu5.addActionListener(this);
		bu5.setFont(new Font("Arial", Font.PLAIN, 18));
		bu5.setBackground(new Color(255, 192, 203));
		bu5.setBounds(114, 330, 55, 31);
		contentPane.add(bu5);
		
		bu6 = new JButton("6");
		bu6.addActionListener(this);
		bu6.setFont(new Font("Arial", Font.PLAIN, 18));
		bu6.setBackground(new Color(255, 192, 203));
		bu6.setBounds(188, 330, 88, 31);
		contentPane.add(bu6);
		
		bu1 = new JButton("1");
		bu1.addActionListener(this);
		bu1.setFont(new Font("Arial", Font.PLAIN, 18));
		bu1.setBackground(new Color(255, 192, 203));
		bu1.setBounds(10, 372, 88, 31);
		contentPane.add(bu1);
		
		bu2 = new JButton("2");
		bu2.addActionListener(this);
		bu2.setFont(new Font("Arial", Font.PLAIN, 18));
		bu2.setBackground(new Color(255, 192, 203));
		bu2.setBounds(114, 372, 55, 31);
		contentPane.add(bu2);
		
		bu3 = new JButton("3");
		bu3.addActionListener(this);
		bu3.setFont(new Font("Arial", Font.PLAIN, 18));
		bu3.setBackground(new Color(255, 192, 203));
		bu3.setBounds(188, 372, 88, 31);
		contentPane.add(bu3);
		
		buComa = new JButton(",");
		buComa.addActionListener(this);
		buComa.setFont(new Font("Arial", Font.PLAIN, 18));
		buComa.setBackground(new Color(255, 192, 203));
		buComa.setBounds(10, 414, 88, 31);
		contentPane.add(buComa);
		
		bu0 = new JButton("0");
		bu0.addActionListener(this);
		bu0.setFont(new Font("Arial", Font.PLAIN, 18));
		bu0.setBackground(new Color(255, 192, 203));
		bu0.setBounds(114, 414, 55, 31);
		contentPane.add(bu0);
		
		buC = new JButton("C");
		buC.addActionListener(this);
		buC.setFont(new Font("Arial", Font.PLAIN, 18));
		buC.setBackground(new Color(255, 192, 203));
		buC.setBounds(188, 414, 88, 31);
		contentPane.add(buC);
		
		btnOK = new JButton("OK");
		btnOK.addActionListener(this);
		btnOK.setBackground(new Color(255, 192, 203));
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnOK.setBounds(315, 303, 89, 127);
		contentPane.add(btnOK);
	}
	
	String ladoA = "";
	String ladoB = "";
	String ladoC = "";
	String mensajeError = "";
	String operacion = "";
	String ultimaOperacion = "";
	double ladoAnum = 0;
	double ladoBnum = 0;
	double ladoCnum = 0;
	double resultado = 0;
	boolean focoA = false;
	boolean focoB = false;
	boolean focoC = false;
	boolean comaA = false;
	boolean comaB = false;
	boolean comaC = false;

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
		

		if ((o == bu0) || (o == bu1) || (o == bu2) || (o == bu3) || (o == bu4)||
				(o == bu5) || (o == bu6) || (o == bu7) || (o == bu8) || (o == bu9) || (o == buComa)) {
			//Comprobamos en que text estamos para leer el numero
			if (focoA) {
				textLadoA.setEditable(false);
				textLadoB.setEditable(true);
				textLadoC.setEditable(true);
				if (o == buComa) {
					if (!comaA) {
						if (ladoA != "") {
							ladoA = ladoA + ".";
						}
						else if (ladoA == ""){
							ladoA = "0.";
						}
						comaA = true;
					}
					else {
						mensajeError = "Un numero no puede llevar dos comas";
						textField.setText(mensajeError);
						ladoA = "";
					}
				}
				else if(((ladoA == "") && (o != bu0)) || (ladoA != "")) {
					ladoA = ladoA + ((JButton)o).getText();
				}
				
			}
			else if (focoB) {
				textLadoA.setEditable(true);
				textLadoB.setEditable(false);
				textLadoC.setEditable(true);
				if (o == buComa) {
					if (!comaB) {
						if (ladoB != "") {
							ladoB = ladoB + ".";
						}
						else if (ladoB == ""){
							ladoB = "0.";
						}
						comaB = true;
					}
					else {
						mensajeError = "Un numero no puede llevar dos comas";
						textField.setText(mensajeError);
						ladoB = "";
					}
				}
				else if(((ladoB == "") && (o != bu0)) || (ladoB != "")) {
					ladoB = ladoB + ((JButton)o).getText();
				}
			}
			else if (focoC) {
				textLadoA.setEditable(true);
				textLadoB.setEditable(true);
				textLadoC.setEditable(false);
				if (o == buComa) {
					if (!comaC) {
						if (ladoC != "") {
							ladoC = ladoC + ".";
						}
						else if (ladoC == ""){
							ladoC = "0.";
						}
						comaC = true;
					}
					else {
						mensajeError = "Un numero no puede llevar dos comas";
						textField.setText(mensajeError);
						ladoC = "";
					}
				}
				else if(((ladoC == "") && (o != bu0)) || (ladoC != "")) {
					ladoC = ladoC + ((JButton)o).getText();
				}
			}
			
		}
		else if ( o == btnOK) {
			ultimaOperacion = operacion;
			lblUltimaOp.setText(ultimaOperacion);
			focoA = false;
			focoB = false;
			focoC = false;
			ladoAnum = Double.parseDouble(ladoA);
			ladoBnum = Double.parseDouble(ladoB);
			ladoCnum = Double.parseDouble(ladoC);
			resultado = ladoAnum + ladoBnum + ladoCnum;
			operacion = ladoAnum + " + " + ladoBnum + " + " + ladoCnum + " = " + resultado;
			textField.setText(operacion);
			ladoA = "";
			ladoB = "";
			ladoC = "";
			
		}
		else if (o == buC) {
			ladoA = "";
			ladoB = "";
			ladoC = "";
		}
		
		textLadoA.setText(ladoA);
		textLadoB.setText(ladoB);
		textLadoC.setText(ladoC);
		
	}
}
