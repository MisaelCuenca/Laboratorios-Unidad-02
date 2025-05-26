package AbstractLibro;

import java.util.HashSet;
import java.util.Set;

public abstract class Publicacion {
    String doi;
    String titulo;
    DTFecha fecha;
    Set<Investigador> autores;
    
	public Publicacion(String doi, String titulo, DTFecha fecha) {
		super();
		this.doi = doi;
		this.titulo = titulo;
		this.fecha = fecha;
		this.autores = new HashSet<>();
	}
	
	 public void agregarAutor(Investigador investigador) {
	        autores.add(investigador);
	    }


	public String getDoi() {
		return doi;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public DTFecha getFeha() {
		return fecha;
	}

	public void setFeha(DTFecha feha) {
		this.fecha = feha;
	}

	
	 public DTRefer getDT() {
	        Set<String> nombres = new HashSet<>();
	        for (Investigador autor : autores) {
	            nombres.add(autor.getNombre());
	        }
	        return new DTRefer(doi, titulo, fecha, nombres);
	    }

	    public abstract boolean contienePalabra(String palabra);
	    
	    
	    
	   
	}

    
	
    
