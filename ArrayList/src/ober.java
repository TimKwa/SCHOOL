import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ober {

	private JFrame frame;
	private Test nTest = new Test();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ober window = new ober();
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
	public ober() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnFge = new JButton("f\u00FCge");
		btnFge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			nTest.fuegeTausendElementeHinzu();
			}
		});
		btnFge.setBounds(89, 89, 89, 23);
		frame.getContentPane().add(btnFge);
		
		JButton btnDrucke = new JButton("drucke");
		btnDrucke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			nTest.druckeAlles();
			}
		});
		btnDrucke.setBounds(262, 89, 89, 23);
		frame.getContentPane().add(btnDrucke);
	}
}
