package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;

public class Vehicle {
	public void VehicleNecessery() {
		System.out.println("xyz");

	}
	
	public static void main(String[] args) {
		Vehicle veh = new Vehicle();
		veh.VehicleNecessery();
		
		TwoWheeler whe = new TwoWheeler();
		whe.bike();
		whe.cycle();
		
		ThreeWheeler th = new ThreeWheeler();
		 th.Auto();
		
		 FourWheeler fh = new FourWheeler();
		 fh.bus();
		 fh.car();
		 fh.lorry();

	}

}
