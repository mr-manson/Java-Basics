package by.epamtc.nikalaichanka.task02;

public class Task020411 {

	public static void task() {
		// 4.11. Написать метод(методы), определяющий, в каком из данных двух чисел
		// больше цифр.

		int a = 33457;
		int b = 3456;
		quantity(a);
		quantity(b);
		System.out.println(inWhichMore(a, b));

	}

	public static int quantity(int a) {
		int aa = a;
		int count = 0;
		while (aa != 0) {
			aa = aa / 10;
			count++;
		}
		return count;
	}
	
	public static int inWhichMore(int a, int b) {
		int compar = 0;
		if (quantity(a) > quantity(b)) {
			compar = 1;
		} else if (quantity(a) < quantity(b)) {
			compar = -1;
		}
		return compar;
	}
}