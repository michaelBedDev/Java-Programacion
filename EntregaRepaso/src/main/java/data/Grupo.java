package data;

import java.util.ArrayList;

public class Grupo {

	private ArrayList<Contacto> contactos;
	private String id;

	public Grupo() {
		super();
		this.contactos = new ArrayList<Contacto>();
		generateID();
	}

	public Grupo(ArrayList<Contacto> contactos, String identificador) {
		super();
		this.contactos = contactos;
		generateID();
	}

	private void generateID() {
		this.setId("G" + (int) (Math.random() * 1000));
	}
	
	
	

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	@Override
	public String toString() {
		return "Grupo [id=" + id + ", contactos=" + contactos + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
