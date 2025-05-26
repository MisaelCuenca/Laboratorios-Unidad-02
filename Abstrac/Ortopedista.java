package Abstrac;

public class Ortopedista extends Medico {
	
	private TipoOrtopedista tipologia;

    public Ortopedista(String nombre, TipoOrtopedista tipologia) {
        super(nombre);
        this.tipologia = tipologia;
    }

    public TipoOrtopedista getTipologia() {
        return tipologia;
    }

    public void setTipologia(TipoOrtopedista tipologia) {
        this.tipologia = tipologia;
    }
	

}
