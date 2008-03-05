package org.dentus.model;

public class Person {
	
	private String fullName;
	private String gender;
	private Patient personLegal;
	private Documents[] docs;
	private String profession;
	private String celPhone;
	private String email;
	
	private Address homeAddress;
	private Address businessAddress;
	
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String name) {
		this.fullName = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Patient getPersonLegal() {
		return personLegal;
	}

	public void setPersonLegal(Patient personLegal) {
		this.personLegal = personLegal;
	}

	public Documents[] getDocs() {
		return docs;
	}

	public void setDocs(Documents[] docs) {
		this.docs = docs;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getCelPhone() {
		return celPhone;
	}

	public void setCelPhone(String celPhone) {
		this.celPhone = celPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Address getBusiness() {
		return businessAddress;
	}

	public void setBusinessAddress(Address business) {
		this.businessAddress = business;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

}
