/**
 * 
 */

/**
 * @author edward lambke a00892244
 *
 */
public class EmailDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EmailInfo emailInfo = new EmailInfo();

		test("List all addresses with empty address book");
		emailInfo.listAll();

		test("Add Friend with invalid data");
		emailInfo.addFriend(null, null);

		test("Add Friend with valid data");
		emailInfo.addFriend("alice", "asdf@asdf.asdf");

		test("Get email with invalid data");
		test(emailInfo.getAddress(null));
		test(emailInfo.getAddress("steve"));

		test("Get email with valid data");
		test(emailInfo.getAddress("alice"));

		test("Add friends with valid data");
		emailInfo.addFriend("steve", "qWER@asDF.asdf");
		emailInfo.addFriend("joe", "ASDF@asDF.asdf");

		test("List all friends");
		emailInfo.listAll();

		test("Find friends with invalid email");
		emailInfo.findFriends("zxcv@zxcv.zxcv");

		test("Find friends with valid email");
		emailInfo.findFriends("asdf@ASDF.ASDF");

		test("Remove friend with invalid data");
		emailInfo.removeFriend(null);
		emailInfo.removeFriend("john");

		test("Remove friend with valid data");
		emailInfo.removeFriend("alice");
		test(emailInfo.getAddress("alice"));
		emailInfo.findFriends("asdf@ASDF.ASDF");

		test("List all friends");
		emailInfo.listAll();
	}

	private static void test(String test) {
		System.out.format("%s\n", test);
	}

}
