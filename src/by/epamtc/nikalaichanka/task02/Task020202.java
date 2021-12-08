package by.epamtc.nikalaichanka.task02;

public class Task020202 {

	public static void task() {
		// 2.2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
		
		int[][] mas = {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if(i == j) {
					System.out.print(mas[i][j] + " ");
				}
			}
		}
	}
}
