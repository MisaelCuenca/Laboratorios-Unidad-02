package AbstractLibro;

import java.util.Set;

public class Libro extends Publicacion  {

	String editorial;
     Set<String> palabrasDestacadas;

    public Libro(String doi, String titulo, DTFecha fecha, String editorial, Set<String> palabrasDestacadas) {
        super(doi, titulo, fecha);
        this.editorial = editorial;
        this.palabrasDestacadas = palabrasDestacadas;
    }

    public boolean contienePalabra(String palabra) {
        return palabrasDestacadas.contains(palabra.toLowerCase());
    }
}
