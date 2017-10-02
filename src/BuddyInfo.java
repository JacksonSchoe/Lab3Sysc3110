
public class BuddyInfo {
//swag
	String name;
	String address;
	String phoneNumber;
	public static void main(String[] args) {
		System.out.println("Hello world!");
		BuddyInfo buddy = new BuddyInfo();
		buddy.setName("Homer");
		System.out.println("Hello "+buddy.getName());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
