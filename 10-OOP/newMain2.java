public class newMain2 {
    public static void main(String[] args) {
        Person person = new Person("Tony","Stark");
        Student student = new Student("Tom", "Holand" , 8.0);
        Employee employee = new Employee("David","Miller",500000);

        student.showName();
        student.showGPA();
        employee.showSalary();  


        
    }
}
