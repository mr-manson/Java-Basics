package by.epamtc.nikalaichanka.task01;

public class Task010303 {

	public static void task() {
		// 3.3. Найти сумму квадратов первых ста чисел.
		int i = 100;
		System.out.println(sumSquare(i));
	}

	public static int sumSquare(int a) {
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			sum += i * i;
		}
		return sum;
	}
}
