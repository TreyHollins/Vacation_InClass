/*
 * David Hollins
 * 2/18/2020
 */
package shipshewana;

import fun.Fun;

public abstract class Vacation implements Fun{
	private int length;
	private String season;
	
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String toString() {
		return "Length: " + length + " Season: " + season;
	}

}
