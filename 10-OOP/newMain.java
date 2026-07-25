public class newMain {
    public static void main(String[] args) {
        

    Car[] cars = { new Car("BMW" , "White"),
                   new Car("Challenger" ,"Black")};
    
    for(Car car: cars){   // Enhanced for loop
        car.drive();
    }

    }
}
