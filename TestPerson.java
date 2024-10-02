package Assignment6;
class Person
{
	final String Name ="VAISHNAVI";
	final int age=21;
	
	public String getName() {
		return Name;
	}
	public int getAge() {
		return age;
	}
	
	
}
public class TestPerson {
	public static void main(String[] args) {
		Person person =new Person();
		System.out.println("Name Of Person:- "+person.Name);
		System.out.println("Age Of Person:- "+person.age);
	}

}
