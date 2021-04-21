package utilidades;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.RoundRectangle2D;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


public class RKMensaje extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5588522186882063234L;
	private JPanel contentPane;
	private JPanel panel;
	int lastX, lastY;
	private JLabel lblMensaje;
	private JLabel imgBtn;
	private JButton btnAceptar;
	private JLabel lblDesplazar;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RKMensaje frame = new RKMensaje();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public RKMensaje(String s) {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setAlwaysOnTop(true);
		setType(Type.UTILITY);
		getContentPane().setLayout(null);
		setUndecorated(true);
		setSize(2338, 958);
		setLocationRelativeTo(null);
		setShape(new RoundRectangle2D.Double(32, 32, 460, 110, 32, 32));
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panel = new JPanel();
		panel.setBackground(new Color(255,136,0));
		panel.setBounds(29, 11, 463, 132);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblDesplazar = new JLabel("");
		lblDesplazar.setVerticalAlignment(SwingConstants.TOP);
		lblDesplazar.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesplazar.setBounds(3, 22, 459, 17);
		panel.add(lblDesplazar);
		lblDesplazar.addMouseListener(new eventosRaton());
		lblDesplazar.addMouseMotionListener(new eventosRaton2());
		
		lblMensaje = new JLabel(s);
		lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensaje.setForeground(Color.WHITE);
		lblMensaje.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblMensaje.setBounds(11, 34, 442, 29);
		panel.add(lblMensaje);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setHorizontalAlignment(SwingConstants.LEFT);
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
			dispose();
			}
		});
		
		btnAceptar.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		btnAceptar.setBounds(176, 70, 111, 50);
		btnAceptar.setBackground(new Color(199, 199, 199));
		
		btnAceptar.setBorderPainted(false);
		btnAceptar.setContentAreaFilled(false);
		btnAceptar.setFocusPainted(false);
		panel.add(btnAceptar);
		
		imgBtn = new JLabel("");
		imgBtn.setIcon(new ImageIcon("C:\\PROG\\ProyectoReto3G2\\src\\imagenes\\salirIS.png"));
		imgBtn.setBounds(170, 71, 120, 61);
		panel.add(imgBtn);
		
		
		
		setLocation(650,350);
		setVisible(true);
		
		//Listeners\\
		contentPane.addMouseListener(new eventosRaton());
		
		contentPane.addMouseMotionListener(new eventosRaton2());
		
		contentPane.addKeyListener(new eventosTeclado());
	}
	
	
	
	// Funciones \\
	
	private class eventosRaton extends MouseAdapter {

		@Override
		public void mousePressed(MouseEvent me) {
			Object o = me.getSource();
			if (o == lblDesplazar) {
				lastX = me.getXOnScreen();
				lastY = me.getYOnScreen();
			}

		}

		@Override
		public void mouseReleased(MouseEvent me) {
			Object o = me.getSource();
			if (o == lblDesplazar) {
				contentPane.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		}

	}

	private class eventosRaton2 extends MouseMotionAdapter {

		@Override
		public void mouseDragged(MouseEvent me) {
			Object o = me.getSource();
			if (o == lblDesplazar) {
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
		public void keyPressed(KeyEvent ke) {
			int tecla = ke.getKeyCode();
			if (tecla == KeyEvent.VK_ENTER) {
				dispose();
			}
			
		}
	}
}
