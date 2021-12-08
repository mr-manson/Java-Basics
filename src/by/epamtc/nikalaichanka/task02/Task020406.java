package by.epamtc.nikalaichanka.task02;

public class Task020406 {

	public static void task() {
		// 4.6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

		int a = 3, b = 7, c = 11;
		simple(a, b, c);
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

	public static void simple(int a, int b, int c) {
		int nod;
		nod = nod(nod(a, b), c);
		if (Math.abs(nod) == 1) {
			System.out.println(a + ", " + b + ", " + c + " are relatively simple");
		} else {
			System.out.println(a + ", " + b + ", " + c + " are not relatively simple");
		}
	}
}