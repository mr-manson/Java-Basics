package by.epamtc.nikalaichanka.task02;

public class Task020403 {

	public static void task() {
		// 4.3. Вычислить площадь правильного шестиугольника со стороной а, используя
		// метод вычисления площади треугольника.

		int a = 6;
		int areaHexagon;
		areaHexagon = 6 * areaTriangleBySide(a);
		System.out.println(areaHexagon);
	}

	public static int areaTriangleBySide(int a) {
		int area;
		area = (int) (((a * a) * Math.sqrt(3)) / 4);
		return area;
	}
}