import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
	
	public static void main(String[] args) {
		

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Anuj", 2));
        studentSet.add(new Student("Ramesh", 4));
        studentSet.add(new Student("Shivam", 3));

        studentSet.add(new Student("Rohit", 2));
        
        System.out.println(studentSet);
		
	}

}
