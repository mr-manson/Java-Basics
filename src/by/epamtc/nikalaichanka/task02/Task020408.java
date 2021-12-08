package by.epamtc.nikalaichanka.task02;

public class Task020408 {

	public static void task() {
		// 4.8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] +
		// D[4] + D[5]; D[4] +D[5] +D[6]. Пояснение. Составить метод(методы) для
		// вычисления суммы трех последовательно расположенных элементов массива с
		// номерами от k до m

		int[] mas = new int[] { 3, 5, 6, 9, 7, 1, 5, 8, 4, 9 };

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		int k = 1;
		int m = k + 2;
		System.out.println();
		System.out.println(massSumThree(mas, k, m));
	}

	public static int massSumThree(int[] a, int k, int m) {
		int sum = 0;
		for (int i = k; i <= m; i++) {
			sum += a[i];
		}
		return sum;
	}
}