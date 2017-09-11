import java.util.Date;
import java.util.GregorianCalendar;

/**
 * A fix-sized array of students array length should always be equal to the
 * number of stored elements after the element was removed the size of the array
 * should be equal to the number of stored elements after the element was added
 * the size of the array should be equal to the number of stored elements null
 * elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given
 * class, interface or method DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;

	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * 
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here

		if (students == null) {
			throw new IllegalArgumentException();
		} else
			this.students = students;
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		Student student = null;
		if (index < 0 || index >= students.length) {
			throw new IllegalArgumentException();
		} else {
			student = students[index];
		}

		return student;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if (student == null) {
			throw new IllegalArgumentException();
		}
		if (index < 0 || index >= students.length) {
			throw new IllegalArgumentException();
		} else
			for (int i = 0; i < students.length; i++) {
				if (i == index) {
					students[i] = student;
				}
			}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		Student[] studentss = null;
		if (student == null) {
			throw new IllegalArgumentException();
		} else
			studentss = new Student[students.length + 1];
		for (int i = 0; i < studentss.length; i++) {
			if (i == 0) {
				studentss[i] = student;
			} else
				studentss[i] = students[i - 1];
		}
		setStudents(studentss);
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		Student[] studentss = null;
		if (student == null) {
			throw new IllegalArgumentException();
		} else
			studentss = new Student[students.length + 1];
		for (int i = 0; i < studentss.length; i++) {
			if (i == (studentss.length - 1)) {
				studentss[i] = student;
			} else
				studentss[i] = students[i];
		}
		setStudents(studentss);
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		Student[] studentss = null;
		if (student == null) {
			throw new IllegalArgumentException();
		}
		if (index < 0 || index >= students.length) {
			throw new IllegalArgumentException();
		}
		studentss = new Student[students.length + 1];

		for (int i = 0; i < studentss.length; i++) {
			if (i == index) {
				studentss[i] = student;
			}
			studentss[i] = students[i];
		}
		setStudents(studentss);
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		Student[] studentss = null;
		int y = 0;
		if (index < 0 || index >= students.length) {
			throw new IllegalArgumentException();
		}
		studentss = new Student[students.length - 1];
		for (int i = 0; i < students.length; i++) {
			if (i == index) {
				continue;
			} else
				studentss[y] = students[i];
			y++;
		}
		setStudents(studentss);
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		Student[] studentss = null;
		int y = 0;
		int count = 0;
		if (student == null) {
			throw new IllegalArgumentException();
		}
		studentss = new Student[students.length - 1];
		for (int i = 0; i < students.length; i++) {
			if (students[i].equals(student)) {
				count = 1;
				continue;
			} else
				studentss[y] = students[i];
			y++;

		}
		if (count == 0) {
			throw new IllegalArgumentException("Student not exist");
		} else
			setStudents(studentss);
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		Student[] studentss = null;
		int y = 0;
		int len = students.length - (students.length - index - 1);
		if (index < 0 || index >= students.length) {
			throw new IllegalArgumentException();
		}
		studentss = new Student[len];

		for (int i = 0; i < len; i++) {
			studentss[y] = students[i];
			y = y + 1;
		}
		setStudents(studentss);
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		Student[] studentss = null;
		int y = 0;
		int index = 0;
		if (student == null) {
			throw new IllegalArgumentException();
		}
		for (int i = 0; i < students.length; i++) {
			if (students[i].equals(student)) {
				index = i;
			}
		}
		int len = students.length - (students.length - index - 1);
		studentss = new Student[len];
		for (int i = 0; i < len; i++) {
			studentss[y] = students[i];
			y = y + 1;
		}

		setStudents(studentss);
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		Student[] studentss = null;
		int y = 0;
		int len = students.length - index;
		if (index < 0 || index >= students.length) {
			throw new IllegalArgumentException();
		}
		studentss = new Student[len];

		for (int i = index; i < students.length; i++) {
			studentss[y] = students[i];
			y = y + 1;
		}
		setStudents(studentss);
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		Student[] studentss = null;
		int y = 0;
		int index = 0;
		if (student == null) {
			throw new IllegalArgumentException();
		}
		for (int i = 0; i < students.length; i++) {
			if (students[i].equals(student)) {
				index = i;
			}
		}
		int len = students.length - index;
		studentss = new Student[len];

		for (int i = index; i < students.length; i++) {
			studentss[y] = students[i];
			y = y + 1;
		}
		setStudents(studentss);
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		for (int i = students.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {

				if (students[j].getId() > students[j + 1].getId()) {
					Student tmp = students[j];
					students[j] = students[j + 1];
					students[j + 1] = tmp;
				}
			}
		}

	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		if (date == null) {
			throw new IllegalArgumentException();
		}
		Student[] studentss = new Student[students.length];
		for (int i = 0; i < students.length; i++) {
			if (students[i].getBirthDate().before(date) || students[i].getBirthDate().equals(date)) {

			}
			studentss[i] = students[i];
		}
		return studentss;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		if (firstDate == null || lastDate == null) {
			throw new IllegalArgumentException();
		}
		Student[] studentss = new Student[students.length];
		for (int i = 0; i < students.length; i++) {
			if (students[i].getBirthDate().after(firstDate) && students[i].getBirthDate().before(lastDate)) {
			}
			studentss[i] = students[i];
		}
		return studentss;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		if (date == null) {
			throw new IllegalArgumentException();
		}
		Student[] studentss = new Student[students.length];
		long l = days * 24 * 60 * 60 * 60 * 1000;

		long newl = date.getTime() + l;
		Date newDate = new Date(newl);
		for (int i = 0; i < students.length; i++) {
			if (students[i].getBirthDate().after(date) && students[i].getBirthDate().before(newDate)) {
			}
			studentss[i] = students[i];
		}
		return studentss;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		if (indexOfStudent == 0) {
			throw new IllegalArgumentException();
		}
		int years = 0;
		for (int i = 0; i < students.length; i++) {
			if (i == (indexOfStudent - 1)) {

				GregorianCalendar birthDay = new GregorianCalendar(students[i].getBirthDate().getYear(),
						students[i].getBirthDate().getMinutes(), students[i].getBirthDate().getDate());
				GregorianCalendar checkDay = new GregorianCalendar(new Date().getYear(), new Date().getMonth(),
						new Date().getDate());
				years = checkDay.get(GregorianCalendar.YEAR) - birthDay.get(GregorianCalendar.YEAR);
				int checkMonth = checkDay.get(GregorianCalendar.MONTH);
				int birthMonth = birthDay.get(GregorianCalendar.MONTH);
				if (checkMonth < birthMonth) {
					years--;
				} else if (checkMonth == birthMonth && checkDay.get(GregorianCalendar.DAY_OF_MONTH) < birthDay
						.get(GregorianCalendar.DAY_OF_MONTH)) {

					years--;
				}

			}
		}
		return years;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		int years = 0;
		Student[] studentss = new Student[students.length];
		for (int i = 0; i < students.length; i++) {
			GregorianCalendar birthDay = new GregorianCalendar(students[i].getBirthDate().getYear(),
					students[i].getBirthDate().getMinutes(), students[i].getBirthDate().getDate());
			GregorianCalendar checkDay = new GregorianCalendar(new Date().getYear(), new Date().getMonth(),
					new Date().getDate());
			years = checkDay.get(GregorianCalendar.YEAR) - birthDay.get(GregorianCalendar.YEAR);
			int checkMonth = checkDay.get(GregorianCalendar.MONTH);
			int birthMonth = birthDay.get(GregorianCalendar.MONTH);
			if (checkMonth < birthMonth) {
				years--;
			} else if (checkMonth == birthMonth
					&& checkDay.get(GregorianCalendar.DAY_OF_MONTH) < birthDay.get(GregorianCalendar.DAY_OF_MONTH)) {

				years--;
			}

			if (age == years) {
				studentss[i] = students[i];
			}

		}

		return studentss;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		Student[] studentss = new Student[students.length];
		double mark = students[0].getAvgMark();
		for (int i = 1; i < students.length; i++) {
			if (students[i].getAvgMark() > mark) {
				mark = students[i].getAvgMark();
			}
		}
		for (int i = 1; i < students.length; i++) {
			if (students[i].getAvgMark() == mark) {
				studentss[i] = students[i];
			}
		}

		return studentss;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		if (student == null) {
			throw new IllegalArgumentException();
		}
		Student st = null;
		for (int i = 0; i < students.length; i++) {
			if (students[i].equals(student) && i != (students.length - 1)) {
				st = students[i + 1];
				break;
			} else
				st = student;
		}

		return st;
	}
}
