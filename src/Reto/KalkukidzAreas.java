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
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;

public class KalkukidzAreas extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnCuadrado;
	private JButton btnTriangulo;
	private JButton btnCirculo;
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
	private JPanel panel;
	private JLabel lblByRuurArns;
	private JLabel lblqueQuieresHacer;

	
	

	/**
	 * Launch the application.
	 */
	/*Constructora de la ventana princial de la calculadora de Areas.
	 * Te permite elegir la figura a calcular para poder hacer el calculo de esta.*/
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KalkukidzAreas frame = new KalkukidzAreas();
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
	public KalkukidzAreas() {
		setResizable(false);
		setTitle("KALKUKIDZ Areas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 446, 577);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		mnArchivo.addActionListener(this);
		menuBar.add(mnArchivo);
		
		mntmGuardar = new JMenuItem("Guardar");
		mntmGuardar.addActionListener(this);
		mntmGuardar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_MASK));
		mnArchivo.add(mntmGuardar);
		
		mntmGuardarYNuevo = new JMenuItem("Guardar y Nuevo");
		mntmGuardarYNuevo.addActionListener(this);
		mntmGuardarYNuevo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		mnArchivo.add(mntmGuardarYNuevo);
		
		mntmGuardarYSalir = new JMenuItem("Guardar y Salir");
		mntmGuardarYSalir.addActionListener(this);
		mntmGuardarYSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mnArchivo.add(mntmGuardarYSalir);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mntmSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_MASK));
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
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblqueQuieresHacer = new JLabel("\u00BFQUE FIGURA QUIERES CALCULAR?");
		lblqueQuieresHacer.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblqueQuieresHacer, BorderLayout.NORTH);
		
		lblByRuurArns = new JLabel("By: Ruur Arns");
		lblByRuurArns.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblByRuurArns, BorderLayout.SOUTH);
		
		panel = new JPanel();
		panel.setBackground(new Color(135, 206, 235));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		btnCirculo = new JButton("CIRCULO");
		btnCirculo.addActionListener(this);
		btnCirculo.setBackground(new Color(230, 230, 250));
		btnCirculo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnCirculo);
		
		btnTriangulo = new JButton("TRIANGULO");
		btnTriangulo.addActionListener(this);
		btnTriangulo.setBackground(new Color(255, 228, 225));
		btnTriangulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnTriangulo);
		
		btnCuadrado = new JButton("CUADRADO");
		btnCuadrado.addActionListener(this);
		btnCuadrado.setBackground(new Color(255, 250, 205));
		btnCuadrado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnCuadrado);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		
		// Miramos cual es la opción elegida por el usuario y nos movemos a dicha calculadora.
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
		else if (o == btnCirculo) {
			this.setVisible(false);
			KalkukidzAreaCirculo ac = new KalkukidzAreaCirculo();
			ac.setVisible(true);
		}
		else if (o == btnTriangulo) {
			this.setVisible(false);
			KalkukidzAreasTriangulos at = new KalkukidzAreasTriangulos();
			at.setVisible(true);
		}
		else if (o == btnCuadrado) {
			this.setVisible(false);
			KalkukidzAreaCuadrado acu = new KalkukidzAreaCuadrado();
			acu.setVisible(true);
			
		}
	}

}
