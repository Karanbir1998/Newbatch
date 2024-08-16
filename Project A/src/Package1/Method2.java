package Package1;

public class Method2 {

	public int divide(int a, int b) {
		int c=a/b;
		return c;
	}
	public int subtract(int a2, int b2) {
		int c2=a2-b2;
		return c2;
	}
	public int multi(int a3, int b3) {
		int c3=a3*b3;
		return c3;
	}
	public int sum(int a4, int b4) {
		int c4=a4+b4;
		return c4;
	}
	
	public static void main(String[] args) {
		
		Method2 m=new Method2();
		
		int resultdiv=m.divide(10, 2);
		int resultsub=m.subtract(resultdiv, 2);
		int resultmul=m.multi(resultsub, 2);
		int resultsub2=m.subtract(resultmul, 2);
		int finalresult=m.sum(resultsub2, 2);
		
		System.out.println("Final result of Equation (((((10/2)-2)*2)-2)+2) is:" +finalresult);
		
	}
	
}
