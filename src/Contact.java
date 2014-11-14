/**
 * 
 */

import java.util.Arrays;
/**
 * An object of Class "Contact" will create an Array storing the name, phone number,
 * email address, street address, city, state, zipcode, and any notes that pertain to
 * the Contact being generated at that time.
 * 
 * @author Erik
 *
 */
public class Contact {

	private String[] contactInfo;
	
	private String contactName, contactNumber, contactEmail, contactAddress,
	contactCity, contactState, contactZip, contactNotes;
	
	public Contact() {
		String[] contactInformation = getContactInfo();
	}
	private String[] getContactInfo() {
		contactInfo.add();
		getContactNumber();
		getContactEmail();
		getContactAddress();
		getContactCity();
		getContactState();
		getContactZip();
		getContactNotes();
		return contactInfo;
	}
	/**
	 * @return the contactName
	 */
	public String getContactName() {
		return this.contactName;
	}
	/**
	 * @param contactName the contactName to set
	 */
	public void setContactName(String name) {
		this.contactName = name;
	}
	/**
	 * @return the contactNumber
	 */
	public String getContactNumber() {
		return this.contactNumber;
	}
	/**
	 * @param contactNumber the contactNumber to set
	 */
	public void setContactNumber(String num) {
		this.contactNumber = num;
	}
	/**
	 * @return the contactEmail
	 */
	public String getContactEmail() {
		return this.contactEmail;
	}
	/**
	 * @param contactEmail the contactEmail to set
	 */
	public void setContactEmail(String email) {
		this.contactEmail = email;
	}
	/**
	 * @return the contactAddress
	 */
	public String getContactAddress() {
		return this.contactAddress;
	}
	/**
	 * @param contactAddress the contactAddress to set
	 */
	public void setContactAddress(String street) {
		this.contactAddress = street;
	}
	/**
	 * @return the contactCity
	 */
	public String getContactCity() {
		return this.contactCity;
	}
	/**
	 * @param contactCity the contactCity to set
	 */
	public void setContactCity(String city) {
		this.contactCity = city;
	}
	/**
	 * @return the contactState
	 */
	public String getContactState() {
		return this.contactState;
	}
	/**
	 * @param contactState the contactState to set
	 */
	public void setContactState(String state) {
		this.contactState = state;
	}
	/**
	 * @return the contactZip
	 */
	public String getContactZip() {
		return this.contactZip;
	}
	/**
	 * @param contactZip the contactZip to set
	 */
	public void setContactZip(String zipcode) {
		this.contactZip = zipcode;
	}
	/**
	 * @return the contactNotes
	 */
	public String getContactNotes() {
		return this.contactNotes;
	}
	/**
	 * @param contactNotes the contactNotes to set
	 */
	public void setContactNotes(String notes) {
		this.contactNotes = notes;
	}
}
