package aug23;

public class Manager extends Employee{
	public Manager(String name,double salary,String department) {
		super(name,salary);
		this.department = department;
	}



	private String department;

	public Manager() {
		super();
	}

	
	
	public void showDetails() {
		super.showDetails();
		System.out.println("Department:"+department);
	}
}
