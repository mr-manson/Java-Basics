package by.epamtc.nikalaichanka.task02;

public class Task020101 {

	public static void task() {
		// 1.1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов,
		// которые кратны данному К.
		int[] mas = new int[] { 10, 22, 31, 45, 15, 36 };
		int k = 3;

		System.out.println(multipleOfK(mas, k));
	}

	public static int multipleOfK(int[] mas, int k) {
		int sum = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % k == 0) {
				sum += mas[i];
			}
		}
		return sum;
	}

	/*
	
	
	
	
	*/
	public static void masRandomInit(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 99);
		}
	}
}
