package My_Proyect_Carro;

public class Chasis {
  private  tipoChasis tipo;

public Chasis(tipoChasis tipo) {
	
	this.tipo = tipo;
}

@Override
public String toString() {
	return "Chasis [tipo=" + tipo + "]";
}
   
   
}
