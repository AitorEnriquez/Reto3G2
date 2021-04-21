package ventanas;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import utilidades.RKMensaje;
public class InicioSesion extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9056946291629360312L;
	private JPanel contentPane;
	private JPanel panelIzq;
	private JPanel panelDch;
	int lastX, lastY;
	private JLabel lblDesplazarIzq;
	private JLabel lblDesplazarDch;

	private JLabel imgLogo;
	private JTextField txtUsuario;
	private JLabel imgUsuario;
	private JLabel imgTxt;
	private JPasswordField txtPwd;
	private JLabel imgTxtPwd;
	private JLabel imgPwd;
	private JButton btnIniciarSesion;
	private JButton btnSalir;
	private JLabel imgSalir;
	private JLabel lblIniciarSesion;
	private JLabel lblSalir;
	private JLabel focusSalir;
	private JLabel clickSalir;
	private JLabel focusIniciarSesion;
	private JLabel clickIniciarSesion;
	private int c = 0;
	private int c2 = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioSesion frame = new InicioSesion();
					frame.setLocation(550,250);
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
	public InicioSesion() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\PROG\\ProyectoReto3G2\\src\\imagenes\\retoLogo_orange.png"));

		getContentPane().setLayout(null);
		setUndecorated(true);
		setSize(2338, 958);
		setLocationRelativeTo(null);
		setShape(new RoundRectangle2D.Double(32, 32, 625, 370, 32, 32));
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panelIzq = new JPanel();
		panelIzq.setBackground(new Color(255,136,0));
		panelIzq.setBounds(32, 30, 278, 377);
		contentPane.add(panelIzq);
		panelIzq.setLayout(null);

		lblDesplazarIzq = new JLabel("");
		lblDesplazarIzq.setBounds(1, 0, 274, 46);
		panelIzq.add(lblDesplazarIzq);
		
		imgLogo = new JLabel("");
		imgLogo.setIcon(new ImageIcon("C:\\PROG\\ProyectoReto3G2\\src\\imagenes\\retoLogoIS.png"));
		imgLogo.setBounds(28, 106, 229, 155);
		panelIzq.add(imgLogo);
		lblDesplazarIzq.addMouseListener(new eventosRaton());
		lblDesplazarIzq.addMouseMotionListener(new eventosRaton2());

		panelDch = new JPanel();
		panelDch.setBackground(new Color(245,245,245));
		panelDch.setBounds(310, 30, 348, 377);
		contentPane.add(panelDch);
		panelDch.setLayout(null);

		lblDesplazarDch = new JLabel("");
		lblDesplazarDch.setBounds(6, 5, 286, 46);
		panelDch.add(lblDesplazarDch);
		
		imgUsuario = new JLabel("");
		imgUsuario.setIcon(new ImageIcon("C:\\PROG\\ProyectoReto3G2\\src\\imagenes\\usuarioIS.png"));
		imgUsuario.setBounds(69, 84, 35, 30);
		panelDch.add(imgUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setText("Usuario...");
		txtUsuario.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		txtUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		txtUsuario.setBounds(106, 82, 152, 32);
		txtUsuario.setBorder(null);
		txtUsuario.setForeground(new Color(127,127,127));
		panelDch.add(txtUsuario);
		txtUsuario.setColumns(20);
		
		imgTxt = new JLabel("");
		imgTxt.setIcon(new ImageIcon("C:\\PROG\\ProyectoReto3G2\\src\\imagenes\\txtIS.png"));
		imgTxt.setBounds(41, 71, 270, 62);
		panelDch.add(imgTxt);
		
		imgPwd = new JLabel("");
		imgPwd.setIcon(new ImageIcon("C:\\PROG\\ProyectoReto3G2\\src\\imagenes\\passwordIS.png"));
		imgPwd.setBounds(69, 154, 35, 37);
		panelDch.add(imgPwd);
		
		txtPwd = new JPasswordField("Contraseña");
		txtPwd.setToolTipText("");
		txtPwd.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		txtPwd.setColumns(20);
		txtPwd.setBounds(106, 156, 152, 32);
		txtPwd.setBorder(null);
		txtPwd.setForeground(new Color(127,127,127));
		panelDch.add(txtPwd);
		
		imgTxtPwd = new JLabel("");
		imgTxtPwd.setIcon(new ImageIcon("C:\\PROG\\ProyectoReto3G2\\src\\imagenes\\txtIS.png"));
		imgTxtPwd.setBounds(41, 144, 270, 62);
		panelDch.add(imgTxtPwd);
		
		lblIniciarSesion = new JLabel("Iniciar Sesi\u00F3n");
		lblIniciarSesion.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		lblIniciarSesion.setBounds(92, 234, 164, 30);
		panelDch.add(lblIniciarSesion);
		
		clickIniciarSesion= new JLabel("");
		clickIniciarSesion.setIcon(new ImageIcon("C:\\PROG\\ProyectoReto3G2\\src\\imagenes\\clickBotonLargo.png"));
		clickIniciarSesion.setBounds(39, 217, 246, 69);
		panelDch.add(clickIniciarSesion);
		
		focusIniciarSesion= new JLabel("");
		focusIniciarSesion.setIcon(new ImageIcon("C:\\PROG\\ProyectoReto3G2\\src\\imagenes\\focusBotonLargo.png"));
		focusIniciarSesion.setBounds(39, 217, 246, 69);
		panelDch.add(focusIniciarSesion);
		
		btnIniciarSesion = new JButton("");
		btnIniciarSesion.setIcon(new ImageIcon("C:\\PROG\\ProyectoReto3G2\\src\\imagenes\\botonLargo.png"));
		btnIniciarSesion.setBounds(38, 217, 251, 69);
		btnIniciarSesion.setBorderPainted(false);
		btnIniciarSesion.setContentAreaFilled(false);
		btnIniciarSesion.setFocusPainted(false);
		panelDch.add(btnIniciarSesion);
		
		imgSalir = new JLabel("");
		imgSalir.setIcon(new ImageIcon("C:\\PROG\\ProyectoReto3G2\\src\\imagenes\\salir.png"));
		imgSalir.setBounds(287, 318, 35, 30);
		panelDch.add(imgSalir);
		
		lblSalir = new JLabel("Salir");
		lblSalir.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblSalir.setBounds(248, 316, 42, 30);
		panelDch.add(lblSalir);
		
		clickSalir = new JLabel("");
		clickSalir.setIcon(new ImageIcon("C:\\PROG\\ProyectoReto3G2\\src\\imagenes\\clickBotonCorto.png"));
		clickSalir.setBounds(226, 304, 115, 61);
		panelDch.add(clickSalir);
		
		focusSalir = new JLabel("");
		focusSalir.setIcon(new ImageIcon("C:\\PROG\\ProyectoReto3G2\\src\\imagenes\\focusBotonCorto.png"));
		focusSalir.setBounds(226, 304, 115, 61);
		panelDch.add(focusSalir);
		
		
		
		btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon("C:\\PROG\\ProyectoReto3G2\\src\\imagenes\\botonCorto.png"));
		btnSalir.setBounds(229, 304, 109, 62);
		btnSalir.setBorderPainted(false);
		btnSalir.setContentAreaFilled(false);
		btnSalir.setFocusPainted(false);
		panelDch.add(btnSalir);
		
		//GENERALES\\
		setLocation(550,250);
		setVisible(true);
		requestFocus();
		focusSalir.setVisible(false);
		clickSalir.setVisible(false);
		focusIniciarSesion.setVisible(false);
		clickIniciarSesion.setVisible(false);
		
		contentPane.addMouseListener(new eventosRaton());
		lblDesplazarDch.addMouseListener(new eventosRaton());
		btnSalir.addMouseListener(new eventosRaton());
		btnIniciarSesion.addMouseListener(new eventosRaton());
		txtUsuario.addMouseListener(new eventosRaton());
		txtPwd.addMouseListener(new eventosRaton());
		
		contentPane.addMouseMotionListener(new eventosRaton2());
		lblDesplazarDch.addMouseMotionListener(new eventosRaton2());
		
		txtUsuario.addFocusListener(new eventosFocus());
		txtPwd.addFocusListener(new eventosFocus());
		
		btnIniciarSesion.addActionListener(this);
		btnSalir.addActionListener(this);
		txtUsuario.addActionListener(this);
		txtPwd.addActionListener(this);
		
		txtUsuario.addKeyListener(new eventosTeclado());
		
		
		
		//CONEXION A BASE DE DATOS\\
		
		
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
	// Clases \\
	
	private boolean estaSeleccionado (JTextField j) {
		
		/*if (j.getText().trim().isEmpty()) {
			return false;
		}*/
		
		if (j.getSelectedText().length()<=0) {
			return false;
		}
			
		
		else { //if (j.getSelectedText().length()>=1) {
			return true;
			}
		//}
			
	}
	
	private class eventosRaton extends MouseAdapter {

		@Override
		public void mousePressed(MouseEvent me) {
			Object o = me.getSource();
			if (o == lblDesplazarIzq || o == lblDesplazarDch) {
				lastX = me.getXOnScreen();
				lastY = me.getYOnScreen();
			}
			else if (o == btnSalir) {
				clickSalir.setVisible(true);
			}
			else if (o == btnIniciarSesion) {
				clickIniciarSesion.setVisible(true);
			}
		}
		
		@Override
		public void mouseReleased(MouseEvent me) {
			Object o = me.getSource();
			if (o == lblDesplazarDch || o == lblDesplazarIzq) {
				contentPane.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			else if (o == btnSalir) {
				clickSalir.setVisible(false);
			}
			else if (o == btnIniciarSesion) {
				clickIniciarSesion.setVisible(false);
			}
		}
		
		@Override
		public void mouseEntered(MouseEvent me) {
			Object o = me.getSource();
			if (o == btnSalir) {
				focusSalir.setVisible(true);
			}
			else if (o == btnIniciarSesion) {
				focusIniciarSesion.setVisible(true);
			}
 		}
		
		@Override
		public void mouseExited(MouseEvent me) {
			Object o = me.getSource();
			if (o == btnSalir) {
				focusSalir.setVisible(false);
			}
			else if (o == btnIniciarSesion) {
				focusIniciarSesion.setVisible(false);
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

	private class eventosTeclado extends KeyAdapter {
		@Override
		public void keyTyped(KeyEvent ke) {
			Object o = ke.getSource();
			if (o == txtUsuario) {
				while (c<=0) {
					txtUsuario.setText("");
					txtUsuario.setForeground(Color.black);
					c++;
				}
					if (txtUsuario.getText().length() >=9 && !estaSeleccionado(txtUsuario) ) {
						ke.consume();
					}
			}
		}
	}
	
	private class eventosFocus extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent fe) {
			Object o = fe.getSource();
			
			if (o == txtUsuario) {
				while (c <= 0) {
					txtUsuario.setText("");
					txtUsuario.setForeground(Color.black);
					c++;
				}
				txtUsuario.select(0, txtUsuario.getText().length());
			}
			else if(o == txtPwd) {
				while (c2 <= 0) {
					txtPwd.setText("");
					txtPwd.setForeground(Color.black);
					c2++;
				}
				txtPwd.select(0, txtPwd.getPassword().toString().length());
			}
		}
	}
	
	// ACTION LISTENER\\
	@Override
	public void actionPerformed(ActionEvent ae) {
		Object o = ae.getSource();
		if (o == btnIniciarSesion || o == txtPwd || o == txtUsuario) {
			String usuario = txtUsuario.getText();
			String pwd = new String(txtPwd.getPassword());
			
			if (usuario.trim().isEmpty() || pwd.trim().isEmpty()) {
				new RKMensaje("Por favor, rellena todos los campos");
			}
			else {
				try {
					Connection conexion = DriverManager.getConnection("jdbc:mysql://linuxsrv.h015110.net:3306/RekordAutoak", usuario, pwd);
					conexion.close();
					this.dispose();
					Menu m = new Menu();
					m.setVisible(true);
					
				}
				catch (SQLException e) {
					
					if (e.getErrorCode() == 1045) {
						new RKMensaje("El usuario y/o la contraseña no coinciden");
					}
					else {
						new RKMensaje("Error SQL Numero" + e.getErrorCode() + ": " + e.getMessage());
					}
					
					
				}
			}
			
		}
		else if (o == btnSalir) {
			System.exit(0);
		}
	}
}
