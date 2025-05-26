package AbstractLibro;

public class ArticulosRevista extends Publicacion {

	String revista;
	String extracto;
	public ArticulosRevista(String doi, String titulo, DTFecha fecha, String revista, String extracto) {
		super(doi, titulo, fecha);
		this.revista = revista;
		this.extracto = extracto;
	}
	public String getRevista() {
		return revista;
	}
	public void setRevista(String revista) {
		this.revista = revista;
	}
	public String getExtracto() {
		return extracto;
	}
	public void setExtracto(String extracto) {
		this.extracto = extracto;
	}

	public boolean contienePalabra(String palabra) {
        return extracto.toLowerCase().contains(palabra.toLowerCase());
    }
	@Override
	public String toString() {
		return "ArticulosRevista [revista=" + revista + ", extracto=" + extracto + "]";
	}
	
	
	
}
