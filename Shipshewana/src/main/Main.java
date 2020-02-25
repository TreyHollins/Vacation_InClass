/*
 * David Hollins
 * 2/18/2020
 */
package main;

import shipshewana.Shipshewana;

public class Main {

	public static void main(String[] args) {
		//Declare and instantiate a Shipshewana object
		Shipshewana myVacation = new Shipshewana();
		//Use setters to define the hotel, length, and season
		myVacation.setHotel("Farmstead Inn");
		myVacation.setLength(5);
		myVacation.setSeason("Spring");
		//Use the toString method in the Shipshewana class to print some information about your object
		System.out.println(myVacation.toString());
	}

}
