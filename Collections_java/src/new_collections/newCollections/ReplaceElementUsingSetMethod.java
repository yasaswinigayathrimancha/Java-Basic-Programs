package new_collections.newCollections;

import java.util.ArrayList;
import java.util.*;

public class ReplaceElementUsingSetMethod {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		arrList.add("Kent");
		arrList.add("Koll");
		arrList.add("Kat");
		arrList.add("Kit");
		String str = sc.nextLine();
		int pos = sc.nextInt();
		arrList.set(pos, str);
		System.out.println("new arraylist is:");
		for (String string : arrList)
			System.out.println(string);

	}

}
