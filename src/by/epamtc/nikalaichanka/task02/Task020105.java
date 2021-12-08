package by.epamtc.nikalaichanka.task02;

import java.util.ArrayList;
import java.util.List;

public class Task020105 {

	public static void task() {
		// 1.5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа,
		// для которых аi > i.
		int[] mas = new int[] { 10, -22, 31, -45, 15, 0 };
		printList(biggerThanIndex(mas));
		
	}

	public static List<Integer> biggerThanIndex(int[] mas) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > i) {
				list.add(mas[i]);
			}
		}
		return list;
	}
	
	public static <E> void printList(List<E> list) {
		for (E i : list) {
			System.out.print(i + " ");
		}
	}
}
