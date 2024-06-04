
public class ContactsManager {
	int friendsCount;
	Contact[] myFriends;

	ContactsManager() {
		this.friendsCount = 0;
		this.myFriends = new Contact[500];
	}
	
	void addContact(Contact c) {
		this.myFriends[this.friendsCount] = c;
		this.friendsCount += 1;
	}
	
	Contact searchContactByName(String name) {
		Contact contactFound = null;
		
		for (int i = 0; i < this.friendsCount; i++) {
			if (this.myFriends[i].name.equals(name)) {
				return this.myFriends[i];
			}
		}

		return contactFound;
	}
}
