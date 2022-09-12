import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
	
	public static void main(String[] args) {
		
		Map<String, Integer> num = new TreeMap<>();
		num.put("one", 1);
		num.put("two", 2);
		num.put("three", 3);
		
		System.out.println(num);
		
      if(!num.containsKey("Two")) {
    	  num.put("Two", 23);
      }
      
      num.putIfAbsent("Two", 23);
      
      for (Map.Entry<String, Integer> e: num.entrySet()) {
        System.out.println(e);

        System.out.println(e.getKey());
        System.out.println(e.getValue());
    }
      
	}

}
