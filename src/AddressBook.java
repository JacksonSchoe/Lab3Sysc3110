import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	private List<BuddyInfo> buddyList;

	public static void main(String[] args) {
		System.out.println("Address book");
		BuddyInfo buddy = new BuddyInfo();
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(buddy);
		addressBook.removeBuddy(buddy);
	}
	
	//default address book constructor
	public AddressBook() {
		this.buddyList = new ArrayList<BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo buddyInfo) {
		if(buddyInfo != null) {
			this.buddyList.add(buddyInfo);
		}
	}
	public void removeBuddy(BuddyInfo buddyInfo) {
		buddyList.remove(buddyInfo);
	}

}
