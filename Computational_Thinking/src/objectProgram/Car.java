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


class TestCar  {

    public static void main(String[] args) {
        Car testCar = new Car();
        Car testCar2 = new Car();

        
        System.out.println(testCar);
        System.out.println(testCar2);

        testCar = testCar2;

        System.out.println(testCar);
        System.out.println(testCar2);

        int[] arr = new int[3];
    }


}
