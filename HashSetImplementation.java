import java.util.ArrayList;
import java.util.HashSet;

public class HashSetImplementation {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("One");
		HashSet<String> set = new HashSet(list); 
		System.out.println(set);
	}

}
