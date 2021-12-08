package by.epamtc.nikalaichanka.task02;

public class Task020409 {

	public static void task() {
		// 4.9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать
		// метод(методы) вычисления его площади, если угол между сторонами длиной X и Y—
		// прямой.

		int x = 6, y = 3, z = 5, t = 5;
		int hyp;
		int areaXY;
		int areaZT;
		int areaRect;

		hyp = hypotenuse(x, y);
		areaXY = areaRectangularTriangle(x, y);
		areaZT = areaTriangleBySide(z, t, hyp);
		areaRect = areaXY + areaZT;
		System.out.println("Rectangle area " + areaRect);
	}

	public static int areaRectangularTriangle(int a, int b) {
		int area;
		area = (a * b) / 2;
		return area;
	}

	public static int areaTriangleBySide(int a, int b, int c) {
		int p;
		int area;
		p = (a + b + c) / 2;
		area = (int) Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return area;
	}

	public static int hypotenuse(int a, int b) {
		int c;
		c = (int) Math.sqrt(a * a + b * b);
		return c;
	}
}