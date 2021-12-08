package by.epamtc.nikalaichanka.task04;

import java.util.ArrayList;
import java.util.List;

public class StudentLogic {
	
	public static boolean isGoodStudent(Student student) {
		int [] grades = student.getGrades();
		boolean isGood = false;
		int count = 0;
		
		for(int i : grades) {
			if (i < 9) {
				count ++;
			}
		}
		if(count == 0) {
			isGood = true;
		}
		return isGood;
	}
	
	public static List <Student> OkStudents(Student[] students) {
		List <Student> st = new ArrayList<Student>();

		for (int i = 0; i < students.length; i++) {
			if (isGoodStudent(students[i])) {
				st.add(students[i]);
			}
		}
		return st;
	}
	
	public static void print(List<Student> list) {
		for (Student s : list) {
			System.out.println(s.getName() + " " + s.getSurname() + ", " + s.getGroupNumber());
		}
	}
}
