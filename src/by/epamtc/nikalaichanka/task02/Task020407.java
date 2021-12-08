package by.epamtc.nikalaichanka.task02;

public class Task020407 {

	public static void task() {
		// 4.7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

		int a = 3;
		int b = 9;
		System.out.println(factorialOddSum(a, b));
	}

	public static int factorial(int a) {
		int fact = 1;
		for (int i = 1; i <= a; i++) {
			fact *= i;
		}
		return fact;
	}
	
	public static int factorialOddSum(int a, int b) {
		int sum = 0;
		for (int i = a; i <= b; i++) {
			if(i%2 != 0) {
				sum += factorial(i);
			}
		}
		return sum;
	}
}