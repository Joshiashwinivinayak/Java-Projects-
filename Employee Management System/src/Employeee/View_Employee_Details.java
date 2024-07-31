
package Employeee;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.proteanit.sql.DbUtils;
import javax.swing.JTable;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author hp
 */
public class View_Employee_Details extends JFrame {
	Connection conn = null;
	private JPanel contentPane;
	private JTable table;
	private JLabel lblAvailability;
	private JLabel lblCleanStatus;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblRoomNumber;
	private JLabel lblId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
                                View_Employee_Details    frame = new View_Employee_Details();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

        
	public View_Employee_Details() throws SQLException {
		//conn = Javaconnect.getDBConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(580, 220, 1300, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("Employeee/icons/viewAll.jpg"));
                Image i3 = i1.getImage().getScaledInstance(626, 201,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(0,450,626,201);
                add(l1);
                
                ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("Employeee/icons/viewAll.jpg"));
                Image i5 = i4.getImage().getScaledInstance(626, 201,Image.SCALE_DEFAULT);
                ImageIcon i6 = new ImageIcon(i5);
                JLabel l2 = new JLabel(i6);
                l2.setBounds(615,450,700,201);
                add(l2);
                
		
		table = new JTable();
		table.setBounds(0, 40, 1300, 350);
		contentPane.add(table);
                
                try{
                    conn c = new conn();
                        String displayEmployeesql = "select * from employee";
                        ResultSet rs = c.s.executeQuery(displayEmployeesql);
                        table.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch(Exception e1){
                        e1.printStackTrace();
                }
		
		JButton b = new JButton("Back");
                b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		setVisible(false);
                new details();
		}
		});
		b.setBounds(550, 400, 120, 30);
                b.setBackground(Color.BLACK);
                b.setForeground(Color.WHITE);
		contentPane.add(b);
		
		lblAvailability = new JLabel("Name");
		lblAvailability.setBounds(10, 15, 69, 14);
		contentPane.add(lblAvailability);
		
		lblCleanStatus = new JLabel("fName");
		lblCleanStatus.setBounds(120, 15, 76, 14);
		contentPane.add(lblCleanStatus);
		
		lblNewLabel = new JLabel("Age");
		lblNewLabel.setBounds(240, 15, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("DOB");
		lblNewLabel_1.setBounds(360, 15, 76, 14);
		contentPane.add(lblNewLabel_1);

		
		lblId = new JLabel("Address");
		lblId.setBounds(470, 15, 90, 14);
		contentPane.add(lblId);
                
                JLabel l3 = new JLabel("Phone");
		l3.setBounds(590, 15, 90, 14);
		contentPane.add(l3);
                
                JLabel l4 = new JLabel("Email");
		l4.setBounds(710, 15, 90, 14);
		contentPane.add(l4);
                
                JLabel l5 = new JLabel("Education");
		l5.setBounds(830, 15, 90, 14);
		contentPane.add(l5);
                
                JLabel l6 = new JLabel("Post");
		l6.setBounds(950, 15, 90, 14);
		contentPane.add(l6);
                
                JLabel l7 = new JLabel("Adhar");
		l7.setBounds(1070, 15, 90, 14);
		contentPane.add(l7);
                
                JLabel l8 = new JLabel("Empid");
		l8.setBounds(1190, 15, 90, 14);
		contentPane.add(l8);
                
                
                
                getContentPane().setBackground(Color.LIGHT_GRAY);
        }
        
        
    

           
}