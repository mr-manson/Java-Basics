package by.epamtc.nikalaichanka.task01;

import static java.lang.Math.*;

public class Task010205 {

	public static void task() {
		// 2.5. Вычислить значение функции:
		int x = 4;
		int div = 3;
		System.out.println(function4(x, div));
	}

	public static double function4(int x, int divide) {
		double f = 0;
		if (x <= divide) {
			f = pow(x, 2) - 3 * x + 9;
		} else {
			f = 1 / (pow(x, 3) + 6);
		}
		return f;
	}
}
