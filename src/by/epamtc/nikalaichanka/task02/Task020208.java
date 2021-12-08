package by.epamtc.nikalaichanka.task02;

import java.util.Scanner;

public class Task020208 {

	public static void task() {
		// 2.8. В числовой матрице поменять местами два столбца любых столбца, т. е. все
		// элементы одного столбца поставить на соответствующие им позиции другого, а
		// его элементы второго переместить в первый. Номера столбцов вводит
		// пользователь с клавиатуры.
		int n = 5;
		int k, l;
		int[][] mas = new int[n][n];

		masInitRandom(mas);
		masPrint(mas);
				
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������ ���� �������� �� 1 �� " + n);
		k = sc.nextInt() - 1;
		l = sc.nextInt() - 1;
		
		masSwap(mas, k, l);
		masPrint(mas);
	}

	public static void masInitRandom(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) (Math.random() * 10);
			}
		}
	}

	public static void masSwap(int[][] mas, int k, int l) {
		for (int i = 0; i < mas.length; i++) {
			int temp = mas[i][k];
			mas[i][k] = mas[i][l];
			mas[i][l] = temp;
		}
	}

	public static void masPrint(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
	}
}
