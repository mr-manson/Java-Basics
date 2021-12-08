package by.epamtc.nikalaichanka.task02;

public class Task020414 {

	public static void task() {
		// 4.14. Натуральное число, в записи которого n цифр, называется числом
		// Армстронга, если сумма его цифр, возведенная в степень n, равна самому числу.
		// Найти все числа Армстронга от 1 до k. Для решения задачи использовать
		// декомпозицию.

		int k = 1000;
		System.out.println("Armstrong digits from 1 to " + k + ":");
		for (int i = 1; i <= k; i++) {
			if ((int)(Math.pow(sum(i), count(i))) == i) {
				System.out.print(i + " ");
			}
		}
	}

	public static int count(int i) {
		int count = 0;
		while (i > 0) {
			count ++;
			i /= 10;
		}
		return count;
	}
	
	public static int sum(int i) {
		int sum = 0;
		int a = 0;
		while(i > 0) {
			a = i % 10;
			sum += a;
			i/=10;
		}
		return sum;
		
	}
}