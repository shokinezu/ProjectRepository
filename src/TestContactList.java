

public class TestContactList {

	public static void main(String[] args) {
	    Contact contact = new Contact();
        System.out.println(contact.LINE + contact.LINE);
        System.out.println("Name-- : " + contact.getContactName());
        System.out.println("Phone--: " + contact.getContactNumber());
        System.out.println("Email--: " + contact.getContactEmail());
        System.out.println("Address: " + contact.getContactAddress());
        System.out.println("City---: " + contact.getContactCity());
        System.out.println("State--: " + contact.getContactState());
        System.out.println("Zipcode: " + contact.getContactZip());
        System.out.println("Notes--: " + contact.LINE + "------------"
                + contact.LINE
                + contact.getContactNotes());

	}
}


