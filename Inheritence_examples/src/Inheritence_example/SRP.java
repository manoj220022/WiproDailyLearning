package Inheritence_example;


class Phone {
    String brand = "Samsung";

    void makeCall() {
        System.out.println(brand + " is making a call");
    }
}

class PhoneDetails {
    void printDetails(Phone phone) {
        System.out.println("Phone brand: " + phone.brand);
    }
}

public class SRP {

	public static void main(String[] args) {
		 Phone phone = new Phone();
	        phone.makeCall();

	        PhoneDetails printer = new PhoneDetails();
	        printer.printDetails(phone);
	}

}
