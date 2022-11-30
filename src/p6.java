
public class p6 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        RacingCar2nd rccar1 = new RacingCar2nd(1234,20.5,5);
    }

}

class Car2nd{
    private int num;
    private double gas;

    public Car2nd() {
        num = 0;
        gas = 0.0;
        System.out.println("Made a car");
    }

    public Car2nd(int n,double g) {
        num=n;
        gas=g;
        System.out.println("Produced a car with license plate number " + num
                + ", fuel capacity "+gas);
    }

    public void setCar(int n,double g) {
        num=n;
        gas=g;
        System.out.println("Set the license plate number to " + num
                + ", fuel capacity is set to " + gas);
    }

    public void show() {
        System.out.println("The license plate number is " + num);
        System.out.println("The fuel capacity is " + gas);
    }
}

class RacingCar2nd extends Car2nd{
    private int course;

    public RacingCar2nd() {
        course = 0;
        System.out.println("Made a racingcar");
    }

    public RacingCar2nd(int n,double g,int c) {
        super(n,g);
        course=c;
        System.out.println("Made a racing car numbered "+course);
    }

    public void setCourse(int c) {
        course=c;
        System.out.println("Set the racingcar number to "+course);
    }

}