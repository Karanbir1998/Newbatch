package Package1;
public class Student {

	int age;
	int rollno;
	
	public void Display1() {
		System.out.println("Welcome to all of you");
	}
	
	public void Display2() {
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args) {
		
		Student s=new Student();
		s.Display1();
		s.Display2();
		
		s.age=26;
		s.rollno=4;
		
		System.out.println("My age is: "+s.age);
		System.out.println("My rollno is: "+s.rollno);
		
	}
}
