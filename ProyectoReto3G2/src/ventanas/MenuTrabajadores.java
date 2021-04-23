package ventanas;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.RoundRectangle2D;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JList;

public class MenuTrabajadores extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9056946291629360312L;
	private JPanel contentPane;
	private JPanel panelIzq;
	private JPanel panelDch;
	private JLabel imgLogo;
	private JButton btnClientes;
	private JLabel clickBoton;
	private JLabel focusBoton;
	int lastX, lastY;
	private JLabel lblDesplazarIzq;
	private JLabel lblDesplazarDch;
	private JButton btnSalir;

	private JLabel imgClientes;
	private JButton btnAgregarUsuario;
	private JLabel lblAgregar;
	private JButton btnEliminarUsuario;
	private JLabel lblEliminar;
	private JButton btnCerrar;
	private JLabel lblCerrar;
	private JLabel imgCerrar;
	private JLabel focusCerrar;
	private JLabel clickCerrar;
	private JButton btnTrabajadores;
	private JLabel imgTrabajadores;
	private JList lstClientes;
	private JLabel imgLista;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuTrabajadores frame = new MenuTrabajadores();
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
	public MenuTrabajadores() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\PROG\\ProyectoReto3G2\\src\\imagenes\\retoLogo_orange.png"));

		getContentPane().setLayout(null);
		setUndecorated(true);
		setSize(2338, 958);
		setLocationRelativeTo(null);
		setShape(new RoundRectangle2D.Double(32, 32, 1190, 479, 32, 32));
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panelIzq = new JPanel();
		panelIzq.setBackground(new Color(255,136,0));
		panelIzq.setBounds(32, 30, 283, 483);
		contentPane.add(panelIzq);
		panelIzq.setLayout(null);

		lblDesplazarIzq = new JLabel("");
		lblDesplazarIzq.setBounds(1, 0, 274, 46);
		panelIzq.add(lblDesplazarIzq);

		imgClientes = new JLabel("");
		imgClientes.setIcon(new ImageIcon("C:\\PROG\\ProyectoReto3G2\\src\\imagenes\\clientess.png"));
		imgClientes.setBounds(21, 151, 40, 36);
		panelIzq.add(imgClientes);

		btnClientes = new JButton("Clientes");
		btnClientes.setHorizontalAlignment(SwingConstants.CENTER);
		btnClientes.setForeground(Color.WHITE);
		btnClientes.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		btnClientes.setBounds(10, 147, 249, 41);
		btnClientes.setBorderPainted(false);
		btnClientes.setContentAreaFilled(false);
		btnClientes.setFocusPainted(false);

		panelIzq.add(btnClientes);
		
		imgTrabajadores = new JLabel("");
		imgTrabajadores.setIcon(new ImageIcon("C:\\PROG\\ProyectoReto3G2\\src\\imagenes\\trabajadoress.png"));
		imgTrabajadores.setBounds(21, 224, 40, 36);
		panelIzq.add(imgTrabajadores);
		
		btnTrabajadores = new JButton("Trabajadores");
		btnTrabajadores.setHorizontalAlignment(SwingConstants.CENTER);
		btnTrabajadores.setForeground(Color.WHITE);
		btnTrabajadores.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		btnTrabajadores.setFocusPainted(false);
		btnTrabajadores.setContentAreaFilled(false);
		btnTrabajadores.setBorderPainted(false);
		btnTrabajadores.setBounds(3, 224, 272, 41);
		panelIzq.add(btnTrabajadores);

		imgLogo = new JLabel("");
		imgLogo.setIcon(new ImageIcon("C:\\PROG\\ProyectoReto3G2\\src\\imagenes\\retoLogoo.png"));
		imgLogo.setBounds(70, 38, 134, 96);
		panelIzq.add(imgLogo);

		clickBoton = new JLabel("");
		clickBoton.setIcon(new ImageIcon("C:\\PROG\\ProyectoReto3G2\\src\\imagenes\\seleccionMenu.png"));
		clickBoton.setBounds(-3, 213, 283, 75);
		panelIzq.add(clickBoton);
		
		focusBoton = new JLabel("");
		focusBoton.setIcon(new ImageIcon("C:\\PROG\\ProyectoReto3G2\\src\\imagenes\\focusMenu.png"));
		focusBoton.setBounds(-5, 138, 283, 75);
		panelIzq.add(focusBoton);

		panelDch = new JPanel();
		panelDch.setBackground(new Color(245,245,245));
		panelDch.setBounds(312, 26, 939, 487);
		contentPane.add(panelDch);
		panelDch.setLayout(null);
		
		lblDesplazarDch = new JLabel("");
		lblDesplazarDch.setBounds(119, 7, 678, 46);
		panelDch.add(lblDesplazarDch);

		btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon("C:\\PROG\\ProyectoReto3G2\\src\\imagenes\\cerrar.png"));
		btnSalir.setBounds(852, 6, 59, 46);
		btnSalir.setBorderPainted(false);
		btnSalir.setContentAreaFilled(false);
		btnSalir.setFocusPainted(false);
		panelDch.add(btnSalir);
				
		lblAgregar = new JLabel("Agregar");
		lblAgregar.setVerticalAlignment(SwingConstants.TOP);
		lblAgregar.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregar.setFont(new Font("Segoe UI", Font.PLAIN, 21));
		lblAgregar.setBounds(234, 345, 98, 30);
		panelDch.add(lblAgregar);
		

		btnAgregarUsuario = new JButton("");
		btnAgregarUsuario.setBackground(new Color(199, 199, 199));
				
		btnAgregarUsuario.setIcon(new ImageIcon("C:\\PROG\\ProyectoReto3G2\\src\\imagenes\\agregarUsuario.png"));
		btnAgregarUsuario.setBounds(221, 376, 126, 80);
		btnAgregarUsuario.setBorderPainted(false);
		btnAgregarUsuario.setFocusPainted(false);
		panelDch.add(btnAgregarUsuario);
				
		
		lblEliminar = new JLabel("Eliminar");
		lblEliminar.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminar.setVerticalAlignment(SwingConstants.TOP);
		lblEliminar.setFont(new Font("Segoe UI", Font.PLAIN, 21));
		lblEliminar.setBounds(417, 347, 98, 30);
		panelDch.add(lblEliminar);
		
		btnEliminarUsuario = new JButton("");
		btnEliminarUsuario.setIcon(new ImageIcon("C:\\PROG\\ProyectoReto3G2\\src\\imagenes\\eliminarUsuario.png"));
		btnEliminarUsuario.setBackground(new Color(199, 199, 199));
		btnEliminarUsuario.setBounds(404, 376, 126, 80);
		btnEliminarUsuario.setBorderPainted(false);
		btnEliminarUsuario.setFocusPainted(false);
		panelDch.add(btnEliminarUsuario);
		
		lblCerrar = new JLabel("Cerrar Sesion");
		lblCerrar.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		lblCerrar.setBounds(688, 426, 144, 30);
		panelDch.add(lblCerrar);
		
		imgCerrar = new JLabel("");
		imgCerrar.setIcon(new ImageIcon("C:\\PROG\\ProyectoReto3G2\\src\\imagenes\\salir.png"));
		imgCerrar.setBounds(842, 426, 35, 30);
		panelDch.add(imgCerrar);

		clickCerrar = new JLabel("");
		clickCerrar.setIcon(new ImageIcon("C:\\PROG\\ProyectoReto3G2\\src\\imagenes\\clickBotonLargo.png"));
		clickCerrar.setBounds(651, 414, 260, 61);
		panelDch.add(clickCerrar);
		
		focusCerrar = new JLabel("");
		focusCerrar.setIcon(new ImageIcon("C:\\PROG\\ProyectoReto3G2\\src\\imagenes\\focusBotonLargo.png"));
		focusCerrar.setBounds(651, 414, 260, 61);
		panelDch.add(focusCerrar);
		
		btnCerrar = new JButton("");
		btnCerrar.setIcon(new ImageIcon("C:\\PROG\\ProyectoReto3G2\\src\\imagenes\\botonLargo.png"));
		btnCerrar.setFocusPainted(false);
		btnCerrar.setContentAreaFilled(false);
		btnCerrar.setBorderPainted(false);
		btnCerrar.setBounds(644, 414, 260, 62);
		panelDch.add(btnCerrar);
		
		lstClientes = new JList();
		lstClientes.setBounds(75, 112, 742, 141);
		panelDch.add(lstClientes);
		
		imgLista = new JLabel("");
		imgLista.setIcon(new ImageIcon("C:\\PROG\\ProyectoReto3G2\\src\\imagenes\\rectanguloLista.png"));
		imgLista.setBounds(36, 82, 813, 199);
		panelDch.add(imgLista);
		
		//Por Defecto\\
		setLocation(350,200);
		setVisible(true);
		
		focusBoton.setVisible(false);
		focusCerrar.setVisible(false);
		clickCerrar.setVisible(false);
		
		/*CUIDADO A VECES LOS LISTENERS SE PONEN ARRIBA, SOBRE TODO CUANDO SE FORMATEA EL DOCUMENTO*/
		
		// Listeners MouseListener\\
		lblDesplazarIzq.addMouseListener(new eventosRaton());
		lblDesplazarDch.addMouseListener(new eventosRaton());
		btnClientes.addMouseListener(new eventosRaton());
		contentPane.addMouseListener(new eventosRaton());
		btnSalir.addMouseListener(new eventosRaton());
		btnAgregarUsuario.addMouseListener(new eventosRaton());
		btnEliminarUsuario.addMouseListener(new eventosRaton());
		btnCerrar.addMouseListener(new eventosRaton());
		btnTrabajadores.addMouseListener(new eventosRaton());
		// Listeners MouseMotionListener\\
		lblDesplazarIzq.addMouseMotionListener(new eventosRaton2());
		lblDesplazarDch.addMouseMotionListener(new eventosRaton2());
		btnClientes.addMouseMotionListener(new eventosRaton2());
		contentPane.addMouseMotionListener(new eventosRaton2());
		btnAgregarUsuario.addMouseMotionListener(new eventosRaton2());
		btnEliminarUsuario.addMouseMotionListener(new eventosRaton2());
		btnTrabajadores.addMouseMotionListener(new eventosRaton2());
		// Listeners ActionListener\\
		btnClientes.addActionListener(this);
		btnSalir.addActionListener(this);
		btnAgregarUsuario.addActionListener(this);
		btnEliminarUsuario.addActionListener(this);
		btnCerrar.addActionListener(this);
		btnTrabajadores.addActionListener(this);
		
		
		/*
		 * setResizable(false); setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 * setBounds(100, 100, 645, 441); setUndecorated(true); setShape(new
		 * RoundRectangle2D.Double(32, 32, 1169, 279, 32, 32)); setSize(1169, 479);
		 * setLocationByPlatform(true); setVisible(true); contentPane = new JPanel();
		 * contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		 * setContentPane(contentPane); contentPane.setLayout(null);
		 * 
		 * panelIzq = new JPanel(); panelIzq.setBackground(Color.GREEN);
		 * panelIzq.setBounds(26, 26, 147, 453); contentPane.add(panelIzq);
		 * 
		 * panelDch = new JPanel(); panelDch.setBackground(Color.GREEN);
		 * panelDch.setBounds(372, 26, 787, 453); contentPane.add(panelDch);
		 */

	}
	// Funciones \\

	public void focusBoton(JButton j) {
		// Este método se usará en mouseEntered, recoge un botón y dependiendo de su situación le hace focus:
		// Si paso el ratón por un componente, el cursor cambiará a HAND (el de la manita).
		// SOLO si el componente NO está seleccionado, U OTRO COMPONENTE está seleccionado, hará focus.
		// Revisa si otro componente está seleccionado revisando la posición
		contentPane.setCursor(new Cursor(Cursor.HAND_CURSOR));
		if (j == btnClientes) {
				focusBoton.setLocation(-3,138);
				focusBoton.setVisible(true);
		}
	}
	
	public void clickBoton(JButton j) {
		//Si es Clientes
		if (j == btnClientes) {
			new MenuClientes();
			this.dispose();
		}
		//Si es trabajadores
		else if (j == btnTrabajadores) {
			new Menu();
			this.dispose();
		}
	}
			
	private class eventosRaton extends MouseAdapter {

		@Override
		public void mousePressed(MouseEvent me) {
			Object o = me.getSource();
			if (o == lblDesplazarIzq || o == lblDesplazarDch) {
				lastX = me.getXOnScreen();
				lastY = me.getYOnScreen();
			}
			else if (o == btnCerrar) {
				clickCerrar.setVisible(true);
			}
		}

		@Override
		public void mouseReleased(MouseEvent me) {
			Object o = me.getSource();
			if (o == lblDesplazarDch || o == lblDesplazarIzq) {
				contentPane.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			else if (o == btnCerrar) {
				clickCerrar.setVisible(false);
			}
		}
		
		@Override
		public void mouseEntered(MouseEvent me) {
			Object o = me.getSource();

			if (o == btnClientes) {focusBoton(btnClientes);}
			else if (o == btnTrabajadores) {focusBoton(btnTrabajadores);}
			
			else if (o == btnAgregarUsuario) {	
				btnAgregarUsuario.setBackground(new Color(232, 232, 232));
			}
			
			else if (o == btnEliminarUsuario) {
				btnEliminarUsuario.setBackground(new Color(232, 232, 232));
			}

			else if (o == btnSalir) {
				btnSalir.setContentAreaFilled(true);
				btnSalir.setBackground(new Color(250,65,73));
			}
			else if (o == btnCerrar) {
				focusCerrar.setVisible(true);
			}
		}

		@Override
		public void mouseExited(MouseEvent me) {
			Object o = me.getSource();
			if (o == btnClientes || o == btnTrabajadores) {
				focusBoton.setVisible(false);
				contentPane.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			else if (o == btnSalir) {
				btnSalir.setContentAreaFilled(false);
			}
			else if (o == btnAgregarUsuario) {
				btnAgregarUsuario.setBackground(new Color(199, 199, 199));
			}
			else if (o == btnEliminarUsuario) {
				btnEliminarUsuario.setBackground(new Color(199, 199, 199));
			}
			else if (o == btnCerrar) {
				focusCerrar.setVisible(false);
			}
		}
	}

	private class eventosRaton2 extends MouseMotionAdapter {

		@Override
		public void mouseDragged(MouseEvent me) {
			Object o = me.getSource();
			if (o == lblDesplazarIzq || o == lblDesplazarDch) {
				int x = me.getXOnScreen();
				int y = me.getYOnScreen();
				setLocation(getLocationOnScreen().x + x - lastX, getLocationOnScreen().y + y - lastY);
				lastX = x;
				lastY = y;
				contentPane.setCursor(new Cursor(Cursor.MOVE_CURSOR));
			}

		}
	}

	// ACTION LISTENER\\
	@Override
	public void actionPerformed(ActionEvent ae) {
		Object o = ae.getSource();
		
		if (o == btnClientes) {
			clickBoton(btnClientes);
		}
		else if (o == btnTrabajadores) {
			clickBoton(btnTrabajadores);
		}
		else if (o == btnCerrar) {
			this.dispose();
			InicioSesion is = new InicioSesion();
			is.setVisible(true);
		}
		else if (o == btnSalir) {
			System.exit(0);
		}
	}
}
