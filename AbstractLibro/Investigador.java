package AbstractLibro;

import java.util.HashSet;
import java.util.Set;

public class Investigador {
       String orcid;
       String nombre;
       String institucion;
       Set<Publicacion> publicaciones;
       
       
	public Investigador(String orcid, String nombre, String institucion) {
		super();
		this.orcid = orcid;
		this.nombre = nombre;
		this.institucion = institucion;
		this.publicaciones = new HashSet<>() ;
	}


	public String getOrcid() {
		return orcid;
	}


	public void setOrcid(String orcid) {
		this.orcid = orcid;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getInstitucion() {
		return institucion;
	}


	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}


	public Set<Publicacion> getPublicaciones() {
		return publicaciones;
	}


	public void setPublicaciones(Set<Publicacion> publicaciones) {
		this.publicaciones = publicaciones;
	}
	 public void agregarPublicacion(Publicacion p) {
	        publicaciones.add(p);
	        p.agregarAutor(this);
	    }

	    @Override
	    public String toString() {
	        return  " ORCID: "+orcid + ", Titulo: " + nombre + ", Institucion: " + institucion;
	    }

	    public Set<String> listarPublicaciones(DTFecha desde, String palabra) {
	        Set<String> resultado = new HashSet<>();
	        for (Publicacion p : publicaciones) {
	            if (p.getFeha().esPosterior(desde) && p.contienePalabra(palabra)) {
	                resultado.add(p.getDoi());
	            }
	        }
	        return resultado;
	    } 
       
}
