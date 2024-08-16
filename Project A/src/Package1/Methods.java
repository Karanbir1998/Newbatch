package Package1;

public class Methods {

	public int sum(int a, int b) {
	
		int c=a+b;
		return c;
	}
	public int multi(int a1, int b1) {
		int c1=a1*b1;
		return c1;
	}
	public int sub(int a2, int b2) {
		int c2=a2-b2;
		return c2;
	}	
	public int divide(int a3,int b3) {
		int c3=a3/b3;
		return c3;
	}
	
	public static void main(String[] args) {
	
		Methods m=new Methods();
		int resultsum=m.sum(10, 2);
		int resultmul=m.multi(resultsum, 2);
		int resultsub=m.sub(resultmul, 2);
		int resultmul2=m.multi(resultsub, 2);
		int finalresult=m.divide(resultmul2, 2);
		
		System.out.println("Final result of Equation (((((10+2)*2)-2)*2)/2) is: " +finalresult);
	}
	
}
