package desin;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class InterfazExamen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazExamen window = new InterfazExamen();
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
	public InterfazExamen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Mi interfaz en Java Swing");

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        
        JLabel lblenQuExamen = new JLabel("¿En qué examen estamos?");
        panel.add(lblenQuExamen);

        JButton btn = new JButton("Haz clic para saberlo");
        btn.addActionListener(e -> JOptionPane.showMessageDialog(frame, "¡Estamos en el quinto examen de desin!"));
        panel.add(btn);
	}
}