package by.epamtc.nikalaichanka.task02;

public class Task020410 {

	public static void task() {
		// 4.10. Дано натуральное число N. Написать метод(методы) для формирования
		// массива, элементами которого являются цифры числа N.

		int a = 123698745;

		int count = count(a);
		int[] mas = new int[count];
		digitToMass(mas, a);
		masPrint(mas);

	}

	public static int count(int a) {
		int count = 0;
		while (a > 0) {
			count++;
			a /= 10;
		}
		return count;
	}

	public static void digitToMass(int[] a, int b) {
		while (b > 0) {
			for (int i = a.length - 1; i >= 0; i--) {
				int x;
				x = b % 10;
				b /= 10;
				a[i] = x;
			}
		}
	}
	
	public static void masPrint(int[] mas) {
		for(int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}
}