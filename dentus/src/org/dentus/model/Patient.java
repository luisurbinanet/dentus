package org.dentus.model;

import java.util.Date;

public class Patient extends Person{

	private Dentist prefferedDentist;
	private Patient patientIndication;
	private String consultReason;
	private Date treatmentStart;
	
	public Dentist getPrefferedDentist() {
		return prefferedDentist;
	}
	public void setPrefferedDentist(Dentist prefferedDentist) {
		this.prefferedDentist = prefferedDentist;
	}
	public Patient getPatientIndication() {
		return patientIndication;
	}
	public void setPatientIndication(Patient patientIndication) {
		this.patientIndication = patientIndication;
	}
	public String getConsultReason() {
		return consultReason;
	}
	public void setConsultReason(String consultReason) {
		this.consultReason = consultReason;
	}
	public Date getTreatmentStart() {
		return treatmentStart;
	}
	public void setTreatmentStart(Date treatmentStart) {
		this.treatmentStart = treatmentStart;
	}
	@Override
	public String toString() {
		return getFullName();
	}
	
	

}
