package by.epamtc.nikalaichanka.task02;

public class Task020207 {

	public static void task() {
		// 2.7. Сформировать квадратную матрицу порядка N по правилу: ... и подсчитать
		// количество положительных элементов в ней.
		int n = 6;
		double[][] mas = new double[n][n];

		masFiller(mas);
		printMas(mas);
		System.out.println(masPositiveElemCounter(mas));

	}

	public static void masFiller(double[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = Math.sin((i * i - j * j) / mas.length);
			}
		}
	}

	public static int masPositiveElemCounter(double[][] mas) {
		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] < 0) {
					count++;
				}
			}
		}
		return count;
	}

	public static void printMas(double[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%7.2f", mas[i][j]);
			}
			System.out.println();
		}
	}
}
