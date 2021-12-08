package by.epamtc.nikalaichanka.task02;


public class Task020402 {

	public static void task() {
		// 4.2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
		
		int a = 12, b = 8, c = 32, d = 16;
		int nod = nod(nod(a, b), nod(c, d));
		System.out.println(nod);
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
