package org.allvehicle;
import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;

public class Vehicle {
	private void VehicleNecessery() {
		System.out.println("VehicleNecessery");
	}
	public static void main(String[] args) {
		
		Vehicle vh = new Vehicle();
		vh.VehicleNecessery();
		
		TwoWheeler tw = new TwoWheeler();
		tw.bike();
		tw.cycle();
		
		ThreeWheeler thw = new ThreeWheeler();
		thw.auto();
		
		FourWheeler fw = new FourWheeler();
		fw.bus();
		fw.car();
		fw.lorry();
	}
}
//QUESTION 9:
//     Project   :VehicleInformation
//     Package   :org.allvehicle
//     Class     :Vehicle
//     Methods   :VehicleNecessery()
//
//     Package   :org.twowheeler
//     Class     :TwoWheller
//     Methods   :bike(),cycle()
//
//     Package   :org.threewheeler
//     Class     :ThreeWheeler
//     Methods   :Auto()
//
//     Package   :org.fourwheeler
//     Class     :FourWheeler
//     Methods   :car(),bus(),lorry()
//
//Description:
//Create an object for all 4 classes  inside the Vehicle class 
//and call all classes methods also follow the all coding standards.   
