import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
	
	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<>();
		set.add(10);
		set.add(20);
		set.add(2);
		set.add(54);
		
		set.add(2);
		
		set.remove(2);
		
		System.out.println(set);
		
		
	}

}
