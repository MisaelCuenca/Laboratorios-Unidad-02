package My_proyect.My_proyect_M;

public abstract class MobilePhone {
	 String brand;
	    String model;

	    public MobilePhone(String brand, String model) {
	        this.brand = brand;
	        this.model = model;
	    }

	    abstract void makeCall(String number);

	    void powerOn() {
	        System.out.println("Encendiendo " + brand + " " + model);
	    }
}
