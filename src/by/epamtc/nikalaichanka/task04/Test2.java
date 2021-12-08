package by.epamtc.nikalaichanka.task04;

public class Test2 {
	// 4.2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными
	// параметрами. Добавьте конструктор, инициализирующий члены класса по
	// умолчанию. Добавьте set- и get- методы для полей экземпляра класса.

	private int x;
	private int y;

	public Test2() {
		this.x = 2;
		this.y = 4;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void print() {
		System.out.println("x = " + x + "\ny = " + y);
	}
}
