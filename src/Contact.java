/**
 * 
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * An object of Class "Contact" will create an Array storing the name, phone number, email address,
 * street address, city, state, zipcode, and any notes that pertain to the Contact being generated
 * at that time.
 * 
 * @author Erik
 */
public class Contact {
    
    public Scanner input = new Scanner(System.in);
    
    private String[] contactInfo = null;
    
    public final String SP = " ";
    public final String LINE = "\n";
    public final String TAB = "\t";
    
    private String titleHeader = "---------CONTACT LIST APPLICATION---------" + LINE;
    private String askForChoice = "What would you like to do?" + LINE;
    private String giveSearchOption = "(Enter SEARCH to search your Contact List)";
    private String giveCreateOption = "(Enter CREATE to add a new Contact)";
    private String giveShowAllOption = "(Enter SHOWLIST to display all contacts)";
    
    private String contactName;
    private String contactNumber;
    private String contactEmail;
    private String contactAddress;
    private String contactCity;
    private String contactState;
    private String contactZip;
    private String contactNotes;
    private String choice;

    private boolean newContact, searchList, showList;
    
    public Contact() {

        System.out.println(titleHeader);
        System.out.println(askForChoice);
        System.out.println(giveCreateOption + LINE);
        System.out.println(giveShowAllOption + LINE);
        System.out.println(giveSearchOption + LINE);
        System.out.println("Your Selection: ");
        this.choice = input.nextLine().toUpperCase();
        if(isCreateNew()) {
            setContactName();
            setContactName(getContactName());
            setContactNumber();
            setContactNumber(getContactNumber());
            setContactEmail();
            setContactEmail(getContactEmail());
        }
    }
    
    public Contact(String name) {
        System.out.println(Arrays.toString(this.contactInfo));
    }
    
    public boolean isCreateNew() {
        if(this.choice.equalsIgnoreCase("CREATE")) {
            newContact = true;
        }
        return newContact;
    }
    
    public boolean isSearchContacts() {
        if(this.choice.equalsIgnoreCase("SEARCH")) {
            searchList = true;
        }
        return searchList;
    }
    
    public boolean isPrintContacts() {
        if(this.choice.equalsIgnoreCase("SHOWLIST")) {
            showList = true;
        }
        return showList;
    }
    
    /**
     * @return the contactName
     */
    public String getContactName() {
        return contactName;
    }
    
    /**
     * @param contactName
     *            the contactName to set
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
    
    public void setContactName() {
        System.out.println("Name:" + TAB);
        String name = input.nextLine().toUpperCase();
        if(!(name.length() > 1)) {
            this.contactName = "[Name]";
        }
        this.contactName = name;
    }

    /**
     * @return the contactNumber
     */
    public String getContactNumber() {
        return contactNumber;
    }
    
    /**
     * @param contactNumber
     *            the contactNumber to set
     */
    public void setContactNumber(String contactNumber) {
        if(contactNumber.length() == 11) {
            this.contactNumber = "+" + contactNumber.substring(0, 1) + " ("
                    + contactNumber.substring(1, 4) + ") "
                    + contactNumber.substring(4, 7) + "-"
                    + contactNumber.substring(7);
        }
        if(contactNumber.length() == 10) {
            this.contactNumber = "(" + contactNumber.substring(0, 3) + ") "
                    + contactNumber.substring(3, 6) + "-"
                    + contactNumber.substring(6);
        }
        if(contactNumber.length() == 7) {
            this.contactNumber = contactNumber.substring(0, 3) + "-"
                    + contactNumber.substring(3);
        }

    }
    
    public void setContactNumber() {
        System.out.println("Phone Number:" + TAB);
        String phone = input.nextLine();
        if(isValidPhoneNumber(phone)) {
            this.contactNumber = phone;
        } else {
            this.contactNumber = "[Phone Number]";
        }
    }
    
    /**
     * @return the contactEmail
     */
    public String getContactEmail() {
        return this.contactEmail;
    }
    
    /**
     * @param contactEmail
     *            the contactEmail to set
     */
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
    
    public void setContactEmail() {
        System.out.println("Email:" + TAB);
        String email = input.nextLine().toUpperCase();
        if(isValidEmailAddress(email)) {
            this.contactEmail = email;
        } else {
            this.contactEmail = "[Email]";
        }
    }

    /**
     * @return the contactAddress
     */
    public String getContactAddress() {
        return this.contactAddress;
    }
    
    /**
     * @param contactAddress
     *            the contactAddress to set
     */
    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }
    
    public void setContactAddress() {
        System.out.println("Name:" + TAB);
        String address = input.nextLine().toUpperCase();
        this.contactAddress = address;
    }

    /**
     * @return the contactCity
     */
    public String getContactCity() {
        return this.contactCity;
    }
    
    /**
     * @param contactCity
     *            the contactCity to set
     */
    public void setContactCity(String contactCity) {
        this.contactCity = contactCity;
    }
    
    public void setContactCity() {
        System.out.println("City:" + TAB);
        String city = input.nextLine().toUpperCase();
        this.contactCity = city;
    }

    /**
     * @return the contactState
     */
    public String getContactState() {
        return this.contactState;
    }
    
    /**
     * @param contactState
     *            the contactState to set
     */
    public void setContactState(String contactState) {
        this.contactState = contactState;
    }
    
    public void setContactState() {
        System.out.println("State:" + TAB);
        String state = input.nextLine().toUpperCase();
        this.contactState = state;
    }

    /**
     * @return the contactZip
     */
    public String getContactZip() {
        return contactZip;
    }
    
    /**
     * @param contactZip
     *            the contactZip to set
     */
    public void setContactZip(String contactZip) {
        this.contactZip = contactZip;
    }
    
    public void setContactZip() {
        System.out.println("Zipcode:" + TAB);
        String zipcode = input.nextLine().toUpperCase();
        this.contactZip = zipcode;
    }

    /**
     * @return the contactNotes
     */
    public String getContactNotes() {
        return contactNotes;
    }
    
    /**
     * @param contactNotes
     *            the contactNotes to set
     */
    public void setContactNotes(String contactNotes) {
        this.contactNotes = contactNotes;
    }
    
    public void setContactNotes() {
        System.out.println("Notes:" + TAB);
        String notes = input.nextLine().toUpperCase();
        this.contactNotes = notes;
    }
    
    public static final String EMAIL = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
    
    protected boolean isValidEmailAddress(String email) {
        return email.matches(EMAIL);
    }
    
    private static boolean isValidPhoneNumber(String phoneNo) {
        if(phoneNo.matches("\\d{10}"))
            return true;
        else if(phoneNo.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}"))
            return true;
        else if(phoneNo.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}"))
            return true;
        else if(phoneNo.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}"))
            return true;
        else if(phoneNo.matches("\\d{11}"))
            return true;
        else
            return false;
    }
}
