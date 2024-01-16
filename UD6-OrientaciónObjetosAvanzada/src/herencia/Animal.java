package herencia;

public class Animal {

    private int edad;
    private String nombre;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Animal () {
        System.out.println("Constructor de Animal");
    }

    public Animal (String nombre, int edad) {
        System.out.println("Constructor de Animal");
        this.setEdad(edad);
        this.setNombre(nombre);
    }
}





