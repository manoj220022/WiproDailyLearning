package Inheritence_example;


interface CallFunction {
    void makeCall();
}

interface CameraFunction {
    void takePhoto();
}

class Smallphone implements CallFunction {
    public void makeCall() {
        System.out.println("calling from small phone");
    }
}

class Smartphone implements CallFunction, CameraFunction {
    public void makeCall() {
        System.out.println("calling from smartphone");
    }

    public void takePhoto() {
        System.out.println("Taking photo with smartphone");
    }
}

public class ISP {

	public static void main(String[] args) {
		 Smallphone small = new Smallphone();
	        small.makeCall();

	        Smartphone smart = new Smartphone();
	        smart.makeCall();
	        smart.takePhoto();
	}

}
