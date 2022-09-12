import java.util.HashSet;
import java.util.Set;

public class LearnSet {
	
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(2);
		set.add(54);
		
		set.add(2);
		
		set.remove(2);
		
		System.out.println(set);
		
		
	}

}
