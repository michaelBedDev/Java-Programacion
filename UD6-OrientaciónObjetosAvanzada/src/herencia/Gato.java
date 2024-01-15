package herencia;

public class Gato extends Animal{

    String habla() {
        return "miauu!";
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Gato:" + this.getNombre() + ":" + this.getEdad();
    }

    public Gato () {
        System.out.println("Constructor de Gato");
    }

    public Gato (String nombre, int edad) {
        super(nombre, edad);
        System.out.println("Constructor de Gato");
    }
}