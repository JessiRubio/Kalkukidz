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

public class KalkukidzPerimetroCirculo extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textRadio;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenuItem mntmGuardar ;
	private JMenuItem mntmGuardarYNuevo;
	private JMenuItem mntmGuardarYSalir;
	private JMenuItem mntmSalir;
	private JButton btnInicio;
	private JButton btnBinario;
	private JButton btnAritmeticas;
	private JButton btnGeometricas;
	private JLabel lblByRuurArns;
	private JPanel panel;
	private JLabel label ;
	private JLabel lblCirculo ;
	private JButton but7;
	private JButton but8;
	private JButton but9 ;
	private JButton but4 ;
	private JButton but5;
	private JButton but6;
	private JButton but1;
	private JButton but2;
	private JButton but3;
	private JButton butcoma;
	private JButton but0;
	private JButton butc;
	private JButton btnOK;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KalkukidzPerimetroCirculo frame = new KalkukidzPerimetroCirculo();
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
	public KalkukidzPerimetroCirculo() {
		setTitle("KALKUKIDZ Perimetros Circulo");
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
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBorder(new LineBorder(new Color(171, 173, 179)));
		textField.setBounds(0, 52, 420, 58);
		panel.add(textField);
		textField.setColumns(10);
		
		textRadio = new JTextField();
		textRadio.setHorizontalAlignment(SwingConstants.RIGHT);
		textRadio.setEditable(false);
		textRadio.setBounds(331, 191, 48, 20);
		contentPane.add(textRadio);
		textRadio.setColumns(10);
		
		lblCirculo = new JLabel("");
		lblCirculo.setIcon(new ImageIcon(KalkukidzPerimetroCirculo.class.getResource("/iconos/circulo-radio2.png")));
		lblCirculo.setBackground(new Color(154, 205, 50));
		lblCirculo.setBounds(268, 141, 152, 151);
		contentPane.add(lblCirculo);
		
		but7 = new JButton("7");
		but7.addActionListener(this);
		but7.setFont(new Font("Arial", Font.PLAIN, 18));
		but7.setBackground(new Color(255, 192, 203));
		but7.setBounds(10, 288, 88, 31);
		contentPane.add(but7);
		
		but8 = new JButton("8");
		but8.addActionListener(this);
		but8.setFont(new Font("Arial", Font.PLAIN, 18));
		but8.setBackground(new Color(255, 192, 203));
		but8.setBounds(114, 288, 55, 31);
		contentPane.add(but8);
		
		but9 = new JButton("9");
		but9.addActionListener(this);
		but9.setFont(new Font("Arial", Font.PLAIN, 18));
		but9.setBackground(new Color(255, 192, 203));
		but9.setBounds(188, 288, 88, 31);
		contentPane.add(but9);
		
		but4 = new JButton("4");
		but4.addActionListener(this);
		but4.setFont(new Font("Arial", Font.PLAIN, 18));
		but4.setBackground(new Color(255, 192, 203));
		but4.setBounds(10, 330, 88, 31);
		contentPane.add(but4);
		
		but5 = new JButton("5");
		but5.addActionListener(this);
		but5.setFont(new Font("Arial", Font.PLAIN, 18));
		but5.setBackground(new Color(255, 192, 203));
		but5.setBounds(114, 330, 55, 31);
		contentPane.add(but5);
		
		but6 = new JButton("6");
		but6.addActionListener(this);
		but6.setFont(new Font("Arial", Font.PLAIN, 18));
		but6.setBackground(new Color(255, 192, 203));
		but6.setBounds(188, 330, 88, 31);
		contentPane.add(but6);
		
		but1 = new JButton("1");
		but1.addActionListener(this);
		but1.setFont(new Font("Arial", Font.PLAIN, 18));
		but1.setBackground(new Color(255, 192, 203));
		but1.setBounds(10, 372, 88, 31);
		contentPane.add(but1);
		
		but2 = new JButton("2");
		but2.addActionListener(this);
		but2.setFont(new Font("Arial", Font.PLAIN, 18));
		but2.setBackground(new Color(255, 192, 203));
		but2.setBounds(114, 372, 55, 31);
		contentPane.add(but2);
		
		but3 = new JButton("3");
		but3.addActionListener(this);
		but3.setFont(new Font("Arial", Font.PLAIN, 18));
		but3.setBackground(new Color(255, 192, 203));
		but3.setBounds(188, 372, 88, 31);
		contentPane.add(but3);
		
		butcoma = new JButton(",");
		butcoma.addActionListener(this);
		butcoma.setFont(new Font("Arial", Font.PLAIN, 18));
		butcoma.setBackground(new Color(255, 192, 203));
		butcoma.setBounds(10, 414, 88, 31);
		contentPane.add(butcoma);
		
		but0 = new JButton("0");
		but0.addActionListener(this);
		but0.setFont(new Font("Arial", Font.PLAIN, 18));
		but0.setBackground(new Color(255, 192, 203));
		but0.setBounds(114, 414, 55, 31);
		contentPane.add(but0);
		
		butc = new JButton("C");
		butc.addActionListener(this);
		butc.setFont(new Font("Arial", Font.PLAIN, 18));
		butc.setBackground(new Color(255, 192, 203));
		butc.setBounds(188, 414, 88, 31);
		contentPane.add(butc);
		
		btnOK = new JButton("OK");
		btnOK.addActionListener(this);
		btnOK.setBackground(new Color(255, 192, 203));
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnOK.setBounds(315, 303, 89, 127);
		contentPane.add(btnOK);
	}
	String mensajeError = "";
	String radio = "";
	double radioNum = 0;
	String UltimaOperacion = "";
	String operacion = "";
	double resultado = 0;
	boolean coma = false;
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		// Comprobamos si se quiere pasar de la ventana Area Circulo a cualquiera de las principales:
		// Inicio, Binario, Aritmeticas o Geometricas.
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
		
		//Leemos el valor del radio 
		if ((o == but0) || (o == but1) || (o == but2) || (o == but3) || (o == but4)||
				(o == but5) || (o == but6) || (o == but7) || (o == but8) || (o == but9)){
			
			if(((radio == "") && (o != but0)) || (radio != "")) {
				radio = radio + ((JButton)o).getText();
			}
			
		}
		else if (o == butcoma) {
			if (!coma) {
				if (radio != "") {
					radio = radio + ".";
				}
				else if (radio == ""){
					radio = "0.";
				}
				coma = true;
			}
			else {
				mensajeError = "Un numero no puede llevar dos comas";
				radio = "";
			}
		}
		else if (o == butc) {
			radio = "";
		}
		else if (o == btnOK) { //calculamos la operación
			UltimaOperacion = operacion;
			label.setText(UltimaOperacion);
			radioNum = Double.parseDouble(radio);
			resultado = (Math.PI)*radioNum*2;
			operacion = "2 X " + "\u03C0" + " X " + radioNum  + "=" + resultado;
			textField.setText(operacion);
			radio = "";
		}
		textRadio.setText(radio);
		
	}
}
