package My_Proyect_Carro;

public class Carroceria {
    private String color;
    private  TipoCarroceria tipo;
public Carroceria(String color, TipoCarroceria tipo) {
	
	this.color = color;
	this.tipo = tipo;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public TipoCarroceria getTipo() {
	return tipo;
}
public void setTipo(TipoCarroceria tipo) {
	this.tipo = tipo;
}
@Override
public String toString() {
	return "Carroceria [color=" + color + ", tipo=" + tipo + "]";
}


   
   
}
