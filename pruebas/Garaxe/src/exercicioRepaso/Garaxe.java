package exercicioRepaso;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class Garaxe {

	private List<Vehiculo> vehiculosAparcados = new ArrayList<>();
	private List<Vehiculo> vehiculosFora = new ArrayList<>();
	private List<Rexistro> listaRexistros = new ArrayList<>();
	private final double precioHora = 1.5;
	private double facturacionDiaria;

	public double getPrecioHora() {
		return precioHora;
	}

	public double getFacturacionDiaria() {
		return facturacionDiaria;
	}

	public void setFacturacionDiaria(double facturacionDiaria) {
		this.facturacionDiaria = facturacionDiaria;
	}

	public List<Vehiculo> getVehiculosAparcados() {
		return vehiculosAparcados;
	}

	public void setVehiculosAparcados(List<Vehiculo> vehiculosAparcados) {
		this.vehiculosAparcados = vehiculosAparcados;
	}

	// CREAR UN GRUPO DE VEHICULOS POR DEFECTO
	public void vehiculosDefecto() {
		LocalDate dia = LocalDate.now();
		LocalDateTime c1H = LocalDateTime.of(dia, LocalTime.of(12, 05));
		LocalDateTime c2H = LocalDateTime.of(dia, LocalTime.of(11, 30));
		LocalDateTime f1H = LocalDateTime.of(dia, LocalTime.of(8, 10));
		LocalDateTime f2H = LocalDateTime.of(dia, LocalTime.of(15, 50));
		
		Vehiculo c1 = new Coche("1234BBB", "Verde", c1H);
		Vehiculo c2 = new Coche("2345CCC", "Granate", c2H);
		Vehiculo f1 = new Furgoneta("3456DDD", "Negro", f1H);
		Vehiculo f2 = new Furgoneta("4567FFF", "Lila", f2H);

		vehiculosAparcados.add(c1);
		vehiculosAparcados.add(c2);
		vehiculosAparcados.add(f1);
		vehiculosAparcados.add(f2);
	}

	// OPCION 1 --> ENGADIR VEHICULOS
	public void engadirVehiculo(Vehiculo vehiculo) {
		vehiculosFora.add(vehiculo);
	}
	
	//COMPROBAR ANTES DE CREAR --> OPCION 1
	public boolean nonExiste(Vehiculo vehiculo) {
		for (int x = 0; x < vehiculosAparcados.size(); x++) {
			if (vehiculosAparcados.get(x).getMatricula().equals(vehiculo.getMatricula())) {
				System.out.println("Xa existe un vehículo con esa matrícula");
				return false;
			} 
		}
		for (int y = 0; y < vehiculosFora.size(); y++) {
			if(vehiculosFora.get(y).getMatricula().equals(vehiculo.getMatricula())) {
				System.out.println("Xa existe un vehículo con esa matrícula");
				return false;
			}
		}
		return true;
	}

	// OPCION 2 --> CONTADOR DE ESPAZO DISPOÑIBLE
	public int contarEspazo() {
		int contador = 0;
		Iterator<Vehiculo> it = vehiculosAparcados.iterator();
		while (it.hasNext()) {
			Vehiculo v = it.next();
			if (v.getClass().getSimpleName().equals("Coche")) {
				contador++;
			} else if (v.getClass().getSimpleName().equals("Furgoneta")) {
				contador = contador + 2;
			}
		}
		return contador;
	}
	
	//OPCION 2 --> GARDAR OS DATOS NO AL DE APARCADOS SE SE CUMPLEN TODAS AS CONDICIONS
	public void aparcarVehiculo(int contador, Vehiculo v)throws SenEspazoException {
		if (contador <= 9 && v.getClass().getSimpleName().equals("Coche")) {
			vehiculosAparcados.add(v);
			vehiculosFora.remove(v);
		} else if (contador <= 8 && v.getClass().getSimpleName().equals("Furgoneta")) {
			vehiculosAparcados.add(v);
			vehiculosFora.remove(v);
		} else {
			throw new SenEspazoException();
		}
	}

	// OPCION 2 --> SELECCIONAR UN COCHE
	public Vehiculo seleccionarVehiculo() {
		boolean haiVehiculo = false;
		do {
			System.out.println("Introduce a matrícula do vehículo que queres seleccionar");
			Scanner sc = new Scanner(System.in);
			String matriculaSeleccionada = sc.nextLine();
			for (int x = 0; x < vehiculosFora.size(); x++) {
				if (vehiculosFora.get(x).getMatricula().equals(matriculaSeleccionada)) {
					haiVehiculo = true;
					return vehiculosFora.get(x);
				}
			}
		} while (haiVehiculo);
		return null;
	}

	// OPCION 2 --> REXISTRAR HORA DE ENTRADA
	public String rexistrarEntrada(Vehiculo v) {
		String entrada;
		do {
			System.out.println("Introduce a hora de entrada en formato HH:MM ");
			Scanner sc = new Scanner(System.in);
			entrada = sc.nextLine();
		} while (!formatoHora(entrada));
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
		LocalDateTime hEntrada= LocalDateTime.of(LocalDate.now(), LocalTime.parse(entrada, dtf));
		v.setHoraEntrada(hEntrada);
		return entrada;
	}

	// OPCION 2 --> VALIDAR FORMATO HORA
	public boolean formatoHora(String entrada) {
		String[] horas = entrada.split(":");
		String hora = horas[0];
		String minuto = horas[1];
		int horaNumerico = Integer.parseInt(hora);
		int minutoNumerico = Integer.parseInt(minuto);
		if (horaNumerico < 0 && horaNumerico > 24) {
			return false;
		} else if (minutoNumerico < 0 && minutoNumerico > 60) {
			return false;
		} 
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
		LocalDateTime hEntrada= LocalDateTime.of(LocalDate.now(), LocalTime.parse(entrada, dtf));
		if (hEntrada.isAfter(LocalDateTime.now())) {
			System.out.println("A hora de entrada non pode ser posterior á hora actual");
			return false;
		}
		return true;
	}
	
	//OPCION 3-- > SELECCIONAR VEHICULO PARA SAIR
	public Vehiculo seleccionarVehiculoSaida() {
		boolean haiVehiculo = false;
		do {
			System.out.println("Introduce a matrícula do vehículo que queres seleccionar");
			Scanner sc = new Scanner(System.in);
			String matriculaSeleccionada = sc.nextLine();
			for (int x = 0; x < vehiculosAparcados.size(); x++) {
				if (vehiculosAparcados.get(x).getMatricula().equals(matriculaSeleccionada)) {
					haiVehiculo = true;
					return vehiculosAparcados.get(x);
				}
			}
		} while (haiVehiculo);
		return null;
	}

	// OPCION 3 --> MOSTRAR VEHICULOS CON HORA
	public int verVehiculosSaida() {
		int contador = 0;
		for (int x = 0; x < vehiculosAparcados.size(); x++) {
			if (vehiculosAparcados.get(x).getHoraEntrada() != null) {
				System.out.println(vehiculosAparcados.get(x).toString() + "\n" + "- ".repeat(25));
			} else {
				contador++;
			}
		}
		if (contador == vehiculosAparcados.size()) {
			System.out.println("Non hai vehículos estacionados para sair do garaxe");
		}
		return contador;
	}

	// OPCION 3 --> GARDAR HORA E DIA DE SAIDA
	public void rexistrarSaida(Vehiculo v) {
		LocalDateTime horaActual = LocalDateTime.now();
		int hora = horaActual.getHour();
		int minuto = horaActual.getMinute();
		System.out.println("Hora de saída " + hora + ":" + minuto);
		v.setHoraSaida(horaActual);
	}

	// OPCION 3 --> ELIMINAR DA LISTA DE VEHICULOS ALMACENADOS
	public void retirarVehiculo(Vehiculo v) {
		vehiculosAparcados.remove(v);
	}

	// OPCION 3 --> CALCULAR DEUDA
	public void ticket(Vehiculo v) {
		int totalHoras = (int)ChronoUnit.HOURS.between(v.getHoraEntrada(), v.getHoraSaida());
		double deuda = totalHoras * precioHora;
		v.setDeuda(deuda);
	}

	public void gardarRexistro(Vehiculo v) {
		Rexistro r = new Rexistro(v.getMatricula(), v.getHoraEntrada(), v.getHoraSaida(), v.getDeuda());
		listaRexistros.add(r);
	}
	

	// OPCION 4 --> PLAZAS DISPOÑIBLES
	public void contarPlazas() {
		int contador = contarEspazo();
		int dispoñibles = 10 - contador;
		if (contador == 10) {
			System.out.println("Non hai prazas dispoñibles");
		} else if (contador == 9) {
			System.out.println("So pode aparcar un vehículo tipo coche");
		} else {
			System.out.println("Hai " + dispoñibles + " prazas dispoñibles");
		}
	}

	// OPCION 3 E OPCION 5 --> VER VEHICULOS APARCADOS
	public void verVehiculosAparcados() {
		System.out.println("Vehiculos aparcados");
		//usar for each
		Iterator<Vehiculo> it = vehiculosAparcados.iterator();
		while (it.hasNext()) {
			Vehiculo v = it.next();
			System.out.println(v.toStringHoraEntrada() + "\nTipo de vehículo: " + v.getClass().getSimpleName() + "\n" + "_".repeat(50));
		}
	}
	
	//OPCION 2 --> VER OS COCHES QUE SE PODEN APARCAR
	public boolean verVehiculos() {
		if (vehiculosFora.isEmpty()) {
			System.out.println("Non hai vehículos dispoñibles para entrar");
			return false;
		} else {
			System.out.println("Vehiculos dispoñibles para a entrada\n");
			Iterator<Vehiculo> it = vehiculosFora.iterator();
			while (it.hasNext()) {
				Vehiculo v = it.next();
				System.out.println(v.toString() + "\n" + "- ".repeat(25));
			}
		}
		return true;
	}
	

	// FORA MENU --> CREA OS DIRECTORIOS 
	public void crearDirectorios() {
		String directorio = "./src/exercicioRepaso/Arquivos";
		String carpetaHistorico = "./src/exercicioRepaso/Arquivos/Historico";
		String carpetaFacturacion = "./src/exercicioRepaso/Arquivos/Facturacion";

		boolean creacionD = (new File(directorio)).mkdir();
		boolean creacionH = (new File(carpetaHistorico)).mkdir();
		boolean creacionF = (new File(carpetaFacturacion)).mkdir();

		if (creacionD) {
			System.out.println("Directorio creado en " + directorio);
		} else {
			System.out.println("O directorio que contén a carpeta \"Historico\" e \"Facturación\" xa existe");
		}
		if (creacionH) {
			System.out.println("Directorio creado en " + carpetaHistorico);
		} else {
			System.out.println("A carpeta \"Historico\" xa existe");
		}
		if (creacionF) {
			System.out.println("Directorio creado en " + carpetaFacturacion);
		} else {
			System.out.println("A carpeta \"Facturación\" xa existe");
		}
	}

	// OPCION 6 --> CREA OS FICHEIROS E COPIA OS DATOS
	public void crearFicheiros() throws IOException {
		File historico = new File("./src/exercicioRepaso/Arquivos/Historico/Historico.txt");
		try (BufferedWriter escribirHistorico = new BufferedWriter(new FileWriter(historico))) {
			for (int x = 0; x < listaRexistros.size(); x++) {
				String texto = listaRexistros.get(x).toStringHistorico();
				escribirHistorico.write(texto);
				escribirHistorico.newLine();
			}
		}

		LocalDate dia = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd_MM_yyyy");
		File facturacion = new File("./src/exercicioRepaso/Arquivos/Facturacion/Facturación_" + dia.format(dtf) + ".txt");
		try (BufferedWriter escribirFacturacion = new BufferedWriter(new FileWriter(facturacion))) {
			Map<String, List<Rexistro>> mapaMatriculas = obterDatosFacturacion(); //metodo que devolve un mapa
			Set<String> matriculas = mapaMatriculas.keySet(); //conxunto de matriculas
			Iterator<String> it = matriculas.iterator(); //recorre o set de matriculas
			while(it.hasNext()) {
				String matricula = it.next();
				mapaMatriculas.get(matricula); //array list dos valores do mapa
				double deudaTotal = 0;
				for (int y = 0; y < mapaMatriculas.get(matricula).size(); y++) {
					deudaTotal = deudaTotal + mapaMatriculas.get(matricula).get(y).getDeuda();
					String textoF = mapaMatriculas.get(matricula).get(y).toStringFacturacion();
					escribirFacturacion.write(textoF);
					escribirFacturacion.newLine();
				}
			String textoTD = "Pago total " + deudaTotal;
			escribirFacturacion.write(textoTD);
			escribirFacturacion.newLine();
			}
		}
	}

	
	//OPCION 6 -- > OBTER DATOS PARA CALCULAR DEUDA
	public Map<String, List<Rexistro>> obterDatosFacturacion() {
		List<Rexistro> rexistrosDiarios = new ArrayList<>();
		for(int x = 0; x < listaRexistros.size(); x++) {
			if (listaRexistros.get(x).getHoraSaida().toLocalDate().equals(LocalDate.now())) {
				rexistrosDiarios.add(listaRexistros.get(x)); //Crea unha lista cos rexistros do día
			}
		}
		Map<String, List<Rexistro>> mapaMatriculas = new TreeMap<>(); //crea un mapa para almacenar matriculas e rexistros diarios
		for(int y = 0;  y < rexistrosDiarios.size(); y++) {
			if(!mapaMatriculas.containsKey(rexistrosDiarios.get(y).getMatricula())){ //se non existe
				List<Rexistro> matricula = new ArrayList<>(); //crea unha nova lista 
				matricula.add(rexistrosDiarios.get(y)); //engade á lista o rexistro da lista diaria
				mapaMatriculas.put(rexistrosDiarios.get(y).getMatricula(), matricula); //engade a clave e valor ao mapa
			}else {
				mapaMatriculas.get(rexistrosDiarios.get(y).getMatricula()).add(rexistrosDiarios.get(y)); //engade a lista ao mapa
			}
		}
		return mapaMatriculas;
	}
	
	//OPCION 7 --> LER FICHEIROS
	public void lerFicheiros() throws FileNotFoundException, IOException {
		File historico = new File("./src/exercicioRepaso/Arquivos/Historico/Historico.txt");
		try(BufferedReader lerHistorico = new BufferedReader(new FileReader(historico))){
			String linha = lerHistorico.readLine();
			while(linha != null) {
				System.out.println(linha);
				linha = lerHistorico.readLine();
			}
		}
		LocalDate dia = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd_MM_yyyy");
		System.out.println();
		File facturacion = new File("./src/exercicioRepaso/Arquivos/Facturacion/Facturación_" + dia.format(dtf) + ".txt");
		try (BufferedReader lerFacturacion = new BufferedReader(new FileReader(facturacion))){
			String linhaF = lerFacturacion.readLine();
			while(linhaF != null) {
				System.out.println(linhaF);
				linhaF = lerFacturacion.readLine();
			}
		}
	}
	
	
	

}
