
public class Employee {
	private int id;
	private String name;
	private double salarly;
	private int age;
	private String gender;
	private int experience;
	private String city;

	private Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salarly, int age, String gender, int experience, String city) {
		this.id = id;
		this.name = name;
		this.salarly = salarly;
		this.age = age;
		this.gender = gender;
		this.experience = experience;
		this.city = city;
	}

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

	public double getSalarly() {
		return salarly;
	}

	public void setSalarly(double salarly) {
		this.salarly = salarly;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salarly=" + salarly + ", age=" + age + ", gender=" + gender
				+ ", experience=" + experience + ", city=" + city + "]";
	}

}
