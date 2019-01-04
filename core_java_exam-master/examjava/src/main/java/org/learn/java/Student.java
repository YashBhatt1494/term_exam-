package org.learn.java;

import java.util.ArrayList;
import java.util.Random;

public class Student {
	//TODO: general - fix the class if there is any issue
	private  int id;		//!important: id should be auto generated and should not be modifiable
	private static ArrayList<Integer> allIds= new ArrayList<Integer>();
	private String firstName;
	private String lastName;
	private Address mailingAddress;
	private Address permanentAddress;
	//TODO: fix any issue for any instance variable above
	
	public Student(String firstName, String lastName, Address mailingAddress, Address permanentAddress) {
		super();
		this.setId();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mailingAddress = mailingAddress;
		this.permanentAddress = permanentAddress;
	}

	public int getId() {
		return id;
	}
	
	private void setId() {
		int temp = new Random().nextInt(32);
		if(!allIds.contains(temp)) {
			allIds.add(temp);
			this.id=temp;
		} else {
			this.setId();
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getMailingAddress() {
		return mailingAddress;
	}

	public void setMailingAddress(Address mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", mailingAddress="
				+ mailingAddress + ", permanentAddress=" + permanentAddress + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((mailingAddress == null) ? 0 : mailingAddress.hashCode());
		result = prime * result + ((permanentAddress == null) ? 0 : permanentAddress.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (mailingAddress == null) {
			if (other.mailingAddress != null)
				return false;
		} else if (!mailingAddress.equals(other.mailingAddress))
			return false;
		if (permanentAddress == null) {
			if (other.permanentAddress != null)
				return false;
		} else if (!permanentAddress.equals(other.permanentAddress))
			return false;
		return true;
	}
	
	
	
	
	
	
//
//	public int getId() {
//		return id;
//	}
//
//	public String getFirstName() {
//		return firstName;
//	}
//
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//
//	public String getLastName() {
//		return lastName;
//	}
//
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//
//	public Address getMailingAddress() {
//		return mailingAddress;
//	}
//
//	public void setMailingAddress(Address mailingAddress) {
//		this.mailingAddress = mailingAddress;
//	}
//
//	public Address getPermanentAddress() {
//		return permanentAddress;
//	}
//
//	public void setPermanentAddress(Address permanentAddress) {
//		this.permanentAddress = permanentAddress;
//	}
//	
//	
//
////	@Override
////	public String toString() {
////		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", ID="+id+", mailingAddress=" + mailingAddress
////				+ ", permanentAddress=" + permanentAddress + "]";
////	}
//	
//	
//	
//
//	@Override
//	public int hashCode() { 		//TODO: fix issue if exist
//		
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
//		result = prime * result + ((mailingAddress == null) ? 0 : mailingAddress.hashCode());
//		result = prime * result + ((permanentAddress == null) ? 0 : permanentAddress.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) { //TODO: fix issue if exist
//		
//		Student other = (Student) obj;
//		if (firstName == null) {
//			if (other.firstName != null)
//				return false;
//		} else if (!firstName.equals(other.firstName))
//			return false;
//		if (id != other.id)
//			return false;
//		if (lastName == null) {
//			if (other.lastName != null)
//				return false;
//		} else if (!lastName.equals(other.lastName))
//			return false;
//		if (mailingAddress == null) {
//			if (other.mailingAddress != null)
//				return false;
//		} else if (!mailingAddress.equals(other.mailingAddress))
//			return false;
//		if (permanentAddress == null) {
//			if (other.permanentAddress != null)
//				return false;
//		} else if (!permanentAddress.equals(other.permanentAddress))
//			return false;
//		return true;
//	}
//
//	
//	

}
