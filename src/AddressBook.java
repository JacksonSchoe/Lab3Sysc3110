import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	private List<BuddyInfo> buddyList = new ArrayList<BuddyInfo>();

	public static void main(String[] args) {
		System.out.println("Address book");
	}
	
	public void addBuddy(BuddyInfo buddyInfo) {
		buddyList.add(buddyInfo);
	}
	public void removeBuddy() {
	}

}
