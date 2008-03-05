package org.dentus;

import junit.framework.TestCase;

import org.dentus.model.Address;
import org.dentus.model.Patient;

public class TestPatientRegistry extends TestCase {

	private Patient patient;

	@Override
	protected void setUp() throws Exception {
		patient = new Patient();

		patient.setFullName("Joao da Silva");
		
		Address businessAddress = new Address();
		
		businessAddress.setStreetName("Avenida Paulista, 777");
		
		Address addressHome = new Address();
		addressHome.setCity("Sao Paulo");
		addressHome.setState("SP");
		
		patient.setHomeAddress(addressHome);
		
		patient.setBusinessAddress(businessAddress);
	}

	public void testPatientName() {
		assertEquals("Joao da Silva", patient.getFullName());
	}
	
	public void testCityAddress() {
		assertEquals("Sao Paulo", patient.getHomeAddress().getCity());
	}
	
	public void testBusinessAddress() {
		assertEquals("Avenida Paulista, 777", patient.getBusiness().getStreetName());
	}
	
	
	

}
