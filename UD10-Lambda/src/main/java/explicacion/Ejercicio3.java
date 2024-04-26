package explicacion;

import java.util.function.Supplier;

class Student {
    private int id;
    private String name;
    private String gender;
    private int age;
    
    
	public Student(int id, String name, String gender, int age) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
}

public class Ejercicio3 {

	public static void main(String[] args) {
		Supplier<Student> studentSupplier = () -> new Student(1,"Miguel","m",23);
		
		System.out.println(studentSupplier.get());
	}
}
