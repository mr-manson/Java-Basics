package by.epamtc.nikalaichanka.task04;

public class Test1 {
	// 4.1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и
	// методы изменения этих переменных. Добавьте метод, который находит сумму
	// значений этих переменных, и метод, который находит наибольшее значение из
	// этих двух переменных.
	
	private int x;
	private int y;
	
	public void print() {
		System.out.println("x = " + this.x);
		System.out.println("y = " + this.y);
	}
	
	public void print(int x) {
		System.out.println(x);
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	public int sum(int x, int y) {
		return this.x + this.y;
	}
	
	public int max(int x, int y) {
		int max = x;
		if (x < y) {
			max = y;
		}
		return max;
	}
}
