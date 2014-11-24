import java.util.ArrayList;

public class ContactList {
    
    //
    private ArrayList<Contact> contactList; // Private ArrayList to store objects of
                                            // type Contact.
    
    /**
     * Constructor with no parameters initializes the contactList by assigning it to create a new
     * ArrayList.
     */
    public ContactList() {
        
        contactList = new ArrayList<Contact>(); // Instantiating the variable
                                                // contactList as a new ArrayList of
                                                // type Contact.
    }
    
    public ContactList(Contact contact) {
        
        contactList.add(contact);
    }
    
    // Method will add a new person to the ArrayList.
    public void addNewContact(Contact newPerson) { // Param "newPerson" is type Contact.
        contactList.add(newPerson); // Adds a new Contact to the ArrayList.
    }
    
    /**
     * Searches through ArrayList for Contact has a last name that matches the String that the user
     * input via console, then returns the Contact to the calling method.
     * 
     * @param lastName
     * @return
     */
    public Contact searchLastName(String lastName) {
        Contact foundContact = null; // Create a new Contact to return if found.
        
        // Iterate through ArrayList to "search" for the Last Name of a contact.
        for(int i = 0; i < contactList.size(); i++) {
            int index = 0;
            index++;
            // Retrieves each Contact object of the contactList and checks the last
            // name of the contact stored in that index to see if it is the same as
            // as the name the user has entered.
            if(contactList.get(i).getLastName().equalsIgnoreCase(lastName)) {
                
                // Retrieves the contact found at the index that has the last name
                // of the contact being searched for.
                foundContact = contactList.get(index);
                
                return foundContact; // Returns the contact
                
            } else {
                // Let user know that the contact could not be retrieved and show
                // the last name they searched.
                System.err.println("No Contact Found with last name: " + lastName
                        + ".");
            }
        }
        
        return foundContact = null;
    }
}
