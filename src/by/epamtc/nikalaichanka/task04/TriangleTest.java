package by.epamtc.nikalaichanka.task04;

public class TriangleTest {
	
	public static void main (String[] args) {
		
		Triangle tr = new Triangle(3, 6, 7);

		System.out.println("�������� ������������ " + tr.perimetr(tr));
		System.out.printf("������� ������������ %.2f%n", tr.area(tr));
	}

}
