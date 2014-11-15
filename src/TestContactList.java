

public class TestContactList {

	public static void main(String[] args) {
	    Contact contact = new Contact();
        contact.setContactNumber();
        System.out.println(contact.getContactNumber());
        contact.setContactNumber("14088931181");
        System.out.println(contact.getContactNumber());
        contact.setContactNumber("4088931181");
        System.out.println(contact.getContactNumber());
        contact.setContactNumber("8931181");
        System.out.println(contact.getContactNumber());
	}
}


