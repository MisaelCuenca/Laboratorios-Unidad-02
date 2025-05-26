package AbstractLibro;

public class PaginaWeb extends Publicacion {
	   String url;
	    String contenidoExtraido;

	    public PaginaWeb(String doi, String titulo, DTFecha fecha, String url, String contenidoExtraido) {
	        super(doi, titulo, fecha);
	        this.url = url;
	        this.contenidoExtraido = contenidoExtraido;
	    }

	    public boolean contienePalabra(String palabra) {
	        return contenidoExtraido.toLowerCase().contains(palabra.toLowerCase());
	    }
}
