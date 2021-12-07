package by.epamtc.nikalaichanka.task01;

public class Task010101 {

	public static void task() {
		// 1.1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
		double a = 2, b = 3, c = 4;
		System.out.print(function(a, b, c));
	}

	public static double function(double a, double b, double c) {
		double z = ((a - 3) * b / 2) + c;
		return z;
	}
}
