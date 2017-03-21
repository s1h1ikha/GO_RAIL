
package gorail;
import java.sql.*;
import javax.swing.*;
public class SqlCon {
    
    Connection con = null;
	public static Connection dbconnector(){
		
		try{
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\dell\\Documents\\NetBeansProjects\\GoRail\\src\\UsersList.sqlite");
			
                        ImageIcon icon = new ImageIcon(Userlogin.class.getResource("logo.png"));
                        JOptionPane.showMessageDialog(null,"SUCCESSFUL CONNECTION TO GORAIL DATABASE","Successful Connection",JOptionPane.INFORMATION_MESSAGE,icon);
                
                        return con;
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null , e);
                        return null;
                }
		
		
		
		
	}
    
}
