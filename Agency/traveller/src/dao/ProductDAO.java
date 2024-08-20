package dao;

import java.sql.*;

import connectionManager.ConnectionManager;
import model.Product;

public class ProductDAO {
	public void addProduct(Product p) throws ClassNotFoundException, SQLException
	{
		int id=p.getId();
		String UserName=p.getName();
		String Bookingdate=p.getBookingdate();
		String Travellingplace=p.getTravelplace();
		String checkin=p.getcheckin();
		String checkout=p.getcheckout();
		
		ConnectionManager conm = new ConnectionManager();
		Connection con = conm.establishConnection();
		
		String query = "insert into Traveller values (?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1,id);
		ps.setString(2, UserName);
		ps.setString(3,Bookingdate);
		ps.setString(4,Travellingplace);
		ps.setString(5,checkin);
		ps.setString(6, checkout);
		
		ps.executeUpdate();
		
		conm.closeConnection();
	}
	
	public void display() throws ClassNotFoundException, SQLException
	{
		ConnectionManager conm = new ConnectionManager();
		Connection con = conm.establishConnection();
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from Traveller");
		while(rs.next())
		{
			System.out.println(rs.getInt("id")+" | "+rs.getString("UserName")+" | "+rs.getString("Bookingdate")+" | "+rs.getString("Travellingplace")+" | "+rs.getString("checkin")+ " | "+rs.getString("checkout"));
		}
	}
	
	
}
