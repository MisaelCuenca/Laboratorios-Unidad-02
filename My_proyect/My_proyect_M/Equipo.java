package My_proyect.My_proyect_M;

import java.util.ArrayList;

public class Equipo {
	private String nombre;
    private String pais;
    private ArrayList<Ciclista> ciclistas = new ArrayList<>();

 


    public Equipo(String nombre, String pais) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		
	}
    



	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getPais() {
		return pais;
	}




	public void setPais(String pais) {
		this.pais = pais;
	}




	public void imprimirEquipo() {
        System.out.println("Equipo: " + nombre + "\nPaís: " + pais);
    }

    public void añadirCiclista(Ciclista c) {
        ciclistas.add(c);
    }

    public int calcularTiempoTotal() {
        int total = 0;
        for (Ciclista c : ciclistas) {
            total += c.getTiempoAcumulado();
        }
        return total;
    }

    public void listarCiclistas() {
        for (Ciclista c : ciclistas) {
            System.out.println(c.getNombre());
        }
    }
    // contrareloj
    
    

    public void buscarCiclistaPorId(int id) {
        for (Ciclista c : ciclistas) {
            if (c.getIdentificador() == id) {
               
                System.out.println(c.imprimirTipo());
                System.out.println(c.toString());
                return;
            }
            
        }
        System.out.println("Ciclista no encontrado");
    }
}
