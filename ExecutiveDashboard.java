import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import javax.swing.JPanel;

public class ExecutiveDashboard {

    public JFrame ExecutiveDashboard;
    
    //Added Positions
    private DefaultTableModel model;
    private JTable dash_table;
    
    //Applicant Count
    private DefaultTableModel model2;
    private JPanel AppCount;
    
    private Map<String, Integer> applicantCounts = new HashMap<String, Integer>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExecutiveDashboard window = new ExecutiveDashboard();
					window.ExecutiveDashboard.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
    public ExecutiveDashboard() {
        initialize();
    }
    public JTable getTable() {
        return dash_table;
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
    	ExecutiveDashboard = new JFrame();
    	ExecutiveDashboard.setBounds(100, 100, 1026, 645);
    	ExecutiveDashboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	ExecutiveDashboard.setLocationRelativeTo(null);
    	ExecutiveDashboard.getContentPane().setLayout(null);

        
        // Tables ====================================================================================

	    // Added Positions
        model = new DefaultTableModel();
	    
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(36, 115, 484, 386);
        ExecutiveDashboard.getContentPane().add(scrollPane);
        
        dash_table = new JTable();
        scrollPane.setViewportView(dash_table);
        dash_table.setModel(model);       
        dash_table.setShowGrid(true);
        dash_table.setShowHorizontalLines(true);
        dash_table.setGridColor(Color.black);   
        dash_table.setEnabled(false);
        dash_table.setFocusable(false);
        dash_table.setRowSelectionAllowed(false);
        dash_table.getTableHeader().setReorderingAllowed(false);
        dash_table.getTableHeader().setResizingAllowed(false);
        dash_table.setFont(new Font("Arial", Font.PLAIN, 12));
        Object[] column = {"       Position Code","          Job Title", "    Responsibilities", "            Salary"};
        model.setColumnIdentifiers(column);
        final Object[] row = new Object[4];
        model.setColumnIdentifiers(column);      
        scrollPane.setViewportView(dash_table);

	    
	    // Applicant Count 
        model2 = new DefaultTableModel();

	    AppCount = new JPanel();
        AppCount.setBounds(578, 115, 400, 386);
        AppCount.setBackground(Color.WHITE);
        ExecutiveDashboard.getContentPane().add(AppCount);
        AppCount.setLayout(null);


        // BUTTONS ====================================================================================

        //Job Posting Button
        JButton btn_JobPosting = new JButton("");
        btn_JobPosting.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Job_Posting JobPosting = new Job_Posting(dash_table, getTable());
                JobPosting.JobPosting.setVisible(true);
                ExecutiveDashboard.dispose();
            }
        });
        btn_JobPosting.setIcon(new ImageIcon(" "));
        btn_JobPosting.setBackground(new Color(11, 20, 10));
        btn_JobPosting.setBounds(873, 54, 116, 40);
        ExecutiveDashboard.getContentPane().add(btn_JobPosting);

        //Log Out Button
        JButton btn_LogOut = new JButton("");
        btn_LogOut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Admin_Log AdminLog = new Admin_Log();
                AdminLog.setVisible(true);
                ExecutiveDashboard.dispose();
            }
        });
        btn_LogOut.setIcon(new ImageIcon(" "));
        btn_LogOut.setBounds(731, 54, 116, 40);
        ExecutiveDashboard.getContentPane().add(btn_LogOut);

        // BACKGROUND====================================================================================

        JLabel ExecutiveDash_BG = new JLabel("");
        ExecutiveDash_BG.setIcon(new ImageIcon("C:\\Users\\Marc Cadiz\\eclipse-workspace\\FinalUI\\ADMIN\\ExecDash.png"));
        ExecutiveDash_BG.setBounds(0, 0, 1026, 617);
        ExecutiveDash.getContentPane().add(ExecutiveDash_BG);
    }
}
