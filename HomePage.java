import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class HomePage extends JFrame {

	private JPanel HomePage;
	private JTextField ApplicantUser;
	private JPasswordField ApplicantPassword;
	private JButton Admin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 800);
		HomePage = new JPanel();
		HomePage.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(HomePage);
		setLocationRelativeTo(null);
		HomePage.setLayout(null);
		
		//TEXT FIELDS ====================================================================================

		
		ApplicantUser = new JTextField();
		ApplicantUser.setBounds(874, 391, 246, 41);
		HomePage.add(ApplicantUser);
		ApplicantUser.setColumns(10);
		
		JCheckBox showHidePass = new JCheckBox("Show Password");
		showHidePass.setBounds(1004, 457, 114, 23);
		showHidePass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(showHidePass.isSelected()) {
					
					ApplicantPassword.setEchoChar((char)0);
					
				} else {
					
					ApplicantPassword.setEchoChar('•');
					
				}
			}
		});
		showHidePass.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		HomePage.add(showHidePass);
		
		ApplicantPassword = new JPasswordField();
		ApplicantPassword.setBounds(874, 484, 246, 41);
		HomePage.add(ApplicantPassword);
		
		//BUTTONS ====================================================================================
		
		
		JButton Register = new JButton("New button");
		Admin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				dispose();
			}
		});
		Register.setIcon(new ImageIcon(" "));
		Register.setBounds(1018, 83, 102, 41);
		HomePage.add(Register);
		
		
		Admin = new JButton("New button");
		Admin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				dispose();
			}
		});
		Admin.setIcon(new ImageIcon(" "));
		Admin.setBounds(1151, 89, 95, 29);
		HomePage.add(Admin);

		
		//BACKGROUND====================================================================================
		
		JLabel HomeBG = new JLabel("New label");
		HomeBG.setIcon(new ImageIcon("C:\\Users\\Marc Cadiz\\eclipse-workspace\\FinalUI\\ADMIN\\Home.png"));
		HomeBG.setBounds(0, 0, 1300, 800);
		HomePage.add(HomeBG);
		
	}
}
