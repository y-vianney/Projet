
public class Main {
	public static void main(String[] args) {
		ContactsManager myMan = new ContactsManager();
		
		Contact first = new Contact("nnn", "0123456789");
		
		myMan.addContact(first);
		
		System.out.println(myMan.searchContactByName("nnn").phoneNumber);
	}
}
