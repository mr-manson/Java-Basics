package by.epamtc.nikalaichanka.task03;

public class Task030102 {

	public static void task() {
		// 3.2. Замените в строке все вхождения 'word' на 'letter'

		String str = "word text book word word folio";
		String strIn = "word";
		String strOut = "letter";
		
		String result = str.replace(strIn, strOut);
		
		System.out.println(result);
	}
}
