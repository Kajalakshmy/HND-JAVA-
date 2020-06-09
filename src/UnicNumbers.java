import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnicNumbers {
public static void main(String args[]) {
		
		
		List<Integer>numList1 = Arrays.asList(2,5,6,1,9,7);
		Set<Integer>Uniquenumbers = new HashSet<>(numList1);
		Set<Integer>evennumbers=new HashSet<>(numList1);
		
		System.out.println(numList1);
		System.out.println(Uniquenumbers);
		System.out.println(evennumbers);
		
}
}
