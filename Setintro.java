import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class Setintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> c=t->System.out.println(t);
		//Predicate<Integer>p=t->t%2==0;
		HashSet<Integer> h=new HashSet<Integer>();
		h.add(23);
		h.add(5);
		h.add(32);
//        h.add(88);
//        h.add(null);
//		h.add(null);
//		h.add(23);
//		System.out.println(h);
//		System.out.println(h.remove(88));
//		System.out.println(h);
//		System.out.println(h.remove(105));
//		System.out.println(h);
//		System.out.println(h.contains(99));
//		System.out.println(h.contains(88));
//		System.out.println(h);
//		System.out.println(h.addAll(Arrays.asList(66,99,12,34,32)));
//		System.out.println(h);
//		System.out.println(h.addAll(Arrays.asList(88,88,88)));
//		System.out.println(h);
//		HashSet<Integer> h1=new HashSet<Integer>();
//		h1.add(23);
//		h1.add(5);
//		h1.add(32);
//		h1.add(300);
//		h1.add(500);
//		h.add(600);
//		h1.add(12);
//		h1.add(67);
//		
//		System.out.println(h.retainAll(h1));
//		System.out.println(h);
//		System.out.println(h.containsAll(h1));
//		System.out.println(h);
//		System.out.println(h.removeAll(h1));
		System.out.println(h);
		//h.removeIf(t->t%2==0);
//		for(Integer i:h) {
//			if(i%2==0) {	
//		System.out.println(i);
//		h.remove(i);
//			
		
		h.forEach(c);
		System.out.println(h);
//		   

		
	}

}
