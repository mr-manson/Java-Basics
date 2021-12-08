package by.epamtc.nikalaichanka.task04;

public class Time {
	// 4.6. Составьте описание класса для представления времени. Предусмотрте
	// возможности установки времени и изменения его отдельных полей (час, минута,
	// секунда) с проверкой допустимости вводимых значений. В случае недопустимых
	// значений полей поле устанавливается в значение 0. Создать методы изменения
	// времени на заданное количество часов, минут и секунд

	private int h;
	private int m;
	private int s;

	public Time() {}

	public void setTime(int h, int m, int s) {
		this.h = setIfWrong(h, 23);
		this.m = setIfWrong(m, 59);
		this.s = setIfWrong(s, 59);
	}

	public void addTime(int addH, int addM, int addS) {
		System.out.print("Через " + addH + " ч. " + addM + " мин. " + addS + " сек. будет ");

		if (this.h + addH > 23) {
			this.h = (this.h + addH) % 24;
		} else {
			this.h += addH;
		}

		if (this.m + addM > 59) {
			this.m = (this.m + addM) % 60;
			this.h++;
		} else {
			this.m += addM;
		}

		if (this.s + addS > 59) {
			this.s = (this.s + addS) % 60;
			this.m++;
		} else {
			this.s += addS;
		}
	}

	public String getTime() {
		String zero = "0";

		String h = String.valueOf(this.h);
		if (this.h < 10) {
			h = zero + this.h;
		}
		String m = String.valueOf(this.m);
		if (this.m < 10) {
			m = zero + this.m;
		}
		String s = String.valueOf(this.s);
		if (this.s < 10) {
			s = zero + this.s;
		}
		String time = h + ":" + m + ":" + s;
		return time;
	}

	public int setIfWrong(int i, int max) {
		if (i < 0 || i > max) {
			return 0;
		} else {
			return i;
		}
	}
}
