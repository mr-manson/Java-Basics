package by.epamtc.nikalaichanka.task02;

public class Task020206 {

	public static void task() {
		// 2.6. Сформировать квадратную матрицу порядка n по заданному образцу(n -
		// четное):
		int n = 6;
		int[][] mas = new int[n][n];
		
		masFiller(mas);
		printMas(mas);

	}
	
	public static void masFiller(int [][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if ((i <= j) && (i + j <= mas.length - 1) || (i >= j) && (i + j >= mas.length - 1)) {
					mas[i][j] = 1;
				} else {
					mas[i][j] = 0;
				}
			}
		}
	}
	
	public static void printMas(int[][] mat){
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j < mat[i].length; j++){
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
