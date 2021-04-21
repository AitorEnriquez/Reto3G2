package ventanas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import java.io.InputStream;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;

public class MenuOLD extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panelIzq, panelDch;
	private JButton btnCerrar;
	private JLabel lblClientes;
	private InputStream clientespng;
	private JLabel rectanguloNaranja;
	private JLabel rectanguloGris;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuOLD frame = new MenuOLD();
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
	public MenuOLD() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\PROG\\ProyectoReto3G2\\src\\imagenes\\retoLogo_orange.png"));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 997, 808);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setUndecorated(true);
		contentPane.setLayout(null);
		
		panelIzq = new JPanel();
		panelIzq.setBounds(0, -101, 270, 579);
		panelIzq.setBackground(Color.WHITE);
		contentPane.add(panelIzq);
		panelIzq.setLayout(null);
		
		lblClientes = new JLabel("Clientes");
		lblClientes.setBounds(88, 171, 82, 40);
		panelIzq.add(lblClientes);
		lblClientes.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		lblClientes.setForeground(new Color(255, 255, 255));
		
		rectanguloNaranja = new JLabel("");
		rectanguloNaranja.setIcon(new ImageIcon("C:\\PROG\\ProyectoReto3G2\\src\\imagenes\\rectanguloNaranja.png"));
		rectanguloNaranja.setBounds(-15, 62, 224, 649);
		panelIzq.add(rectanguloNaranja);
		
		panelDch = new JPanel();
		panelDch.setBounds(269, 48, 658, 430);
		panelDch.setBackground(new Color(245, 245, 245));
		contentPane.add(panelDch);
		panelDch.setLayout(null);
		
		btnCerrar = new JButton("X");
		btnCerrar.setBounds(607, 10, 7, 15);
		panelDch.add(btnCerrar);
		btnCerrar.setBorder(null);
		
		rectanguloGris = new JLabel("");
		rectanguloGris.setBounds(-12, -68, 670, 498);
		rectanguloGris.setIcon(new ImageIcon("C:\\PROG\\ProyectoReto3G2\\src\\imagenes\\rectanguloGris.png"));
		panelDch.add(rectanguloGris);
		
		//Shape forma =  new Ellipse2D.Float(0,0,getWidth(),getHeight());
		
		/*int[] xPoints = {0, 0 + this.getWidth() / 3, 0 + 2 * (this.getWidth() / 3), this.getWidth(), 0 + 2 * (this.getWidth() / 3), 0 + this.getWidth() / 3};
		int[] yPoints = {this.getHeight() / 2, 0, 0, this.getHeight() / 2, this.getHeight(), this.getHeight()};*/
		//int[] xPoints = {0, 0 + contentPane.getWidth() / 3, 0 + 2 * (contentPane.getWidth() / 3), contentPane.getWidth(), 0 + 2 * (contentPane.getWidth() / 3), 0 + contentPane.getWidth() / 3};
		//int[] yPoints = {contentPane.getHeight() / 2, 0, 0, contentPane.getHeight() / 2, contentPane.getHeight(), contentPane.getHeight()};
		//Shape forma = new Polygon(xPoints, yPoints, 6) ;
		//double x = 50;
		//double y = 50;
		//this.setShape(new RoundRectangle2D.Double(x, y, 850, 430, 50, 50));
		//this.setSize(891,478);
		
		
	}
}
