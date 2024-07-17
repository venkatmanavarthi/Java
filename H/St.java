import java.util.Arrays;
import java.util.List;

public class St {
    public static void main(String[] args) {
        List<String> a = Arrays.asList("Nani", "Venkat");
        List<String> b = a.stream().map(String::toUpperCase).toList();
        b.forEach(System.out::println);        
    }
}
