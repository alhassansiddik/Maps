import java.util.HashMap;
import java.util.Map;
public class HashMapImplementation {
	public static void main(String[] args) {
		HashMap<String, String> hmap = new HashMap<String, String>();
		hmap.put("water", "good");
		hmap.put("tea", "good");
		hmap.put("coffee", "good");
		hmap.put("alcohol", "bad");
		hmap.put("soup", "good");
		
		for( Map.Entry<String, String> entry : hmap.entrySet()) {
			String beverage = entry.getKey();
			String rating = entry.getValue();
			
			System.out.println(beverage + " has a " + rating + " rating.");
		}
	}
}
