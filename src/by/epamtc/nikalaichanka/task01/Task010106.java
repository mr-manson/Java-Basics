package by.epamtc.nikalaichanka.task01;

import static java.lang.Math.*;

public class Task010106 {

	public static void task() {
		// 1.6. Для данной области составить линейную программу, которая печатает true,
		// если точка с координатами (х, у) принадлежит закрашенной области, и false — в
		// противном случае:
		int x = -3;
		int y = 5;
		System.out.println(isInside(x, y));
	}

	public static boolean isInside(int x, int y) {
		boolean b = false;
		if (y > 0 && abs(x) + y <= 6 || y < 0 && abs(x) + abs(y) <= 7) {
			b = true;
		}
		return b;
	}
}
