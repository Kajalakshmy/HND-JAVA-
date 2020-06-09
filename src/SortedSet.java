import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortedSet {
	public static void main(String args[]) {
		
		
		List<Integer>numList1 = Arrays.asList(12,50,60,12,50,90);
		Set<Integer>numset1 = new TreeSet<>(numList1);
		
		
		/*
		
		numset.add(5);
		numset.add(05);
		numset.add(50);
		numset.add(90);
		*/
		
		
		for(Integer integer:numset1) {
			System.out.println(integer);
		}
	}
	

}
