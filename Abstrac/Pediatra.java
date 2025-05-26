package Abstrac;

public class Pediatra extends Medico {
	 private TipoPediatra tipologia;

	    public Pediatra(String nombre, TipoPediatra tipologia) {
	        super(nombre);
	        this.tipologia = tipologia;
	    }

	    public TipoPediatra getTipologia() {
	        return tipologia;
	    }

	    public void setTipologia(TipoPediatra tipologia) {
	        this.tipologia = tipologia;
	    }
}
