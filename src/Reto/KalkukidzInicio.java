package Reto;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JMenuBar;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;



public class KalkukidzInicio extends JFrame implements ActionListener{

	private JPanel contentPane;
	public JMenuBar menuBar;
	public JMenu mnArchivo;
	public JMenuItem mntmGuardar;
	public JMenuItem mntmGuardasYNuevo;
	public JMenuItem mntmGuardasYSalir;
	public JMenuItem mntmSalir;
	public JButton menuBinario;
	public JButton menuAritmeticas;
	public JButton menuGeometricas;
	public JPanel panel_1;
	public JLabel lblNewLabel;
	public JPanel panel_botones;
	public JButton btnBinario;
	public JButton btnAritmeticas;
	public JButton btnGeometricas;
	private JLabel lblEligeLaOpcin;

	/**
	 * Launch the application.
	 */
	/* Constructora del menu principal de la calculadora. Sirve para pasar de la pantalla de inicio a las diferentes calculadoras: 
	 * logica, aritmetica o geometrica */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KalkukidzInicio frame = new KalkukidzInicio();
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
	public KalkukidzInicio() {
		setResizable(false);
		setTitle("KALKUKIDZ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 446, 577);
		
		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 255, 240));
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		mnArchivo.addActionListener(this);
		menuBar.add(mnArchivo);
		
		mntmGuardar = new JMenuItem("Guardar");
		mntmGuardar.setEnabled(false);
		mntmGuardar.addActionListener(this);
		mntmGuardar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_MASK));
		mnArchivo.add(mntmGuardar);
		
		mntmGuardasYNuevo = new JMenuItem("Guardas y Nuevo");
		mntmGuardasYNuevo.setEnabled(false);
		mntmGuardasYNuevo.addActionListener(this);
		mntmGuardasYNuevo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		mnArchivo.add(mntmGuardasYNuevo);
		
		mntmGuardasYSalir = new JMenuItem("Guardas y Salir");
		mntmGuardasYSalir.setEnabled(false);
		mntmGuardasYSalir.addActionListener(this);
		mntmGuardasYSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mnArchivo.add(mntmGuardasYSalir);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mntmSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_MASK));
		mnArchivo.add(mntmSalir);
		
		menuBinario = new JButton("Binaria");
		menuBinario.addActionListener(this);
		menuBar.add(menuBinario);
		
		
		menuAritmeticas = new JButton("Aritmeticas");
		menuAritmeticas.addActionListener(this);
		menuBar.add(menuAritmeticas);
		
		menuGeometricas = new JButton("Geometricas");
		menuGeometricas.addActionListener(this);
		menuBar.add(menuGeometricas);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 235));
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		lblNewLabel = new JLabel("By: Ruur Arns");
		panel_1.add(lblNewLabel);
		
		panel_botones = new JPanel();
		panel_botones.setBackground(new Color(135, 206, 235));
		contentPane.add(panel_botones, BorderLayout.CENTER);
		panel_botones.setLayout(new GridLayout(0, 3, 0, 0));
		
		btnBinario = new JButton("");
		btnBinario.setBackground(new Color(255, 250, 205));
		btnBinario.addActionListener(this);
		btnBinario.setIcon(new ImageIcon(KalkukidzInicio.class.getResource("/iconos/Binario.png")));
		panel_botones.add(btnBinario);
		
		btnAritmeticas = new JButton("");
		btnAritmeticas.setBackground(new Color(127, 255, 212));
		btnAritmeticas.addActionListener(this);
		btnAritmeticas.setIcon(new ImageIcon(KalkukidzInicio.class.getResource("/iconos/SumaResta.png")));
		panel_botones.add(btnAritmeticas);
		
		btnGeometricas = new JButton("");
		btnGeometricas.setBackground(new Color(255, 228, 225));
		btnGeometricas.addActionListener(this);
		btnGeometricas.setIcon(new ImageIcon(KalkukidzInicio.class.getResource("/iconos/Geometria.gif")));
		panel_botones.add(btnGeometricas);
		
		lblEligeLaOpcin = new JLabel("Elige la opci\u00F3n que quieras:");
		contentPane.add(lblEligeLaOpcin, BorderLayout.NORTH);
	}

		@Override
		public void actionPerformed(ActionEvent e) {
			Object o = e.getSource();
			//Hace que pasemos de la ventana principal a la calculadora que elegimos.
			if ((o == btnBinario)|| (o == menuBinario)) { 
				this.setVisible(false);
				KalkukidzBinario b = new KalkukidzBinario();
				b.setVisible(true);
			}
			else if ((o == btnAritmeticas) || (o == menuAritmeticas)) {
				this.setVisible(false);
				KalkukidzAritmetica a = new KalkukidzAritmetica();
				a.setVisible(true);
			}
			else if ((o == btnGeometricas) || (o == menuGeometricas)) {
				this.setVisible(false);
				KalkukidzGeometrica g = new KalkukidzGeometrica();
				g.setVisible(true);
			}
				
			
		}
}

