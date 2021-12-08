package by.epamtc.nikalaichanka.task01;

import static java.lang.Math.*;

public class Task010103 {

	public static void task() {
		// 1.3. Вычислить значение выражения по формуле (все переменные принимают
		// действительные значения):
		double x = 2, y = 3;
		System.out.print(function3(x, y));
	}

	public static double function3(double x, double y) {
		double z = ((sin(x) + cos(y)) / (cos(x) - sin(y))) * tan(x * y);
		return z;
	}
}
