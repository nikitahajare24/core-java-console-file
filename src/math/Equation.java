package math;
import java.util.Scanner;
public class Equation {

	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=a*a+2*a*b+b*b;
		System.out.println("Equation of two no :"+c);
	}
}
