package Proyect.JavaFX;

import javafx.beans.property.*;

public class Producto {
	private final StringProperty codigo;
	private final StringProperty nombre;
	private final DoubleProperty precio;
	private final IntegerProperty stock;

	public Producto(String codigo, String nombre, double precio, int stock) {
		this.codigo = new SimpleStringProperty(codigo);
		this.nombre = new SimpleStringProperty(nombre);
		this.precio = new SimpleDoubleProperty(precio);
		this.stock = new SimpleIntegerProperty(stock);
	}

	public String getCodigo() {
		return codigo.get();
	}

	public void setCodigo(String value) {
		codigo.set(value);
	}

	public StringProperty codigoProperty() {
		return codigo;
	}

	public String getNombre() {
		return nombre.get();
	}

	public void setNombre(String value) {
		nombre.set(value);
	}

	public StringProperty nombreProperty() {
		return nombre;
	}

	public double getPrecio() {
		return precio.get();
	}

	public void setPrecio(double value) {
		precio.set(value);
	}

	public DoubleProperty precioProperty() {
		return precio;
	}

	public int getStock() {
		return stock.get();
	}

	public void setStock(int value) {
		stock.set(value);
	}

	public IntegerProperty stockProperty() {
		return stock;
	}
}