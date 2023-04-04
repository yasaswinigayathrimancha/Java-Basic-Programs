package map_collections.mapsCollection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.*;

public class DuplicatesCount {

	public static void main(String[] args) {

		int[] arr = new int[] { 111, 333, 555, 777, 777, 333, 444, 555 };

		System.out.println((arr));

	}

	public static HashMap<Integer, Integer> findDuplicatesUsingHashMap(int[] arr) {

		HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
		for (int i : arr) {
			if (mp.containsKey(i)) {
				mp.put(i, mp.get(i) + 1);
			} else {
				mp.put(i, 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
			System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
		}

		return mp;
	}

}