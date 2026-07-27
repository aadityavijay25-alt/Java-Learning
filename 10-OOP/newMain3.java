public class newMain3 {
    public static void main(String[] args) {
        
        // Circle circle = new Circle(4);
        // Triangle triangle = new Triangle(2,3);

        // System.out.println(circle.area());
        // System.out.println(triangle.area());

        Bike bike = new Bike();
        Boat boat = new Boat();

        // bike.go();
        // boat.go();

        Vehicle[] vehicles = {bike,boat};

        for(Vehicle vehicle: vehicles){
            vehicle.go();
        }


    }
    
}
