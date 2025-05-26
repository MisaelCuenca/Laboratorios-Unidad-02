package AbstractLibro;

import java.util.Set;

public class DTRefer {
   String DOI;
   String titulo;
  DTFecha fecha;
  Set<String> autores;
public DTRefer(String dOI, String titulo, DTFecha fecha, Set<String> autores) {
	super();
	DOI = dOI;
	this.titulo = titulo;
	this.fecha = fecha;
	this.autores = autores;
}
public String getDOI() {
	return DOI;
}
public void setDOI(String dOI) {
	DOI = dOI;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public DTFecha getFecha() {
	return fecha;
}
public void setFecha(DTFecha fecha) {
	this.fecha = fecha;
}
public Set<String> getAutores() {
	return autores;
}
public void setAutores(Set<String> autores) {
	this.autores = autores;
}
@Override
public String toString() {
	return "Datos referencias [DOI=" + DOI + ", titulo=" + titulo + ", fecha=" + fecha + ", autores=" + autores + "]";
}
  
  
  
}
