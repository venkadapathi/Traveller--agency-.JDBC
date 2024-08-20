package dao;
//dao -> Data Access Object
// means used to have the implements of mysql inside our java
import java.sql.*;

import connectionManager.ConnectionManager;
import model.Login;
public class LoginDAO {
	//this method is used to check whether the given username
	//and password is valid or not.
	public boolean loginValidation(Login l) throws ClassNotFoundException, SQLException
	{
		String username = l.getUsername();
		String password = l.getPass();
		
		ConnectionManager conm = new ConnectionManager();
		Connection con = conm.establishConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from Login");
		while(rs.next())
		{
			if(username.equals(rs.getString("UserName")) && password.equals(rs.getString("pass")))
			{
				conm.closeConnection();
				return true;
			}
		}
		conm.closeConnection();
		return false;
	}
}
