/**
 * @author Edward Lambke A00892244
 *
 */
public class ClubDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//CREATE NEW MEMBERS		
		//no data
		Member member1 = new Member();		
		//valid data
		Member member2 = new Member("smart","guy", 3, 1977);		
		//invalid data
		Member member3 = new Member("stupid","idiot", 13, 2112);		
		//incomplete data
		Member member4 = new Member(null, "nullington", 6, 2013);
		
		//Create a club
		Club club = new Club();
		
		//show empty club
		club.showMembers();
		
		//add members
		club.join(member1);
		club.join(member2);
		club.join(member3);
		club.join(member4);
		
		//show added members
		club.showMembers();
		//show number of members
		System.out.println("number of members: " + club.numberOfMembers()); 		
		
		//SHOW MEMBERS BY YEAR
		//valid year with members
		club.showMembersByYear(2015);
		//valid year with no members
		club.showMembersByYear(666);
		//invalid year
		club.showMembersByYear(2016);
		
		//REMOVE MEMBERS
		//valid year with no members
		club.removeMembersByYear(2012);	
		//invalid year
		club.removeMembersByYear(2112);	
		//valid year with members
		club.removeMembersByYear(2015);
		//show members of 2015 have been removed
		club.showMembersByYear(2015);
		club.showMembers();
		System.out.println("number of members: " + club.numberOfMembers());
	}

}
