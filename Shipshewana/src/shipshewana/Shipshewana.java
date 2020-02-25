/*
 * David Hollins
 * 2/18/2020
 */
package shipshewana;

public class Shipshewana extends Vacation {
	private String hotel;
	void travel() {
		System.out.println("It takes about 5 hours to travel to Shipshewana");
	}
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	@Override
	public void spendMoney() {
		//The method called for in the Fun interface
		System.out.println("I am a Shipshewana vacation and I cost $800");
	}
	public String toString() {
		return super.toString() + " Hotel: " + hotel;
	}

}
