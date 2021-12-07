package by.epamtc.nikalaichanka.task01;

import java.util.ArrayList;
import java.util.List;

public class Task010302 {

	public static void task() {
		// 3.2. Вычислить значения функции на отрезке [а,b] c шагом h:
		
		int a = -10;
		int b = 10;
		int h = 3;
		System.out.print(function5(a, b, h));
	}

	public static List<Integer> function5(int a, int b, int h) {
		int y = 0;
		List<Integer> list = new ArrayList<>();
		for (int x = a; x <= b; x += h) {
			if (x > 2) {
				y = x;
			} else {
				y = -x;
			}
			list.add(y);
		}
		return list;
	}
}
