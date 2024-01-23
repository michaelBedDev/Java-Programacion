package herencia;

public class Fauna {
    public static void main(String[] args) {

        Animal animal = new Animal();
        System.out.println(animal);
        animal.setNombre("Dude");
        animal.setEdad(3);
        System.out.println(animal);
        Gato yin = new Gato();
        yin.setEdad(2);
        yin.setNombre("YinYang");
        System.out.println(yin);
        System.out.println(yin.habla());

        Perro blob = new Perro();
        blob.setEdad(5);
        blob.setNombre("Blob");
        System.out.println(blob);
        System.out.println(blob.habla());
    }
}
