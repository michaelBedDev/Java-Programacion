package ejercicioParking;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;

import excepciones.AlreadyInParkingException;
import excepciones.NotInParkingException;
import excepciones.ParkingFullException;

public class Parking {

	private HashMap<String, Coche> mapaCoches;
	private static int contadorPlazas;
	private String direccion;
	private double importeFacturadoDia;
	private static final double facturacionHora = 1.50;
	private File entradasYSalidasLog;

	protected Parking() {
		super();
		mapaCoches = new HashMap<>();
		// TODO Auto-generated constructor stub
	}

	public boolean addVehiculoParking(char tipoCoche, String matricula, String color, String horaEntrada) {

		Coche cocheToAdd = tipoCoche == 'F' ? new Furgoneta(matricula,color) : new Coche(matricula,color);
		
		try {
			if (contadorPlazas >= 10) {
				throw new ParkingFullException("No se ha podido añadir, Parking completo");
			}
			if (mapaCoches.containsKey(cocheToAdd.getMatricula())) {
				throw new AlreadyInParkingException("No se ha podido añadir. El coche ya estaba dentro del parking");
			}

			mapaCoches.put(cocheToAdd.getMatricula(), cocheToAdd);
			cocheToAdd.addHuecosParking();

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(entradasYSalidasLog.getAbsoluteFile(), true))) {
				bw.write(cocheToAdd + ":" + horaEntrada);
			}

		} catch (Exception e) {
			e.getMessage();
			return false;
		}
		return true;
	}

	public void removeVehiculoParking(String matricula, String horaSalida) {

		try {
			if (!mapaCoches.containsKey(matricula)) {
				throw new NotInParkingException("No se ha podido eliminar el coche, no está en el parking");
			}
			Coche cocheToLeave = mapaCoches.get(matricula);
			mapaCoches.remove(matricula,cocheToLeave);
			cocheToLeave.removeHuecosParking();
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(entradasYSalidasLog.getAbsoluteFile(), true))) {
				bw.write(cocheToLeave + ":" + horaSalida);
			}
			
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void comprobarPlazasLibres() {
		System.out.printf("Hay actualmente %d plazas libres en el parking", 10-contadorPlazas);
	}
	
	
	
	
	
	
	
	
	
	//Getters & Setters
	public static int getContadorPlazas() {
		return contadorPlazas;
	}

	public static void setContadorPlazas(int contadorPlazas) {
		Parking.contadorPlazas = contadorPlazas;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getImporteFacturadoDia() {
		return importeFacturadoDia;
	}

	public void setImporteFacturadoDia(double importeFacturadoDia) {
		this.importeFacturadoDia = importeFacturadoDia;
	}

	public static double getFacturacionhora() {
		return facturacionHora;
	}

	public HashMap<String, Coche> getMapaCoches() {
		return mapaCoches;
	}

	public void setMapaCoches(HashMap<String, Coche> mapaCoches) {
		this.mapaCoches = mapaCoches;
	}

}
