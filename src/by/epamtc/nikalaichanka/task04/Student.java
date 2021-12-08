package by.epamtc.nikalaichanka.task04;

public class Student {
	// 4.3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы,
	// номер группы, успеваемость (массив из пяти элементов). Создайте массив из
	// десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров
	// групп студентов, имеющих оценки, равные только 9 или 10.

	private String name;
	private String surname;
	private int groupNumber;
	private int[] grades = new int[5];
	
	public Student (String name, String surname, int groupNumber, int[] grades) {
		this.name = name;
		this.surname = surname;
		this.groupNumber = groupNumber;
		this.grades = grades;
	}

	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public int getGroupNumber() {
		return groupNumber;
	}
	
	public int[] getGrades() {
		return grades;
	}
}
