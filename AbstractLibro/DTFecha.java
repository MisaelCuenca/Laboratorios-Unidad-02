package AbstractLibro;

public class  DTFecha {
     int dia;
     int mes;
     int anio;
     
     
	public DTFecha(int dia, int mes, int anio) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	
	
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}

	public boolean esPosterior(DTFecha otra) {
        if (this.anio > otra.anio) return true;
        if (this.anio == otra.anio && this.mes > otra.mes) return true;
        if (this.anio == otra.anio && this.mes == otra.mes && this.dia > otra.dia) return true;
        return false;
    }
	 @Override
	    public String toString() {
	        return dia + "/" + mes + "/" + anio;
	    }

     
	
     
	
}
