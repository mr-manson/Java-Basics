package by.epamtc.nikalaichanka.task04;

public class TriangleTest {
	
	public static void main (String[] args) {
		
		Triangle tr = new Triangle(3, 6, 7);

		System.out.println("Периметр треугольника " + tr.perimetr(tr));
		System.out.printf("Площадь треугольника %.2f%n", tr.area(tr));
	}

}
