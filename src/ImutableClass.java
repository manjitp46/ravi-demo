
public class ImutableClass {

	public static void main(String[] args) {
		Student s = new Student(5,"manjit");

		Student s1=s.updateId(8);
		System.out.println(s);
		System.out.println(s1.updateId(14));
		String string = "manjit"+"ashish";
		String mystring = "manjit";
		mystring = "manjit";
	
	}
	
	
	
	

}
final class Student{
	
	private int id;
	private String name;
	public Student(int id,String name) {
		this.id = id;
		this.name = name;	
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public Student updateId(int id) {
		return (this.id==id)?this:new Student(id, this.name);	
	}
	public Student updateName(String name) {
		return (this.name.equals(name))?this:new Student(this.id, name);
	}
	
	
}
