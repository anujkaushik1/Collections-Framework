import java.util.Stack;

public class LearnStack {
	
	public static void main(String[] args) {

		Stack<String> st = new Stack<>();
		st.push("Lion");
		st.push("Dog");
		st.push("Horse");
		st.push("Cat");
		
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.pop());
	}
	
}
