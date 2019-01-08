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

public class KalkukidzAreasTriangulos extends JFrame implements ActionListener{

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
	private JLabel lblByRuurArns;
	private JPanel panel;
	private JLabel label;
	private JLabel lblTriangulo;
	private JButton but7;
	private JButton but8;
	private JButton but9;
	private JButton but4;
	private JButton but5;
	private JButton but6;
	private JButton but1;
	private JButton but2;
	private JButton but3;
	private JButton butComa;
	private JButton but0;
	private JButton butC;
	private JButton btnOK;
	private JLabel lblLado;
	private JLabel lblAltura;
	private JTextField textBase;
	private JTextField textAltura;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KalkukidzAreasTriangulos frame = new KalkukidzAreasTriangulos();
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
	public KalkukidzAreasTriangulos() {
		setResizable(false);
		setTitle("KALKUKIDZ Areas Triangulo");
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
		
		label = new JLabel("");
		label.setBorder(new LineBorder(new Color(0, 0, 0)));
		label.setOpaque(true);
		label.setBackground(new Color(230, 230, 250));
		label.setBounds(168, 0, 252, 51);
		panel.add(label);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBorder(new LineBorder(new Color(171, 173, 179)));
		textField.setBounds(0, 51, 420, 59);
		panel.add(textField);
		textField.setColumns(10);
		
		lblTriangulo = new JLabel("");
		lblTriangulo.setIcon(new ImageIcon(KalkukidzAreasTriangulos.class.getResource("/iconos/triangulo.png")));
		lblTriangulo.setBackground(new Color(154, 205, 50));
		lblTriangulo.setBounds(268, 126, 152, 151);
		contentPane.add(lblTriangulo);
		
		but7 = new JButton("7");
		but7.addActionListener(this);
		but7.setFont(new Font("Arial", Font.PLAIN, 18));
		but7.setBackground(new Color(255, 228, 225));
		but7.setBounds(5, 268, 88, 31);
		contentPane.add(but7);
		
		but8 = new JButton("8");
		but8.addActionListener(this);
		but8.setFont(new Font("Arial", Font.PLAIN, 18));
		but8.setBackground(new Color(255, 228, 225));
		but8.setBounds(109, 268, 55, 31);
		contentPane.add(but8);
		
		but9 = new JButton("9");
		but9.addActionListener(this);
		but9.setFont(new Font("Arial", Font.PLAIN, 18));
		but9.setBackground(new Color(255, 228, 225));
		but9.setBounds(183, 268, 88, 31);
		contentPane.add(but9);
		
		but4 = new JButton("4");
		but4.addActionListener(this);
		but4.setFont(new Font("Arial", Font.PLAIN, 18));
		but4.setBackground(new Color(255, 228, 225));
		but4.setBounds(5, 310, 88, 31);
		contentPane.add(but4);
		
		but5 = new JButton("5");
		but5.addActionListener(this);
		but5.setFont(new Font("Arial", Font.PLAIN, 18));
		but5.setBackground(new Color(255, 228, 225));
		but5.setBounds(109, 310, 55, 31);
		contentPane.add(but5);
		
		but6 = new JButton("6");
		but6.addActionListener(this);
		but6.setFont(new Font("Arial", Font.PLAIN, 18));
		but6.setBackground(new Color(255, 228, 225));
		but6.setBounds(183, 310, 88, 31);
		contentPane.add(but6);
		
		but1 = new JButton("1");
		but1.addActionListener(this);
		but1.setFont(new Font("Arial", Font.PLAIN, 18));
		but1.setBackground(new Color(255, 228, 225));
		but1.setBounds(5, 352, 88, 31);
		contentPane.add(but1);
		
		but2 = new JButton("2");
		but2.addActionListener(this);
		but2.setFont(new Font("Arial", Font.PLAIN, 18));
		but2.setBackground(new Color(255, 228, 225));
		but2.setBounds(109, 352, 55, 31);
		contentPane.add(but2);
		
		but3 = new JButton("3");
		but3.addActionListener(this);
		but3.setFont(new Font("Arial", Font.PLAIN, 18));
		but3.setBackground(new Color(255, 228, 225));
		but3.setBounds(183, 352, 88, 31);
		contentPane.add(but3);
		
		butComa = new JButton(",");
		butComa.addActionListener(this);
		butComa.setFont(new Font("Arial", Font.PLAIN, 18));
		butComa.setBackground(new Color(255, 228, 225));
		butComa.setBounds(5, 394, 88, 31);
		contentPane.add(butComa);
		
		but0 = new JButton("0");
		but0.addActionListener(this);
		but0.setFont(new Font("Arial", Font.PLAIN, 18));
		but0.setBackground(new Color(255, 228, 225));
		but0.setBounds(109, 394, 55, 31);
		contentPane.add(but0);
		
		butC = new JButton("C");
		butC.addActionListener(this);
		butC.setFont(new Font("Arial", Font.PLAIN, 18));
		butC.setBackground(new Color(255, 228, 225));
		butC.setBounds(183, 394, 88, 31);
		contentPane.add(butC);
		
		btnOK = new JButton("OK");
		btnOK.addActionListener(this);
		btnOK.setBackground(new Color(255, 228, 225));
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnOK.setBounds(310, 283, 89, 127);
		contentPane.add(btnOK);
		
		lblLado = new JLabel("Base");
		lblLado.setBounds(64, 166, 76, 14);
		contentPane.add(lblLado);
		
		lblAltura = new JLabel(" Altura");
		lblAltura.setBounds(59, 195, 46, 14);
		contentPane.add(lblAltura);
		
		textBase = new JTextField();
		textBase.setHorizontalAlignment(SwingConstants.RIGHT);
		textBase.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				focoBase = true;
				focoAltura = false;
			}
		});
		textBase.setBounds(109, 163, 137, 20);
		contentPane.add(textBase);
		textBase.setColumns(10);
		
		textAltura = new JTextField();
		textAltura.setHorizontalAlignment(SwingConstants.RIGHT);
		textAltura.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				focoBase = false;
				focoAltura = true;
			}
		});
		textAltura.setColumns(10);
		textAltura.setBounds(109, 192, 137, 20);
		contentPane.add(textAltura);
	}
	
	String base = "";
	String altura = "";
	String mensajeError = "";
	String operacion = "";
	String ultimaOperacion = "";
	double baseNum = 0;
	double alturaNum= 0;
	double resultado = 0;
	boolean focoBase = false;
	boolean focoAltura = false;
	boolean comaBase = false;
	boolean comaAltura = false;

	
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
		
		//Miramos que variable debemos completar
		if ((o == but0) || (o == but1) || (o == but2) || (o == but3) || (o == but4)||
				(o == but5) || (o == but6) || (o == but7) || (o == but8) || (o == but9) || (o == butComa)) {
			//Comprobamos en que text estamos para leer el numero
			if (focoBase) {
				textBase.setEditable(false);
				textAltura.setEditable(true);
				if (o == butComa) {
					if (!comaBase) {
						if (base != "") {
							base = base + ".";
						}
						else if (base == ""){
							base = "0.";
						}
						comaBase = true;
					}
					else {
						mensajeError = "Un numero no puede llevar dos comas";
						textField.setText(mensajeError);
						base = "";
					}
				}
				else if(((base == "") && (o != but0)) || (base != "")) {
					base = base + ((JButton)o).getText();
				}
				
			}
			else if (focoAltura) {
				textBase.setEditable(true);
				textAltura.setEditable(false);
				if (o == butComa) {
					if (!comaAltura) {
						if (altura != "") {
							altura = altura + ".";
						}
						else if (altura == ""){
							altura = "0.";
						}
						comaAltura = true;
					}
					else {
						mensajeError = "Un numero no puede llevar dos comas";
						textField.setText(mensajeError);
						altura = "";
					}
				}
				else if(((altura == "") && (o != but0)) || (altura != "")) {
					altura = altura + ((JButton)o).getText();
				}
			}
		}
		else if ( o == btnOK) {
			ultimaOperacion = operacion;
			label.setText(ultimaOperacion);
			focoBase = false;
			focoAltura = false;
			baseNum = Double.parseDouble(base);
			alturaNum = Double.parseDouble(altura);

			resultado = baseNum * alturaNum;
			operacion = baseNum + " X " + alturaNum +  " = " + resultado;
			textField.setText(operacion);
			base = "";
			altura = "";
		}
		else if (o == butC) {
			base = "";
			altura = "";
		}
		textAltura.setText(altura);
		textBase.setText(base);
	}
}
