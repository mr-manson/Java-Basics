package by.epamtc.nikalaichanka.task01;

public class Task010203 {

	public static void task() {
		// 2.3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они
		// расположены на одной прямой.
		int x1 = 2;
		int y1 = 4;
		int x2 = 1;
		int y2 = 4;
		int x3 = 1;
		int y3 = -4;

		if (((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)) == 0) {
			System.out.println("Точки лежат на одной прямой");
		} else {
			System.out.println("Точки не лежат на одной прямой");
		}
	}
}
