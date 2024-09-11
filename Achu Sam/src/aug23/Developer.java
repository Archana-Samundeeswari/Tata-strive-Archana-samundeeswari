package aug23;

public class Developer extends Employee {
	private String programmingLanguage;

	public Developer() {
		super();
	}

	public Developer(String name,double salary ,String programmingLanguage) {
		super(name,salary);
		this.programmingLanguage = programmingLanguage;
	}
	
	public void showDetails() {
		super.showDetails();
		System.out.println("Programmming Language:"+programmingLanguage);
	}
}
