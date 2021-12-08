package by.epamtc.nikalaichanka.task02;

public class Task020106 {

	public static void task() {
		// 1.6. Задана последовательность N вещественных чисел. Вычислить сумму чисел,
		// порядковые номера которых являются простыми числами.
		int[] mas = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		
		System.out.println(sumOfPrimeIndexes(mas));
	}
	
	public static int sumOfPrimeIndexes(int[] mas) {
		int sum = 0;
		for(int i = 2; i < mas.length; i++) {
			if (isPrime(i)) {
				sum += mas[i];
			}
		}
		return sum;
	}

	public static boolean isPrime(int a) {
		boolean isPrime = true;
		for (int i = 2; i < a; i++) {
			if (a % i == 0)
				isPrime = false;
		}
		return isPrime;
	}
}
