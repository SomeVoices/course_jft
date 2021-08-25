package ru.dev.qa;

public class MyFirstProgram {
	public static void main(String[] args) {

		hello("world");
		hello("Lera");

		Square s = new Square(7);
		System.out.println("Площадь квдарата со стороной " + s.len + " = " + s.area());

		Rectangle r = new Rectangle(4, 5);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
	}

	public static void hello(String who){
		System.out.println("Hello, " + who + "!");
	}
}