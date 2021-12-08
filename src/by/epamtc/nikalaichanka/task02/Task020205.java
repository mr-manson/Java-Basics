package by.epamtc.nikalaichanka.task02;

public class Task020205 {

	public static void task() {
		// 2.5. Сформировать квадратную матрицу порядка n по заданному образцу(n -
		// четное):
		int n = 6;
		int[][] mas = new int[n][n];
		
		masFiller(mas);
		printMas(mas);

	}
	
	public static void masFiller(int [][] mas) {
		int x = 1;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (j <= mas[i].length - i - 1) {
					mas[i][j] = x;
				} else {
					mas[i][j] = 0;
				}
			}
			x++;
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
