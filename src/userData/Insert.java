package userData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JOptionPane;
 
/**
 * A Java MySQL PreparedStatement INSERT example.
 * Demonstrates the use of a SQL INSERT statement against a
 * MySQL database, called from a Java program, using a
 * Java PreparedStatement.
 * 
**/


public class Insert {
	
		 public static void main(String[] args )
		 {
		     try
		     {
		         Class.forName("com.mysql.jdbc.Driver");
		         Connection con=DriverManager.getConnection("jdbc:mysql:\\localhost\basicinfo","root","root");
		         Statement stmt=(Statement)con.createStatement();

		  
		         UserData ob=new UserData();
		         
		       
			
			String insert="INSERT INTO visitor VALUES('"+ob.getVstrtyp() +"','"+ob.getCmpny()+"','"+ob.getTitle()+"','"+ob.getLnm()+"','"+ob.getFnm()+"'," +
					"'"+ob.getEmail()+"','"+ob.getCo()+"','"+ob.getStr1()+"','"+ob.getStr2()+"','"+ob.getStr3()+"','"+ob.getStr4()+"','"+ob.getHno()+"','"+ob.getCty()+"','"+ob.getDstct()+"',"+
					"'"+ob.getPcode()+"','"+ob.getRgn()+"','"+ob.getCntry()+"','"+ob.getPov()+"','"+ob.getMpnm()+"','"+ob.getDept()+"','"+ob.getRmno()+"',"+
					"'"+ob.getFlr()+"','"+ob.getBldg()+"','"+ob.getVcat()+"','"+ob.getVmod()+"','"+ob.getVhno()+"','"+ob.getParea()+"','"+ob.getVcol()+"','"+ob.getLoc()+"','"+ob.getVmk()+"');";
		       stmt.executeUpdate(insert);



		     }
		     catch(Exception e)
		     {
		         JOptionPane.showMessageDialog(null, e.getMessage() ,"Error", 1);

		     }
		 }
	}


