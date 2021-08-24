package ru.dev.qa;

public class MyFirstProgram {
	public static void main(String[] args) {

		hello("world");
		hello("Lera");

		double len = 2.;
		System.out.println("Площадь квдарата со стороной " + len + " = " + area(len));

		double a = 2.;
		double b = 3.;
		System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));
	}

	public static void hello(String who){
		System.out.println("Hello, " + who + "!");
	}

	public static double area(double len){
		return len*len;
	}

	public static double area(double a, double b){
		return a*b;
	}
}