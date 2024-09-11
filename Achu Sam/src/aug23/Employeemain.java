package aug23;

public class Employeemain {
	public static void main(String[] args) {
		Employee emp=new Manager("Achu",50000,"HR");
		emp.showDetails();
		Employee dev=new Developer("Sam",80000,"JAVA");
		dev.showDetails();
	}
}
