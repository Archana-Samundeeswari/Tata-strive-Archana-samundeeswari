package aug21;

public class Student {
	private int id;
	private static int  nextid=0;
	private String name;
	private static String centre;
	private static String country;
	
	
	{
		nextid++;
	}
	
	//static
	static {
		centre="TATA STRIVE";
		country="INDIA";
	}

	//No argument constructor
	public Student() {
		
	}

	//Parameterized constructor
	public Student(String name) {
		this.id = nextid;
		this.name = name;
	}

	//Getter and setter methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getCentre() {
		return centre;
	}

	public static void setCentre(String centre) {
		Student.centre = centre;
	}

	public static String getCountry() {
		return country;
	}

	public static void setCountry(String country) {
		Student.country = country;
	}
	

	@Override
	public String toString() {
		return "ID:" +id+"\nName:"+name+"\nCentre:"+centre + "\nCountry:"+country ;
	}
	
	
	
	
	
	
	
}
