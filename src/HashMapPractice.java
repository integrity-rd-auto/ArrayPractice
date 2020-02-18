import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapPractice {

	public static void main(String[] args) {
	
		
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		
		hm.put(1,"Ram1");
		hm.put(2,"Ram2");
		hm.put(3,"Ram3");
		hm.put(4,"Ram4");
		
		for ( Entry<Integer, String> m : hm.entrySet()) {
			
			System.out.println(m.getKey()+"------------->"+m.getValue());
			
			
		}
		

	}

}
