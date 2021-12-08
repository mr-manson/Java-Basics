package by.epamtc.nikalaichanka.task02;

public class Task020103 {

	public static void task() {
		// 1.3. Дан массив действительных чисел, размерность которого N. Подсчитать,
		// сколько в нем отрицательных, положительных и нулевых элементов.
		int[] mas = new int[] { 10, -22, 31, -45, 15, 0 };
		System.out.println(negativeCounter(mas));
		System.out.println(positiveCounter(mas));
		System.out.println(zeroCounter(mas));
	}
	
	public static int negativeCounter(int [] mas) {
		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < 0) {
				count++;
			}
		}
		return count;
	}
	
	public static int positiveCounter(int[] mas) {
		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > 0) {
				count++;
			}
		}
		return count;
	}
	
	public static int zeroCounter(int[] mas) {
		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				count++;
			}
		}
		return count;
	}
}
