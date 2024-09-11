package aug23;

public class Employee {
	private String name;
	private int id;
	private static int nextID=0;
	private double salary;
	
	{
		id=nextID++;
	}
	public Employee() {
		super();
	}

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.id = nextID;
		this.salary = salary;
	}
	
	public void showDetails() {
		System.out.println("Manager Details \n---------------------");
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
		System.out.println("Salary:"+salary);
		}
	
}
