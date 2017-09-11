import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {

		// You may test that your code works find here
		// Please check that your code works and has no
		// compilation problems before to submit

		String sd1 = "1980-07-11";
		String sd2 = "1978-11-02";
		String sd3 = "1985-10-05";
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");

		Date date1 = null;
		Date date2 = null;
		Date date3 = null;
		try {
			date1 = format.parse(sd1);
			date2 = format.parse(sd2);
			date3 = format.parse(sd3);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Student student1 = new Student(1, "Peter", date1, 5.5);
		Student student2 = new Student(2, "Fgdkjgfh", date2, 6.5);
		Student student3 = new Student(3, "Ogdkjgfh", date3, 6.5);
		Student student4 = new Student(4, "Peter", date2, 8.5);
		Student student5 = new Student(5, "Uhytkjgfh", date3, 8.5);
		Student student6 = new Student(6, "GHytkjgfh", date2, 9.5);

		StudentGroup studentGroup = new StudentGroup(4);
		Student[] students = new Student[4];
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		students[3] = student4;
	}

}
