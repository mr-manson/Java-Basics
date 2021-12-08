package by.epamtc.nikalaichanka.task02;


public class Task020401 {

	public static void task() {
		// 4.1. Написать метод(методы) для нахождения наибольшего общего делителя и
		// наименьшего общего кратного двух натуральных чисел:
		
		int x = 35;
		int y = 28;

		int a = max(x, y);
		int b = min(x, y);
		int c = nod(a, b);

		int nok = (a * b) / c;

		System.out.println("HOD of " + a + " and " + b + " is " + c);
		System.out.println("HOK of " + a + " and " + b + " is " + nok);
	}

	public static int max(int a, int b) {
		int max = 0;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		return max;
	}

	public static int min(int a, int b) {
		int min = 0;
		if (a < b) {
			min = a;
		} else {
			min = b;
		}
		return min;
	}

	public static int nod(int a, int b) {
		int x = 1;
		while (a != 0 && b != 0) {
			x = a % b;
			a = b;
			b = x;
		}
		return a;
	}
}

