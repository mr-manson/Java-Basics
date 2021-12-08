package by.epamtc.nikalaichanka.task01;

public class Task010307 {

	public static void task() {
		// 3.7. Для каждого натурального числа в промежутке от m до n вывести все
		// делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.

		int m = 10;
		int n = 15;

		for (int i = m; i <= n; i++) {
			System.out.print("Делители числа " + i + " - ");
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
					System.out.print(j + "  ");
				}
			}
			if (count == 0) {
				System.out.print("делителей нет");
			}
			System.out.println("");
		}
	}
}
