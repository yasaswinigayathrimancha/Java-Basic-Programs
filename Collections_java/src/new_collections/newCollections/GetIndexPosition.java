package new_collections.newCollections;
import java.util.ArrayList;
public class GetIndexPosition {

	public static void main(String[] args) {
		ArrayList<String> arrList=new ArrayList<String>();
		arrList.add("Apple");
		arrList.add("Ball");
		arrList.add("Cat");
		arrList.add("Doll");
		  int no_of_elements = arrList.size();
		  for (int index = 0; index < no_of_elements; index++) {
		   System.out.println(arrList.get(index));
		 }
		
	}

}
