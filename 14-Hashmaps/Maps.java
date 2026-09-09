import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String , Double> map = new HashMap<>();

        map.put("Apple", 12.1);
        map.put("Orange", 10.11);

        // System.out.println(map);
        // System.out.println(map.get("Apple"));
        // System.out.println(map.containsKey("Pineapple"));
        System.out.println(map.size());
    }
    
}
