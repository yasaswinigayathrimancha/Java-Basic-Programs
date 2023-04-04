package map_collections.mapsCollection;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class HashAndTreeMaps {

	public static void main(String[] args) {
          HashMap <Integer, String> iamHashMap=new HashMap <Integer, String>();
          TreeMap <Integer, String> iamTreeMap=new TreeMap <Integer, String>();
          
          iamHashMap.put(1,"hdfc");
          iamHashMap.put(7,"icici");
          iamHashMap.put(6,"sbi");
          iamTreeMap.put(4,"yash");
          iamTreeMap.put(1,"kanksha");
          iamTreeMap.put(3,"meghana");
          iamTreeMap.put(8,"Teena");
          
          for(Map.Entry<Integer,String> entry:iamHashMap.entrySet())
              System.out.println(entry.getKey()+" , "+entry.getValue());
              System.out.println();
          for(Map.Entry<Integer,String> entry:iamTreeMap.entrySet())
              System.out.println(entry.getKey()+" , "+entry.getValue());
          
	}

}
