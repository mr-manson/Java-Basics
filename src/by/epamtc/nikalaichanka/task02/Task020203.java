package by.epamtc.nikalaichanka.task02;

public class Task020203 {

	public static void task() {
		// 2.3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

		int[][] mas = new int[][] { { 1, 2, 3, 4 }, { 3, 4, 5, 6 }, { 5, 6, 7, 8 }, { 7, 8, 9, 0 } };

		printMas(mas);
		System.out.println();
		printMasColumn(mas, 2);
		printMasLine(mas, 2);

	}

	public static void printMasColumn(int[][] mas, int p) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (j == p) {
					System.out.print(mas[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	public static void printMasLine(int[][] mas, int k) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == k) {
					System.out.print(mas[i][j] + " ");
				}
			}
			System.out.println();			
		}
	}

	public static void printMas(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
