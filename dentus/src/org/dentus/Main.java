package org.dentus;

import org.dentus.model.Address;
import org.dentus.model.Patient;

public class Main {
	
	public static void main(String[] args) {
		
		Patient patient = new Patient();

		patient.setFullName("Joao da Silva");
		
		Address businessAddress = new Address();
		
		businessAddress.setStreetName("Avenida Paulista, 777");
		
		Address addressHome = new Address();
		addressHome.setCity("Sao Paulo");
		addressHome.setState("SP");
		
		patient.setHomeAddress(addressHome);
		
		patient.setBusinessAddress(businessAddress);
		System.out.println(patient);
	}

}
