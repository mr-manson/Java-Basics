package by.epamtc.nikalaichanka.task01;

public class Task010201 {

	public static void task() {
		// 2.1. Даны два угла треугольника (в градусах). Определить, существует ли такой
		// треугольник, и если да, то будет ли он прямоугольным.
		int angleA = 140;
		int angleB = 45;
		System.out.println(isExists(angleA, angleB));
		System.out.println(isRectangular(angleA, angleB));
	}

	public static boolean isExists(int a, int b) {
		boolean isExists = false;
		if (a > 0 && b > 0 && a + b < 180) {
			isExists = true;
		}
		return isExists;
	}

	public static boolean isRectangular(int a, int b) {
		boolean isRectangular = false;
		if (a == 90 || b == 90 || a + b == 90) {
			isRectangular = true;
		}
		return isRectangular;
	}
}
