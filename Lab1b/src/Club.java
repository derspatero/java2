
/**
 * @author Edward Lambke A00892244
 *
 */
import java.util.ArrayList;

public class Club {

	private ArrayList<Member> members;

	public Club() {
		super();
		members = new ArrayList<Member>();
	}

	public void join(Member member) {
		if (member != null) {
			members.add(member);
		}
	}
	
	public int numberOfMembers() {
		return members.size();
	}
	
	public void showMembers() {
		if (numberOfMembers() > 0) {
			System.out.println("Complete members list:");
			for (Member member : members) {
				System.out.println(member.getFirstName() + " " + member.getLastName() + " joined " + member.getMonth() + "/" + member.getYearJoined());
			}
		}
		else {
			System.out.println("No members have joined");
		}
	}
	
	public void showMembersByYear(int year) {
		if ((year >= 0) && (year <= Member.CURRENT_YEAR)){
			ArrayList<Integer> membersToBeDisplayed = getMembersByYear(year);
			if (membersToBeDisplayed.isEmpty()) {
				System.out.println("No members joined in " + year);
			}
			else {
				System.out.println("Members who joined in " + year + ":");
				for (int arrayIndex : membersToBeDisplayed) {
					System.out.println(members.get(arrayIndex).getFirstName() + " " + members.get(arrayIndex).getLastName() + " joined " + members.get(arrayIndex).getMonth() + "/" + members.get(arrayIndex).getYearJoined());
				}

			}
		}
		else {
			System.out.println(year + " is an invalid year");
		}
	}
	
	public void removeMembersByYear(int year) {
		if ((year >= 0) && (year <= Member.CURRENT_YEAR)){
			ArrayList<Integer> membersToBeRemoved = getMembersByYear(year);
			
			if (membersToBeRemoved.isEmpty()) {
				System.out.println("No members joined in " + year);
			}
			else {
				for (int i = membersToBeRemoved.size() - 1; i >= 0; i--) {
					System.out.println(members.get(membersToBeRemoved.get(i)).getFirstName() + " " + members.get(membersToBeRemoved.get(i)).getLastName() + " to be removed");
					System.out.format("Format %s <=====", members.get(membersToBeRemoved.get(i)).getFirstName());
					members.remove(membersToBeRemoved.get(i).intValue());
				}
			}
		}
		else {
			System.out.println(year + " is an invalid year");
		}
	}
	
	private ArrayList<Integer> getMembersByYear(int year) {
		ArrayList<Integer> membersFromSelectedYear = new ArrayList<Integer>();
		int index = 0;
		for (Member member : members) {
			if (member.getYearJoined() == year){
				membersFromSelectedYear.add(index);
			}
			index++;
		}
		return membersFromSelectedYear;
	}

}
