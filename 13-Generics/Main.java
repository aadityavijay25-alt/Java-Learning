public class Main {
    public static void main(String[] args) {

        // Box<String> box = new Box<>();

        // box.setItem("King");

        // System.out.println(box.getItem());

        Product<String ,Double> product = new Product<>("Apple", 20.11);
        System.out.println(product.getItem());
        System.out.println(product.getPrice());

    }
    
}
