
public class p4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        RacingCar1st rccar1;
        rccar1 = new RacingCar1st();
        rccar1.setCar(1234, 20.5);
        rccar1.setCourse(5);
    }

}
class Car1st{
    private int id;
    private double gas;

    public Car1st() {
        id = 0;
        gas = 0.0;
        System.out.println("Made a car");
    }

    public void setCar(int n,double g) {
        id=n;
        gas=g;
        System.out.println("Set the license plate number to "+ id
                + ", fuel capacity is set to " + gas);
    }

    public void show() {
        System.out.println("The license plate number is "+id);
        System.out.println("The fuel capacity is "+gas);
    }
}

class RacingCar1st extends Car1st{
    private int course;

    public RacingCar1st() {
        course = 0;
        System.out.println("Made a racingcar");
    }

    public void setCourse(int c) {
        course=c;
        System.out.println("Set the racingcar id to "+course);
    }

}
