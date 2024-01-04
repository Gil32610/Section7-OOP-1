public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.describeCar();
        car.setMake("Mazda");
        System.out.println("Make = " + car.getMake());
        System.out.println("Model = " + car.getModel());


        Car rx7 = new Car();
        rx7.setMake("mazda");
        rx7.setDoors(2);
        rx7.setColor("blue");
        rx7.setModel("rx7");
        rx7.setConvertible(false);
        rx7.describeCar();
    }

}
