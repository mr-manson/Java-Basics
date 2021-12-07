package by.epamtc.nikalaichanka.task01;

import java.util.HashSet;
import java.util.Set;

public class Task010308 {

	public static void task() {
		// 3.8. Даны два числа. Определить цифры, входящие в запись как первого так и
		// второго числа.
		int a = 15639;
		int b = 11122376;
		System.out.print("Общие цифры двух чисел: ");
		printSet(commonDigit(a, b));
	}

	public static Set<Integer> commonDigit(int a, int b) {
		Set<Integer> set = new HashSet<>();
		int bb = b;
		while (a > 0) {
			int x = a % 10;
			b = bb;
			while (b > 0) {
				int y = b % 10;
				if (y == x) {
					set.add(y);
				}
				b /= 10;
			}
			a /= 10;
		}
		return set;
	}

	public static <E> void printSet(Set<E> set) {
		for (E i : set) {
			System.out.print(i + " ");
		}
	}
}
