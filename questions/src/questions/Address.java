package questions;

public class Address {
	private String city;
	private  String state;
	private String pinCode;
	@Override
	public int hashCode() {
		return state.length()  + city.length();
	}
	@Override
	public boolean equals(Object object) {
		if(this == object) {
			return true;
		}
		if(object instanceof Address) {
			Address a  = (Address) object;
			if(this.city.equals(a.city) 
					&& this.state.equals(a.state) 
					&& this.pinCode.equals(a.pinCode)) {
				return true;
			}
		}
		return false;
	}
	public Address() {}
	public Address(String city, String state, String pinCode) {
		super();
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
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
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pinCode=" + pinCode + "]";
	}
	
}
