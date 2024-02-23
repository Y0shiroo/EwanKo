import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.Font;

public class AdminLogin extends JFrame {

    private JPanel contentPane;
    private JTextField AdminUser;
    private JPasswordField AdminPass;
    private JButton btn_Login;
    private JButton BackButton;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AdminLogin frame = new AdminLogin();
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
    public AdminLogin() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1026, 645);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setLocationRelativeTo(null);

        //TEXT FIELDS ====================================================================================
        
        AdminUser = new JTextField();
        AdminUser.setBounds(717, 297, 257, 43);
        contentPane.add(AdminUser);
        AdminUser.setColumns(10);
        
        AdminPass = new JPasswordField();
        AdminPass.setBounds(717, 367, 257, 43);
        contentPane.add(AdminPass);
        
        JCheckBox showHideButton = new JCheckBox("Show Password");
        showHideButton.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
        showHideButton.setBounds(860, 346, 114, 23);
        showHideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (showHideButton.isSelected()) {
                    AdminPass.setEchoChar((char) 0);
                } else {
                    AdminPass.setEchoChar('•');
                }
            }
        });
        contentPane.add(showHideButton);

        //BUTTONS ====================================================================================
        
        btn_Login = new JButton(new ImageIcon(" "));
        btn_Login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = AdminUser.getText();
                String password = new String(AdminPass.getPassword());
                
                if (username.equals("NCProjectsAdmin") && password.equals("Admin2023")){ 
					AdminUser.setText(null);
					AdminPass.setText(null);
		            JOptionPane.showMessageDialog(null, "Login Successfully!");
					ExecutiveDashboard ExecutiveDash = new ExecutiveDashboard();
					ExecutiveDash.ExecutiveDashboard.setVisible(true);
					dispose();			              
		          
		      } else if(username.isEmpty() && password.isEmpty()){  
		    	  JOptionPane.showMessageDialog(null, "Enter Username and Password!");
		      } else if(username.equals("NCVAProjectsAdmin") && !password.equals("Admin2024")){
		    	  JOptionPane.showMessageDialog(null, "Invalid Password!");
		      } else if(!username.equals("NCVAProjectsAdmin") && password.equals("Admin2024")){
		    	  JOptionPane.showMessageDialog(null, "Invalid Username!");
		      } else if(!username.equals("NCVAProjectsAdmin") && !password.equals("Admin2024")){
		    	  JOptionPane.showMessageDialog(null, "Invalid Username and Password!");  
		      }		
		}
	});
        btn_Login.setBounds(758, 440, 139, 40);
        contentPane.add(btn_Login);

        BackButton = new JButton(new ImageIcon(" "));
        BackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HomePage homePage = new HomePage();
                homePage.setVisible(true);
                dispose();
            }
        });
        BackButton.setBounds(729, 0, 139, 40);
        contentPane.add(BackButton);

        //BACKGROUND====================================================================================
        
        JLabel lbl_AdminLogBG = new JLabel(new ImageIcon("C:\\Users\\Marc Cadiz\\eclipse-workspace\\FinalUI\\ADMIN\\AdminLogin.png"));
        lbl_AdminLogBG.setBounds(0, 0, 1026, 617);
        contentPane.add(lbl_AdminLogBG);
    }
}
