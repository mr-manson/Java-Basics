package by.epamtc.nikalaichanka.task01;

public class Task010204 {

	public static void task() {
		// 2.4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
		// Определить, пройдет ли кирпич через отверстие.
		int A = 5, B = 10;
		int x = 5, y = 9, z = 2;
		System.out.println(isPassThrough(A, B, x, y, z));

	}

	public static boolean isSmaller(int aHole, int bHole, int cBrick, int dBrick) {
		boolean isSmaller = false;
		if (aHole > cBrick && bHole > dBrick || aHole > dBrick && bHole > cBrick) {
			isSmaller = true;
		}
		return isSmaller;
	}

	public static boolean isPassThrough(int aHole, int bHole, int xBrick, int yBrick, int zBrick) {
		boolean isPassThrough = false;
		if (isSmaller(aHole, bHole, xBrick, yBrick) || isSmaller(aHole, bHole, yBrick, zBrick)
				|| isSmaller(aHole, bHole, xBrick, zBrick)) {
			isPassThrough = true;
		}
		return isPassThrough;
	}
}
