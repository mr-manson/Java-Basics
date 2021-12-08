package by.epamtc.nikalaichanka.task02;

public class Task020204 {

	public static void task() {
		// 2.4. Сформировать квадратную матрицу порядка n по заданному образцу(n -
		// четное):
		int n = 6;
		int[][] mas = new int[n][n];
		
		

		for (int i = 0; i < mas.length; i++) {
			int x = 1;
			int y = n;
			if (i % 2 == 0) {
				for (int j = 0; j < mas[i].length; j++) {
					mas[i][j] = x;
					x++;
					System.out.print(mas[i][j] + " ");
				}
				System.out.println();
			} else if (i % 2 != 0) {
				for (int j = 0; j < mas[i].length; j++) {
					mas[i][j] = y;
					y--;
					System.out.print(mas[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
