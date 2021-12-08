package by.epamtc.nikalaichanka.task02;

import java.util.Arrays;

public class Task020104 {

	public static void task020104() {
		// 1.4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший
		// и наименьший элементы.
		int[] mas = new int[] { 10, -22, 31, -45, 15, 0 };
		int min = minMasIndex(mas);
		int max = maxMasIndex(mas);
		swap(mas, min, max);
		System.out.println(Arrays.toString(mas));

	}

	public static int minMasIndex(int[] mas) {
		int min = 0;
		for (int i = 1; i < mas.length; i++) {
			if (mas[min] > mas[i]) {
				min = i;
			}
		}
		return min;
	}

	public static int maxMasIndex(int[] mas) {
		int max = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[max] < mas[i]) {
				max = i;
			}
		}
		return max;
	}

	public static void swap(int[] mas, int a, int b) {
		int tmp = mas[a];
		mas[a] = mas[b];
		mas[b] = tmp;
	}
}
