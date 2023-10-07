package ArrayLearning;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLearning2 {
	
	public static void main(String args[]) {
		
		ArrayList<Object> alHetero = new ArrayList();  //Generics
		
		
		alHetero.add("Nikita");
		alHetero.add(123);
		alHetero.add(1.2);
		alHetero.add(true);
		alHetero.add('c');
		alHetero.add(new User());
		
		
		
		
		Iterator<Object> itr = alHetero.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			itr.remove();
		}
	}

}
