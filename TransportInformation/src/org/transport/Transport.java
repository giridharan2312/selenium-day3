package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
	private void transportForm() {
		System.out.println("transport form : ");
	}
	public static void main(String[] args) {
		Transport tr = new Transport();
		tr.transportForm();
		
		Road r = new Road();
		r.bike();
		r.bus();
		r.car();
		r.cycle();
		
		Air ar = new Air();
		ar.aeroPlane();
		ar.helicopter();
		
		Water wtr = new Water();
		wtr.boat();
		wtr.ship();
	}
}

//QUESTION 10:
//--------------
//     Project   :TransportInformation
//     Package   :org.transport
//     Class     :Transport
//     Methods   :TransportForm
//     
//     Package   :org.road
//     Class     :Road
//     Methods   :bike(),cycle(),bus(),car()
//
//     Package   :org.air
//     Class     :Air
//     Methods   :aeroPlane(),heliCopter()
//
//     Package   :org.water
//     Class     :Water
//     Methods   :boat(),ship()
//
//Description:
//Create an object for all 4 classes  inside the Transport class 
//and call all classes methods also follow the all coding standards.   
