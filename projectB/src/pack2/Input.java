package pack2;

import java.util.Scanner;
import Package1.Methods;
import Package1.Student;

public class Input {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Methods m=new Methods();
	
		System.out.println("Need to solve the equation: (((((x1*x2)+x3)-x4)-x5)/x6)");
		
		System.out.println("Enter value of x1");
		int x1=sc.nextInt();
		System.out.println("Enter value of X2");
		int x2=sc.nextInt();
		System.out.println("Enter value of x3");
		int x3=sc.nextInt();
		System.out.println("Enter value of x4");
		int x4=sc.nextInt();
		System.out.println("Enter value of x5");
		int x5=sc.nextInt();
		System.out.println("Enter value of x6");
		int x6=sc.nextInt();
		
		
		System.out.println("Value of x1:"+x1 +", x2:"+x2+", x3:"+x3+", x4:"+x4+", x5:"+x5+",x6:"+x6);
		int result1=m.multi(x1, x2);
		int result2=m.sum(result1, x3);
		int result3=m.sub(result2, x4);
		int result4=m.sub(result3, x5);
		int result5=m.divide(result4, x6);
		System.out.println("Equation result is: "+result5);
		
	}
}
