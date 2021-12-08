package by.epamtc.nikalaichanka.task01;

public class Task010304 {

	public static void task() {
		// 3.4. Составить программу нахождения произведения квадратов первых двухсот
		// чисел.
		long i = 200L;
		System.out.println(multSquare(i));
	}

	public static long multSquare(long a) {
		long mult = 1L;
		for (long i = 1; i <= a; i++) {
			mult *= (i * i);
			if (mult < 0) {
				mult = -1;
			}
		}
		return mult;
	}
}
