public class p24 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Car7th car1;
        car1 = new Car7th();

        car1.setCar(1234, 20.5);
        System.out.println(car1);
    }
}

class Car7th{
    protected int num;
    protected double gas;

    public Car7th() {
        num = 0;
        gas = 0.0;
        System.out.println("Made a car");
    }

    public void setCar(int n,double g) {
        num=n;
        gas=g;
        System.out.println("Set the car number to " + num + ", fuel capacity is set to " + gas);
    }

    public String toString() {
        String str = "Car number:" + num + ", Fuel capacity:" + gas;
        return str;
    }
}