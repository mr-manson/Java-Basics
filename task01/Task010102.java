package by.epamtc.nikalaichanka.task01;

import static java.lang.Math.*;

public class Task010102 {

	public static void task() {
		// 1.2. Вычислить значение выражения по формуле (все переменные принимают
		// действительные значения):
		double a = 2, b = 3, c = 4;
		System.out.print(function2(a, b, c));
	}

	public static double function2(double a, double b, double c) {
		double z = ((b + (sqrt((pow(b, 2)) + 4 * a * c))) / 2 * a) - (pow(a, 3) * c) + pow(b, -2);
		return z;
	}
}
