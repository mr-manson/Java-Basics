package by.epamtc.nikalaichanka.task02;

public class Task020107 {

	public static void task() {
		// 1.7. Даны действительные числа n a ,a , ,a 1 2 . Найти max( , , , ).
		int[] mas = new int[] { -10, 22, 31, 45, 15, 36 };
		int max;
		int sum;
		
		max = mas[0] + mas[mas.length - 1];
		
		for (int i = 0; i < mas.length / 2; i++) {
			sum = mas[i] + mas[mas.length - i - 1];
			if (max < sum) {
				max = sum;
			}
		}
		System.out.println(max);
	}
}
