import java.util.HashMap;

/**
 * 
 */

/**
 * @author edward lambke a00892244
 *
 */
public class StudentDatabase {

	/**
	 * 
	 */

	public static final int NUM_QUIZZES = 10;
	public static final int MIN_GRADE = 0;
	public static final int MAX_GRADE = 100;

	private HashMap<String, int[]> quizMarks;

	public StudentDatabase() {
		quizMarks = new HashMap<String, int[]>();
	}

	/**
	 * @return the properly-formatted name String.
	 */
	private String formatName(String name) {
		return name.substring(0, 1).toUpperCase() + name.toLowerCase().substring(1);
	}

	/**
	 * Add a student to the database and create a new array to hold that
	 * student's quiz marks ( NUM_QUIZZES quizzes). These marks will by default
	 * be set to MIN_GRADE.
	 */
	public void addStudent(String studentName) {
		if (studentName != null) {
			int[] marks = new int[NUM_QUIZZES];
			quizMarks.put(formatName(studentName), marks);
		}
	}

	/**
	 * @return the array of quiz marks for this student returns int[]
	 */
	public int[] getQuizzes(String student) {
		if (quizMarks.containsKey(formatName(student))) {
			return quizMarks.get(formatName(student));
		} else {
			System.out.format("\n%s not found", student);
			return new int[0];
		}
	}

	/**
	 * Change the mark for the specified student. This method ensures the
	 * student exists in the database. It also ensures the quiz to be changed is
	 * valid, and the mark is within the rangeMIN_GRADE to MAX_GRADE. If
	 * anything is not valid it displays anappropriate error message.
	 */
	public void changeQuizMark(String studentName, int whichQuiz, int newMark) {
		if ((quizMarks.containsKey(formatName(studentName)) && (whichQuiz >= 0) && (whichQuiz < NUM_QUIZZES))
				&& (newMark >= MIN_GRADE) && (newMark <= MAX_GRADE)) {
			int[] marks = quizMarks.get(formatName(studentName));
			marks[whichQuiz] = newMark;
			quizMarks.put(formatName(studentName), marks);
		} else {
			System.out.format("\n\nchangeQuizMark(%s,%d,%d) contains invalid arguments", studentName, whichQuiz,
					newMark);
		}
	}

	/** Display the quiz marks for all students in the database. */
	public void showQuizMarks() {
		for (String name : quizMarks.keySet()) {
			System.out.format("\n\nQuiz marks for: %s \n", name);
			for (int mark : getQuizzes(name)) {
				System.out.format("%d ", mark);
			}
		}
	}

}
