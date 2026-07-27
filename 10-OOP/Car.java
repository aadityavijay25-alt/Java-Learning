public class Car {
    String model;
    String color;
    int year;

    Car(String model , String color , int year){
        this.model = model;
        this.color = color;
        this.year = year;
    }
    @Override
    public String toString(){
        return this.model + " " + this.color +" "+ this.year;
    }
}
