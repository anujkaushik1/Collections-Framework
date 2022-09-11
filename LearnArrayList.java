import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		
		list.add(2, 20);
		System.out.println(list);
		
		ArrayList<Integer> newlist = new ArrayList<>();
		newlist.add(100);
		newlist.add(130);
		
		list.addAll(newlist);
		
		System.out.println(list);
		
		System.out.println(list.get(3));
		
		list.remove(4);
		System.out.println(list);
		
		list.remove(Integer.valueOf(130));
		System.out.println(list);
		
//		list.clear();
		
		list.set(1, 200);
		
		System.out.println(list.contains(200));
		
		for (int i = 0; i < list.size()	; i++) {
			System.out.println(list.get(i));
		}
		
		for(Integer val : list) System.out.println(val);
		
		Iterator<Integer> i = list.iterator();
		
		while(i.hasNext()) {
			System.out.print(i.next()+"\t");
		}
		
		
	}

}
