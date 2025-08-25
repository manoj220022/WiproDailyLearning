package Inheritence_example;



class Device {
    void powerOn() {
        System.out.println("device is ON");
    }
}

class Mobile extends Device {
    void unlock() {
        System.out.println("mobile unlocked");
    }
}

class Tab extends Device {
    void rotateScreen() {
        System.out.println("tablet screen rotated");
    }
}
public class LSP {

	public static void main(String[] args) {
		Device mobile = new Mobile();  
        mobile.powerOn();

        Device tablet = new Tab();  
        tablet.powerOn();
	}

}
