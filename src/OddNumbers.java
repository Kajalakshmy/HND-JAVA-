import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class OddNumbers {
public static void main(String args[]) {
		
		SortedSet<Integer>oddNumset=new TreeSet<>();
		List<Integer>numList1 = Arrays.asList(12,50,60,12,50,90);
		Set<Integer>numset1 = new TreeSet<>(numList1);
		
		
		
		
		for(Integer num:numset1) {
			if(num%2==1)
			oddNumset.add(num);
		}
	}
	

}


