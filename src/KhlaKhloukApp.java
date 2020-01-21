import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

/*
 * @author: Chhai Chivon on Jan 19, 2020
 * Senior Application Developer
 */

public class KhlaKhloukApp {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KhlaKhloukApp window = new KhlaKhloukApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public KhlaKhloukApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 461, 378);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel lblKdam = new JLabel("New label");
		lblKdam.setBackground(Color.RED);
		lblKdam.setIcon(new ImageIcon("/Users/chhaichivon/eclipse-workspace/MITEKhlaKhloukGameClient/ក្តាម.png"));
		lblKdam.setBounds(26, 56, 124, 134);
		frame.getContentPane().add(lblKdam);
		
		JLabel lblKla = new JLabel("New label");
		lblKla.setIcon(new ImageIcon("/Users/chhaichivon/eclipse-workspace/MITEKhlaKhloukGameClient/ខ្លា.png"));
		lblKla.setBackground(Color.RED);
		lblKla.setBounds(162, 56, 124, 134);
		frame.getContentPane().add(lblKla);
		
		JLabel lblKhlouk = new JLabel("New label");
		lblKhlouk.setIcon(new ImageIcon("/Users/chhaichivon/eclipse-workspace/MITEKhlaKhloukGameClient/ឃ្លោក.png"));
		lblKhlouk.setBackground(Color.RED);
		lblKhlouk.setBounds(294, 56, 124, 134);
		frame.getContentPane().add(lblKhlouk);
		
		JLabel lblTrey = new JLabel("New label");
		lblTrey.setIcon(new ImageIcon("/Users/chhaichivon/eclipse-workspace/MITEKhlaKhloukGameClient/ត្រី.png"));
		lblTrey.setBackground(Color.RED);
		lblTrey.setBounds(36, 202, 124, 134);
		frame.getContentPane().add(lblTrey);
		
		JLabel lblBongKong = new JLabel("New label");
		lblBongKong.setIcon(new ImageIcon("/Users/chhaichivon/eclipse-workspace/MITEKhlaKhloukGameClient/បង្កង.png"));
		lblBongKong.setBackground(Color.RED);
		lblBongKong.setBounds(172, 202, 124, 134);
		frame.getContentPane().add(lblBongKong);
		
		JLabel lblMon = new JLabel("New label");
		lblMon.setIcon(new ImageIcon("/Users/chhaichivon/eclipse-workspace/MITEKhlaKhloukGameClient/មាន់.png"));
		lblMon.setBackground(Color.RED);
		lblMon.setBounds(308, 202, 124, 134);
		frame.getContentPane().add(lblMon);
	}
}
