package collections;

import java.util.HashMap;
import java.util.Set;

public class MyHashMapRead 
{

	public static void main(String[] args) 
	{
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("first", "value-1");
		hm.put("second", "value-2");
		hm.put("third", "value-3");
		hm.put("fourth", "value-4");
		hm.put("fifth", "value-5");
		hm.put("fifth", "value-5");// no CE,but no duplicates are inserted, no order of keys.
		System.out.println(hm);
		//to print all the keys values in the Map
		Set<String> keys = hm.keySet();
		for(String key:keys)
		{
			System.out.println("Value of " +key+ " is: "+hm.get(key));
		}

	}

}
