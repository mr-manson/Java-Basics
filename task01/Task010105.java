package by.epamtc.nikalaichanka.task01;

public class Task010105 {

	public static void task() {
		// 1.5. Дано натуральное число Т, которое представляет длительность прошедшего
		// времени в секундах. Вывести данное значение длительности в часах, минутах и
		// секундах в следующей форме: ННч ММмин SSc.
		int t = 25000;
		System.out.print(timePassed(t));
	}

	public static String timePassed(int a) {
		String time = "";
		int hour = a / 3600;
		int min = (a - (hour * 3600)) / 60;
		int sec = (a - (hour * 3600) / 60) % 60;
		time = hour + " � " + min + " ��� " + sec + " c";
		return time;
	}
}
