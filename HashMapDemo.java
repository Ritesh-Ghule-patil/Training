package ritesh;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put( "ritesh","neri");
		hm.put("shubham","maldabhadi");
		hm.put("sandesh","pachora");
		
		System.out.println(hm);
		
		for(String str: hm.keySet())
		{
			System.out.println(str+ "    "+hm.get(str));
		}
		
		hm.remove("sandesh");
		System.out.println(hm.containsKey("ritesh"));
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		for(String i : hm.values())
		{
			System.out.println(i);
		}
		
		 for(Map.Entry entry : hm.entrySet())
		{
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		 System.out.println("---------------------------------");
		Set<Entry<String, String>> s = hm.entrySet();
		 Iterator i = s.iterator(); 
		 while(i.hasNext()) {
			 System.out.println(i.next());
		 }
		 
		 //System.out.println("-----------------------");
		 
	}
}
