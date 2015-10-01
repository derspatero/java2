import java.util.HashMap;

/**
 * 
 */

/**
 * @author edward lambke a00892244
 *
 */
public class EmailInfo {

	/**
	 * 
	 */

	private HashMap<String, String> addressBook;

	public EmailInfo() {
		addressBook = new HashMap<String, String>();
	}

	/**
	 * @return the properly-formatted name as a String.
	 */
	private String formatName(String name) {
		return name.substring(0, 1).toUpperCase() + name.toLowerCase().substring(1);
	}

	/**
	 * @return the properly-formatted email as a String.
	 */
	private String formatEmail(String email) {
		return email.toLowerCase();
	}

	/**
	 * Add a friend to the address book. The friend's name must be formatted
	 * before being stored.
	 */
	public void addFriend(String name, String email) {
		if ((name != null) && (email != null)) {
			addressBook.put(formatName(name), formatEmail(email));
			System.out.format("Add friend: %s, %s\n",formatName(name), formatEmail(email));
		} else {
			System.out.println("name and email cannot be null");
		}

	}

	/**
	 * Remove a friend from the address book. The name passed incan be in upper
	 * case, lower case, or mixed. The friend and his/her email will be removed
	 * from the address book.
	 */
	public void removeFriend(String name) {
		if ((name != null) && (addressBook.containsKey(formatName(name)))) {
			System.out.format("removing friend %s\n", name);
			addressBook.remove(formatName(name));
		} else if (name == null) {
			System.out.format("removeFriend Name cannot be null\n");
		} else {
			System.out.format("removeFriend %s not found\n", name);
		}
	}

	/**
	 * Return an email address based on friend’s name. The namepassed in can be
	 * in upper case, lower case, or mixed. Thefriend's email address will be
	 * returned as a String.
	 */
	public String getAddress(String name) {
		if ((name != null) && (addressBook.containsKey(formatName(name)))) {
			return addressBook.get(formatName(name));
		} else if (name == null) {
			return "getAddress Name cannot be null";
		} else {
			return "getAddress " + name + " not found";
		}
	}

	/**
	 * Find and display friends based on their email address. There might be
	 * more than one friend using the same email.
	 */
	public void findFriends(String email) {
		if (email != null) {
			System.out.format("\nFind friends with address %s:\n", email);
			boolean addressFound = false;
			for (String name : addressBook.keySet()) {
				if (getAddress(name).equals(formatEmail(email))) {
					System.out.format("%s %s\n", name, getAddress(name));
					addressFound = true;
				}
			}
			if (!addressFound) {
				System.out.format("findFriends %s was not found\n", email);
			}
		} else {
			System.out.format("findFriends email cannot be null");
		}
	}

	/** List all friends and their email addresses */
	public void listAll() {
		if (addressBook.size() > 0) {
			System.out.format("\nList all addresses:\n");

			for (String name : addressBook.keySet()) {
				System.out.format("%s %s\n", name, getAddress(name));
			}
		} else {
			System.out.format("Address book is empty\n");
		}
	}

}
