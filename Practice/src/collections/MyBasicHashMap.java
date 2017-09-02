package collections;

import java.util.HashMap;

public class MyBasicHashMap 
{

	public static void main(String[] args) 
	{
		HashMap<String, String> hm = new HashMap<String,String>();
		hm.put("base-url","http://google.com");
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		hm.put("maint-url", "http://portal-aha_portal_qa.auto-drupal-qa-web01.highwire.org/maint");
		System.out.println(hm.get("base-url"));
		System.out.println(hm);
		hm.remove("maint-url");
		System.out.println(hm);
		System.out.println(hm.size());	
	}

}
