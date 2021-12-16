import java.io.Serializable;

public class Gaurav implements Serializable{
	
	
	private int id;
	private String name;
	private String salarly;
	public Gaurav() {
	}
	
	public Gaurav(int id, String name, String salarly) {
		this.id = id;
		this.name = name;
		this.salarly = salarly;
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

	public String getSalarly() {
		return salarly;
	}

	public void setSalarly(String salarly) {
		this.salarly = salarly;
	}

	@Override
	public String toString() {
		return "Gaurav [id=" + id + ", name=" + name + ", salarly=" + salarly + "]";
	}
	
	
	
	
	
	

}
