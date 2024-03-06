package practice;

public class Student1 {

	int id;
	String name;
	Student1()
	{
		System.out.println("default constructor");
	}
	Student1(int id,String name)
	{
		this();
		this.id=id;
		this.name=name;
	}
	void display()
	{
		show();
		System.out.println(id+"  "+name);
	}
	void show()
	{
		System.out.println("show method demo");
	}
		
	public static void main(String[] args) {
	
		Student1 s1=new Student1(111,"sharan");
		s1.display();
		
	}

}
