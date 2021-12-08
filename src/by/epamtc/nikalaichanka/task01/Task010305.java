package by.epamtc.nikalaichanka.task01;

public class Task010305 {

	public static void task() {
		// 3.5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
		// модуль которых больше или равен заданному е. Общий член ряда имеет вид:
		double a = 0;
		double e = 0.1;
		double n = 7;
		double sum = 0;

		for (int i = 1; i <= n; i++) {
			a = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));
			if (Math.abs(a) >= e) {
				sum += a;
			}
		}
		System.out.println("Сумма модулей равна " + sum);
	}
}
