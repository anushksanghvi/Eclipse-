package MyCalcPag;
import java.util.*;

public class MainCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1= ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2= ");
		int num2 = sc.nextInt();
		
		Calculator Cal = new Calculator();
		int A = Cal.addition(num1, num2);
		System.out.println("Sum is = " + A);
		
		int B = Cal.subtraction(num1, num2);
		System.out.println("Difference is = " + B);
		
		int C = Cal.multiplication(num1, num2);
		System.out.println("Multiplication is = " + C);
		
		int D = Cal.division(num1, num2);
		System.out.println("Division is = " + D);
		

	}
}
