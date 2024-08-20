package model;

public class Product {
	private int ID;
	private String UserName;
	private String Bookingdate;
	private String Travelplace;
	private String checkin;
	private String checkout;
	public int getId() {
		return ID;
	}
	public void setId(int ID) {
		this.ID = ID;
	}
	public String getName() {
		return UserName;
	}
	public void setName(String name) {
		UserName = name;
	}
	public String getBookingdate() {
		return Bookingdate;
	}
	public void setBookingdate(String bookingdate) {
		Bookingdate = bookingdate;
	}
	public String getTravelplace() {
		return Travelplace;
	}
	public void setTravelplace(String travelplace) {
		Travelplace = travelplace;
	}
	public String getcheckin() {
		return checkin;
	}
	public void setcheckin(String checkin) {
		checkin = checkin;
	}
	public String getcheckout() {
		return checkout;
	}
	public void setcheckout(String checkout) {
		checkout = checkout;
	}
	
	

	
}
