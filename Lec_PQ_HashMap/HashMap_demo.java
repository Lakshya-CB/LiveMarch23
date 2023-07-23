package Lec_PQ_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMap_demo {
	public static void main(String[] args) {
		HashMap<String, Integer> HM = new HashMap<>();
		HM.put("A", 10); //O(1)
		HM.put("bz", 15);
		HM.put("vA", 12);
		HM.put("As", 5);
		HM.put("Az", 9);//O(1)
		System.out.println(HM);
		
		System.out.println(HM.get("Ax"));
		

		HM.put("Az", 90);//O(1)
		
		System.out.println(HM);
		HM.put("Az", null);//O(1)
		System.out.println(HM.get("Az"));

		System.out.println(HM);
		
		System.out.println(HM.containsKey("Azx"));
		HM.remove("Az");
		System.out.println(HM.get("Az"));
				//
//		System.out.println(HM.keySet());
		Set<String> Keys = HM.keySet();
		ArrayList<String> AL =
				new ArrayList<>(HM.keySet());
		for(String key : HM.keySet()) {
			System.out.println(key + " - "+HM.get(key));
		}
	}
}
