package by.epamtc.nikalaichanka.task01;

public class Task010104 {

	public static void task() {
		// 1.4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной
		// и целой частях). Поменять местами дробную и целую части числа и вывести
		// полученное значение числа.
		double r = 333.222;
		System.out.print(reverceDouble(r));
	}

	public static double reverceDouble(double r) {
		double y = (r * 1000) % 1000 + (int) r / 1000.0;
		return y;
	}
}
