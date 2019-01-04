package org.learn.java;

public class Address {
	//general - fix the class if there is any issue
	
	private int streetNumber;
	private String streetName;
	private String streetName2; // optional
	private String city;
	private String state;
	private int zipcode;

	public Address(int streetNumber, String streetName, String streetName2, String city, String state, int zipcode) {
		super();
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.streetName2 = streetName2;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	public Address(int streetNumber, String streetName, String city, String state, int zipcode) {
		super();
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.streetName2 = "";
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getstreetName2() {
		return streetName2;
	}

	public void setstreetName2(String streetName2) {
		this.streetName2 = streetName2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

//	@Override
//	public String toString() {
//		return "Address [streetNumber=" + streetNumber + ", streetName=" + streetName + ", streetName2=" + streetName2
//				+ ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + "]";
//	}
	
	@Override
	public String toString() {
		return "Address [streetNumber=" + streetNumber + ", streetName=" + streetName + ", streetName2=" + streetName2
				+ ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((streetName == null) ? 0 : streetName.hashCode());
		result = prime * result + ((streetName2 == null) ? 0 : streetName2.hashCode());
		result = prime * result + streetNumber;
		result = prime * result + zipcode;
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
		Address other = (Address) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (streetName == null) {
			if (other.streetName != null)
				return false;
		} else if (!streetName.equals(other.streetName))
			return false;
		if (streetName2 == null) {
			if (other.streetName2 != null)
				return false;
		} else if (!streetName2.equals(other.streetName2))
			return false;
		if (streetNumber != other.streetNumber)
			return false;
		if (zipcode != other.zipcode)
			return false;
		return true;
	}
	
	
	
	
	
	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((city == null) ? 0 : city.hashCode());
//		result = prime * result + ((state == null) ? 0 : state.hashCode());
//		result = prime * result + ((streetName2 == null) ? 0 : streetName2.hashCode());
//		result = prime * result + ((streetName == null) ? 0 : streetName.hashCode());
//		result = prime * result + streetNumber;
//		result = prime * result + zipcode;
//		return result;
//	}

	

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Address other = (Address) obj;
//		if (city == null) {
//			if (other.city != null)
//				return false;
//		} else if (!city.equals(other.city))
//			return false;
//		if (state == null) {
//			if (other.state != null)
//				return false;
//		} else if (!state.equals(other.state))
//			return false;
//		if (streetName2 == null) {
//			if (other.streetName2 != null)
//				return false;
//		} else if (!streetName2.equals(other.streetName2))
//			return false;
//		if (streetName == null) {
//			if (other.streetName != null)
//				return false;
//		} else if (!streetName.equals(other.streetName))
//			return false;
//		if (streetNumber != other.streetNumber)
//			return false;
//		if (zipcode != other.zipcode)
//			return false;
//		return true;
//	}

}
