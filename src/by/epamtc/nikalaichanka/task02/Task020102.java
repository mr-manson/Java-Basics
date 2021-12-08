package by.epamtc.nikalaichanka.task02;

public class Task020102 {

	public static void task() {
		// 1.2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить
		// все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
		int[] mas = new int[] { 10, 22, 31, 45, 15, 36 };
		int z = 35;
		System.out.print("������� �����: ");
		System.out.print(masReplaseCounter(mas, z));

	}

	public static int masReplaseCounter(int[] mas, int z) {
		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > z) {
				mas[i] = z;
				count++;
			}
		}
		return count;
	}
}
