package kata2;
import java.util.Map;
import java.util.HashMap;

public class Kata2 {
    public static void main(String[] args) {
        int[] x = {1,5,4,4,7,4,2,6,8,6,3,2,4,6,5,8,9}; 
        Map <Integer,Integer> histogram = new HashMap<>();
        Histogram histo = new Histogram(x);
        Map<Integer,Integer> histogr = histo.getHistogram();
        for (Map.Entry<Integer, Integer> entry : histogr.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    
}
