import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DSAStudents {
	public static void main(String args[]) {
		
	
 Set<String>S11 = new HashSet<>(Arrays.asList("mathu,vithu,jathu,kaju"));
 Set<String>S12 = new HashSet<>(Arrays.asList("mathu,vithu,jathu,jama,"));
 
 
S11.addAll(S12);
System.out.println("S11 :"+ S12);

}
}