package kata2;
import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {
        String[] x = {"Edu","Duro","Gatti","Josep","Gatti","Duro","Gatti"}; 
        Histogram histo = new Histogram(x);
        Map<String,Integer> histogr = histo.getHistogram();
        for (Map.Entry<String, Integer> entry : histogr.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    
}
