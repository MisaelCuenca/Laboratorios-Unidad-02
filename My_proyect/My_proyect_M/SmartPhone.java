package My_proyect.My_proyect_M;

public class SmartPhone extends MobilePhone {
	public SmartPhone(String brand, String model) {
        super(brand, model);
    }

    void browseInternet() {
        System.out.println("Navegando en internet desde " + model);
    }

    @Override
    void makeCall(String number) {
        System.out.println("Llamando a " + number + " desde smartphone...");
    }
}
