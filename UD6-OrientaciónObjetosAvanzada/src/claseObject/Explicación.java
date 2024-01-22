package claseObject;

public class Explicación {

//	public static void main(String[] args) {
//		Explicación a = new Explicación();
//		System.out.println(a.hashCode());
//	}
	
	
	public static void main(String[] args) {
		Student alex1 = new Student(1, "Alex");
		Student alex2 = new Student(1, "Alex");

		//Student alex2 = alex1;
		
		System.out.println("alex1 hashcode = " + alex1.hashCode());
		System.out.println("alex2 hashcode = " + alex2.hashCode());
		System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));
		System.out.println((alex1 == alex2 ? "True" : "False"));
	}

}

	class Student {

		private int id;
		private String name;
	
		public Student(int id, String name) {
			this.name = name;
			this.id = id;
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
		
		
		@Override
		public boolean equals(Object obj) {
		    if (obj == null) return false;
		    if (!(obj instanceof Student))
		        return false;
		    if (obj == this)
		        return true;
		    return this.getId() == ((Student) obj).getId();
		    
		    
		    //al añadir este método compara con id por eso al sobreescribir equals devuelve true
		    //está comparando el id de los estudiantes (1)
		}
	}
