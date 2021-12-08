package by.epamtc.nikalaichanka.task03;

public class Task030103 {

	public static void task() {
		// 3.3. В строке найти количество цифр.

		String str = "word 12 book 3 word folio";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				count++;
			}
		}
		System.out.println(count);
	}
}
