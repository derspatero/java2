/**
 * @author Edward Lambke A00892244
 *
 */

public class Member {
	private String firstName;
	private String lastName;
	private int month;
	private int yearJoined;

	public static final int FIRST_MONTH = 1;
	public static final int LAST_MONTH = 12;
	public static final int CURRENT_YEAR = 2015;
	public static final String DEFAULT_NAME = "unknown";

	public Member() {
		super();
		firstName = DEFAULT_NAME;
		lastName = DEFAULT_NAME;
		month = FIRST_MONTH;
		yearJoined = CURRENT_YEAR;
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param month
	 * @param year
	 */
	public Member(String firstName, String lastName, int month, int year) {
		super();
		setFirstName(firstName);
		setLastName(lastName);
		setMonth(month);
		setYearJoined(year);
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		if (firstName != null) {
			this.firstName = firstName;
		} else {
			this.firstName = DEFAULT_NAME;
		}
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		if (lastName != null) {
			this.lastName = lastName;
		} else {
			this.lastName = DEFAULT_NAME;
		}
	}

	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * @param month
	 *            the month to set
	 */
	public void setMonth(int month) {
		if ((month > FIRST_MONTH) && (month < LAST_MONTH)) {
			this.month = month;
		} else {
			this.month = FIRST_MONTH;
		}
	}

	/**
	 * @return the yearJoined
	 */
	public int getYearJoined() {
		return yearJoined;
	}

	/**
	 * @param yearJoined
	 *            the yearJoined to set
	 */
	public void setYearJoined(int yearJoined) {
		if ((yearJoined >= 0) && (yearJoined <= CURRENT_YEAR)) {
			this.yearJoined = yearJoined;
		} else {
			this.yearJoined = CURRENT_YEAR;
		}
	}

}
