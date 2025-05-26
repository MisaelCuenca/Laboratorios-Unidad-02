package My_proyect.My_proyect_M;

public class Iphone extends SmartPhone  {
	
    public Iphone(String model) {
        super("Apple", model);
    }

    void useFaceID() {
        System.out.println("Usando Face ID en " + model);
    }

    @Override
    void makeCall(String number) {
        System.out.println("Llamando a " + number + " desde un iPhone.");
    }
}
