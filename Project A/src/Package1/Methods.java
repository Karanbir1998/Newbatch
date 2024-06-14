package Package1;

public class Methods {

	public int sum(int a, int b) {
		int c= a + b;
		return c;
	}
	public int sub (int a, int b) {
		int c=a-b;
		return c;
	}
	public int multi(int a, int b) {
		int c=a*b;
		return c;
	}
	public int divide(int a, int b) {
		int c=a/b;
		return c;
	}
	
	public static void main(String[] args) {
		
		Methods m1=new Methods();
		int result1=m1.sum(10, 2);
		int result2=m1.sum(result1, 2);
		int result3=m1.sub(result2, 2);
		int result4=m1.multi(result3, 2);
		int result5=m1.divide(result4, 2);
		
		System.out.println("Final output of equation (((((10+2)+2)-2)*2)/2)is: "+ result5);
	}
	
}
