package Package1;
public class Student {

	int age;
	int rollno;
	
	public void Display1(){
		System.out.println("Welcome to all of you");
	}
	
	public void Display2(){
		System.out.println("Automation is very easy");
	}

	public static void main(String[] args) {
		
		Student s1=new Student();
		
		s1.Display1();
		s1.Display2();
		
		s1.age=26;
		s1.rollno=4;
		System.out.println("Value of age is: "+s1.age);
		System.out.println("Value of rollno is: "+s1.rollno);		
	}

}
