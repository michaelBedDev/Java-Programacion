package ejercicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Empresa {

	private File proveedores;
	private File productos;
	
	
	public void addProducto(Producto newP) throws Exception {
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(productos.getAbsoluteFile(), true))) {
			bw.write(newP.toString());
		}
	}
	

	public void imprimirProveedores() {
		try (BufferedReader bw = new BufferedReader(new FileReader(productos))){
			String linea = bw.readLine();
			while(linea!=null) {
				System.out.println(linea);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void imprimirProductos() {
		try (BufferedReader bw = new BufferedReader(new FileReader(proveedores))){
			String linea = bw.readLine();
			while(linea!=null) {
				System.out.println(linea);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public boolean asignarProveedor(String codProd, String codProv) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public Proveedor getProveedorByCod(String codProv) {
		// TODO Auto-generated method stub
		return null;
	}

	public void facturacion(String codProv) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	//guardar cambios en los ficheros

}
