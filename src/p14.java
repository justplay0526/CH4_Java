
public class p14 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Car5th car1;
        car1 = new RacingCar5th();

        car1.setCar(1234, 20.5);
        car1.show();
    }

}

class Car5th{
    protected int num;
    protected double gas;

    public Car5th() {
        num = 0;
        gas = 0.0;
        System.out.println("Made a car");
    }

    public void setCar(int n,double g) {
        num=n;
        gas=g;
        System.out.println("Set the car number to "+num
                + ", fuel capacity is set to " + gas);
    }

    public void show() {
        System.out.println("The car number is " + num);
        System.out.println("The fuel capacity is "+gas);
    }
}

class RacingCar5th extends Car5th{
    private int course;

    public RacingCar5th() {
        course = 0;
        System.out.println("Made a racingcar");
    }

    public void setCourse(int c) {
        course=c;
        System.out.println("Set the racingcar number to " + course);
    }
    public void show() {
        System.out.println("The racingcar number is " + num);
        System.out.println("The fuel capacity is " + gas);
        System.out.println("The racingcar serial number is " + course);
    }
}
