package practice;

public class Student {

	String name;
	int id;
	static String college="ITs";
	
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	void display()
	{
	System.out.println(id+" "+name+"  "+college);	
	}
	
	public static void main(String[] args) {
		
      Student s=new Student(111,"Kiran");
      s.display();
	}

}
