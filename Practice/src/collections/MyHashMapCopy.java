package collections;

import java.util.HashMap;

public class MyHashMapCopy 
{

	public static void main(String[] args) 
	{
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("1", "one");
		hm.put("2", "two");
		System.out.println(hm);
		HashMap<String, String> subMap = new HashMap<String, String>();
		subMap.put("3", "three");
		subMap.put("4", "four");
		//Copy from subMap to hm
		hm.putAll(subMap);
		System.out.println(hm);
	}

}
