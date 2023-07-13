package LL_HM;

import java.util.ArrayList;
import java.util.HashMap;

public class HM_demo {
	public static void main(String[] args) {
//	HashMap<Key,Val>
		HashMap<String, Integer> HM = new HashMap<>();
		HM.put("A", 10); // O(1)
		HM.put("zB", 20); 
		HM.put("vC", 30); 
		HM.put("Dx", 40); 
		HM.put("43E", 50); 
		System.out.println(HM);
		HM.put("A", null); // O(1)
		System.out.println(HM);
		
		System.out.println(HM.get("A"));
		System.out.println(HM.get("zb"));
//		
		System.out.println(HM.containsKey("A"));
		System.out.println(HM.containsKey("zb"));
		System.out.println(HM.size());
		HM.remove("A");
		System.out.println(HM);
		HM.remove("A");
		System.out.println(HM);
		System.out.println("/////////////////");
//		System.out.println(HM.keySet());
//		ArrayList<String> AL_keys =new ArrayList<>(HM.keySet());
//		
//		System.out.println(AL_keys);
		for(String key : HM.keySet()) {
			System.out.println(key + " - "+HM.get(key));
		}
	}
}
