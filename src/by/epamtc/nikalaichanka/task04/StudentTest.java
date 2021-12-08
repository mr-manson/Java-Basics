package by.epamtc.nikalaichanka.task04;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class StudentTest {
	
	public static void main (String[] args) {
		
		Student[] mas = new Student[10];

		mas[0] = new Student("Ivan", "Ivanov", 123, new int[] { 9, 10, 8, 9, 9 });
		mas[1] = new Student("Petr", "Petrov", 123, new int[] { 10, 10, 9, 9, 10 });
		mas[2] = new Student("Sidor", "Sidorov", 321, new int[] { 7, 8, 8, 9, 9 });
		mas[3] = new Student("Elena", "Elenina", 321, new int[] { 8, 8, 8, 8, 8 });
		mas[4] = new Student("Pavel", "Pavlov", 123, new int[] { 9, 9, 8, 9, 9 });
		mas[5] = new Student("Marina", "Marinina", 987, new int[] { 10, 10, 10, 10, 10 });
		mas[6] = new Student("Tatjana", "Tatjanina", 123, new int[] { 10, 10, 8, 9, 9 });
		mas[7] = new Student("Sergey", "Sergeev", 987, new int[] { 9, 8, 8, 9, 8 });
		mas[8] = new Student("Viktor", "Viktorov", 789, new int[] { 10, 10, 10, 10, 10 });
		mas[9] = new Student("Vasja", "Pupkin", 789, new int[] { 8, 10, 8, 9, 8 });
		
		List<Student> okStudents = new ArrayList<>();
		okStudents = StudentLogic.OkStudents(mas);
		StudentLogic.print(okStudents);
		
	}

}
