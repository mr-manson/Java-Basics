package by.epamtc.nikalaichanka.task01;

public class Task010202 {

	public static void task() {
		// 2.2. Найти max{min(a, b), min(c, d)}.
		int a = 2, b = 5, c = 3, d = 9;
		System.out.println(max(min(a, b), min(c, d)));

	}

	public static int min(int a, int b) {
		int min = a;
		if (a > b) {
			min = b;
		}
		return min;
	}

	public static int max(int a, int b) {
		int max = a;
		if (a < b) {
			max = b;
		}
		return max;
	}
}
