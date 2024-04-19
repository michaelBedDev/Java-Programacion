package ejercicioRowSet;

public class Employee {
	
	private int id;
	private String name;
	private String posicion;
	private double salary;

	public Employee() {
		super();
	}

	public Employee(int id, String name, String posicion, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.posicion = posicion;
		this.salary = salary;
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

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double d) {
		this.salary = d;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", posicion=" + posicion + ", salary=" + salary + "]";
	}
}
