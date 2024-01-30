package objectProgram;

public class Car {
    String color;
    String size;
    boolean engineState;

    void showAtts() {
        System.out.println("This car is a " + color + "size" + ".");

        if ( engineState == true) {
            System.out.println("The engine is on." );
        }else {
            System.out.println("The engine is off.");
        }
    }

    void startEngine() {
        if (engineState == true) {
            System.out.println("The engine is already on. \n");
        }
        else {
            engineState = true;
            System.out.println("The engine was started. \n");
        }
    }

    void stopEngine() {
        if (engineState == false) {
            System.out.println("The engine is already off. \n");
        }else {
            engineState = false;
            System.out.println("The engine was stopped. \n");
        }
    }

}
