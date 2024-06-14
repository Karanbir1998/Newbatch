package Package1;

public class Method2 {

	public int sum(int a, int b) {
		int c=a+b;
		return c;
	}
	public int sub(int a, int b) {
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
		
		Method2 m2=new Method2();
		int mulresult=m2.multi(10, 2);
		int subresult=m2.sub(mulresult, 2);
		int sumresult=m2.sum(subresult, 2);
		int subresult2=m2.sub(sumresult, 2);
		int finalresult=m2.divide(subresult2, 2);
		
		
		System.out.println("Final result of equation (((((10*2)-2)+2)-2)/2) is: "+ finalresult);
	}	
}
