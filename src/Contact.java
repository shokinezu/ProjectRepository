/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */

/**
 * An object of type Contact contains a person. To include the Name, Phone Number, Address, City,
 * State, Zipcode, and Notes that the user designates.
 *
 * @author Erik
 */
public class Contact {
    
    private static final String TAB = "\t";
    private static final String LINE = "\n";
    
    // Standard Java Scanner class to read user input via the console with the standard
    // input stream of System.in.
    private Scanner console = new Scanner(System.in);
    
    private String firstName;
    private String lastName;
    private String phoneDigits;
    private String emailHandle;
    private String addressLine_1;
    private String addressLine_2;
    private String personalNotes;
    private boolean noLast = true;
    
    // Constructor for Contact type with no parameters.
    public Contact() {
        
        this.firstName = "[First Name]";
        this.lastName = "[Last Name]"; // Required so change.
        this.phoneDigits = "[Phone Number]";
        this.emailHandle = "[Email Address]";
        this.addressLine_1 = "[House Number] [Street Name]";
        this.addressLine_2 = "[City] , [State] [Zipcode]";
        this.personalNotes = "[Contact Notes]";
        
        System.out.println("Welcome to the Contact List Application");
        System.out.println("To Enter a New Contact, enter the following:");
        System.out.println("First Name :");
        String givenName = console.nextLine().toUpperCase();
        if(!givenName.isEmpty()) {
            this.firstName = givenName;
            
            do {
                
                System.out.println("Last Name: ");
                String familyName = console.nextLine().toUpperCase();
                if(familyName.isEmpty()) {
                    System.err.println("Last Name: **This field is required**");
                } else {
                    this.lastName = familyName;
                    noLast = false;
                }
                
            } while(noLast);
            
            System.out.println("Phone Number: ");
            String phoneNumber = console.nextLine().toUpperCase();
            if(isValidPhone(phoneNumber)) {
                this.phoneDigits = formatPhoneNumber(phoneNumber);
            }
            System.out.println("Email: ");
            this.emailHandle = console.nextLine().toUpperCase();

            System.out.println("Street Address: ");
            System.out.println("(e.g. 12345 El Monte Rd)");
            String houseAndStreet = console.nextLine().toUpperCase();

            if(!houseAndStreet.isEmpty()) {
                this.addressLine_1 = houseAndStreet;
            }

            System.out.println("City, State, Zipcode: ");
            System.out.println("(e.g. Los Altos Hills, CA 94022)");
            String cityStateZip = console.nextLine().trim().toUpperCase();

            if(!cityStateZip.isEmpty()) {
                this.addressLine_2 = cityStateZip;
            }

            System.out.println("Contact Notes:");
            String notes = console.nextLine().toUpperCase();

            if(!notes.isEmpty()) {
                this.personalNotes = notes;
            }
        }

    }
    
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return this.firstName;
    }
    
    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format(LINE + LINE + TAB + "Contact: %s %s" + LINE + TAB
                + "------------------------------" + LINE + LINE + TAB
                + "Phone Number:" + LINE + TAB + "%s" + LINE + LINE + TAB
                + "Email Address:" + LINE + TAB + "%s" + LINE + LINE + TAB
                + "Address: " + LINE + TAB + "%s" + LINE + TAB + "%s" + LINE + LINE
                + TAB + "Contact Notes: " + LINE + TAB + "%s", this.firstName,
                this.lastName, this.phoneDigits, this.emailHandle,
                this.addressLine_1, this.addressLine_2, this.personalNotes);
    }

    /**
     * @param firstName
     *            the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    /**
     * @return the lastName
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * @param lastName
     *            the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return this.phoneDigits;
    }
    
    /**
     * @param phone
     *            the phone to set
     */
    public void setPhone(String phone) {
        this.phoneDigits = phone;
    }
    
    /**
     * @return the emailHandle
     */
    public String getEmailHandle() {
        return this.emailHandle;
    }
    
    /**
     * @param emailHandle
     *            the emailHandle to set
     */
    public void setEmailHandle(String emailHandle) {
        this.emailHandle = emailHandle;
    }

    /**
     * @return the addressLine_1
     */
    public String getAddressLine_1() {
        return this.addressLine_1;
    }

    /**
     * @param addressLine_1
     *            the addressLine_1 to set
     */
    public void setAddressLine_1(String addressLine_1) {
        this.addressLine_1 = addressLine_1;
    }

    /**
     * @return the addressLine_2
     */
    public String getAddressLine_2() {
        return this.addressLine_2;
    }

    /**
     * @param addressLine_2
     *            the addressLine_2 to set
     */
    public void setAddressLine_2(String addressLine_2) {
        this.addressLine_2 = addressLine_2;
    }

    /**
     * @return the personalNotes
     */
    public String getPersonalNotes() {
        return this.personalNotes;
    }

    /**
     * @param personalNotes
     *            the personalNotes to set
     */
    public void setPersonalNotes(String personalNotes) {
        this.personalNotes = personalNotes;
    }
    
    private static String VALID_SEVEN = "\\d{7}";
    private static String VALID_TEN = "\\d{10}";
    private static String VALID_ELEVEN = "\\d{11}";
    
    public boolean isValidPhone(String number) {
        if(number.matches(VALID_ELEVEN)) {
            return true;
        }
        if(number.matches(VALID_TEN)) {
            return true;
        }
        if(number.matches(VALID_SEVEN)) {
            return true;
        } else {
            return false;
        }
        
    }
    
    public String formatPhoneNumber(String number) {
        if(number.length() == 11) {
            number = "+1 (" + number.substring(1, 4) + ") " + number.substring(4, 7)
                    + "-" + number.substring(7);
        }
        if(number.length() == 10) {
            number = "+1 (" + number.substring(0, 3) + ") " + number.substring(3, 6)
                    + "-" + number.substring(6);
        }
        if(number.length() == 7) {
            number = number.substring(0, 3) + "-" + number.substring(3);
        }
        return number;
    }

}
