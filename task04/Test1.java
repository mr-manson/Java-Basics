package by.epamtc.nikalaichanka.task04;

public class Test1 {
	// 4.1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и
	// методы изменения этих переменных. Добавьте метод, который находит сумму
	// значений этих переменных, и метод, который находит наибольшее значение из
	// этих двух переменных.
	
	private int x;
	private int y;
	
	public void print(int a) {
		System.out.println(a);
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
	
	public int sum(int a, int b) {
		return a + b;
	}
}
