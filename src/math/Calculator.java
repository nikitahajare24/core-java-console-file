package math;

public class Calculator {
	
		public static void main (String []args) {
			Addition(65,50);
			Substraction(600,150);
			Multiplication(85,5);
			Division(27,3);
		}
		public static void Addition(int a,int b) {
			int c=a+b;
			System.out.println("Addition of two numbers:"+c);
			
		}
		public static void Substraction(int a,int b) {
			int c=a-b;
			System.out.println("Substraction of two numbers:"+c);
		}
		public static void Multiplication(int a,int b) {
			int c=a*b;
			System.out.println("Multiplication of two numbers:"+c);
		}
		public static void Division(int a,int b) {
			int c=a/b;
			System.out.println("Division of two numbers:"+c);
		}

	}


