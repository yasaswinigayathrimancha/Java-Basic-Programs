package collections.collectionsOfJava;
import java.io.*;  
import java.util.*; 

public class IteratorWithArrayList { 
	   public static void main(String[] args)  
	    {  
	        ArrayList<String> cityNames = new ArrayList<String>();  
	    
	        cityNames.add("Delhi");  
	        cityNames.add("Mumbai");  
	        cityNames.add("Kolkata");  
	        cityNames.add("Chandigarh");  
	        cityNames.add("Noida");  
	    
	        Iterator IamIterator = cityNames.iterator();  
	    
	        System.out.println("CityNames elements are : ");  
	    
	        while (IamIterator.hasNext())  
	            System.out.print(IamIterator.next()+" ");  
	    
	        System.out.println();  
	    }  
	   
	}  
