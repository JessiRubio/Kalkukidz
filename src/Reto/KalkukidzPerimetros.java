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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class KalkukidzPerimetros extends JFrame implements ActionListener{

	private JPanel contentPane;
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
	private JLabel lblqueQuieresHacer;
	private JLabel lblByRuurArns;
	private JPanel panel;
	private JButton btnPCirculo;
	private JButton btnPTriangulo;
	private JButton btnPCuadrado;
	
	

	/**
	 * Launch the application.
	 */
	/* Constructora de la ventana principal de la calculadora Perimetros.
	 * Nos da opción de elegir la figura para realizar los calculos de esta.*/
	public static void main(String[] args) { 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KalkukidzPerimetros frame = new KalkukidzPerimetros();
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
	public KalkukidzPerimetros() { 
		setTitle("KALKUKIDZ Perimetros");
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
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblqueQuieresHacer = new JLabel("\u00BFQUE QUIERES HACER?");
		lblqueQuieresHacer.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblqueQuieresHacer, BorderLayout.NORTH);
		
		lblByRuurArns = new JLabel("By: Ruur Arns");
		lblByRuurArns.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblByRuurArns, BorderLayout.SOUTH);
		
		panel = new JPanel();
		panel.setBackground(new Color(135, 206, 235));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		btnPCirculo = new JButton("CIRCULO");
		btnPCirculo.addActionListener(this);
		btnPCirculo.setBackground(new Color(230, 230, 250));
		btnPCirculo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnPCirculo);
		
		btnPTriangulo = new JButton("TRIANGULO");
		btnPTriangulo.addActionListener(this);
		btnPTriangulo.setBackground(new Color(255, 228, 225));
		btnPTriangulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnPTriangulo);
		
		btnPCuadrado = new JButton("CUADRADO");
		btnPCuadrado.addActionListener(this);
		btnPCuadrado.setBackground(new Color(255, 250, 205));
		btnPCuadrado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnPCuadrado);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		//Comprobamos cual es la opción del menu de la ventana principal de perimetros que el usuario selecciona.
		
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
		else if (o == btnPCirculo) {
			this.setVisible(false);
			KalkukidzPerimetroCirculo ac = new KalkukidzPerimetroCirculo();
			ac.setVisible(true);
		}
		else if (o == btnPTriangulo) {
			this.setVisible(false);
			KalkukidzPerimetroTriangulos at = new KalkukidzPerimetroTriangulos();
			at.setVisible(true);
		}
		else if (o == btnPCuadrado) {
			this.setVisible(false);
			KalkukidzPerimetroCuadrado acu = new KalkukidzPerimetroCuadrado();
			acu.setVisible(true);
			
		}
		
	}

}
