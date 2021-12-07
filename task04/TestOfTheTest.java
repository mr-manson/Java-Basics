package by.epamtc.nikalaichanka.task04;

public class TestOfTheTest {

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.setX(5);
		t.setY(10);
		
		t.print(t.sum(t.getX(), t.getY()));

	}

}
