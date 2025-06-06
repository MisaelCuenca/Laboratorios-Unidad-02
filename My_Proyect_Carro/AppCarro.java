package My_Proyect_Carro;

public class AppCarro {

	   public static void main(String[] args) {

		 
	        Motor motor = new Motor(2000);
	        Carroceria carroceria = new Carroceria("Negro", TipoCarroceria.AUTOPARTE);
	        Llanta llanta = new Llanta("Chillene", 17, 55, 205);
	        Chasis chasis = new Chasis(tipoChasis.MONOCASO);

	     
	        Carro carro = new Carro(motor, carroceria, llanta, chasis);

	        
	        carro.imprimir();
	    }
	   }

