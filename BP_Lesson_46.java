package blue_pelican_stuff;
import java.util.*;
public class BP_Lesson_46{
	public static void main(String[] args) {
		Set<String> s1 = new HashSet<String>( ); //Create s1
	    s1.add("Bill");s1.add("Larry");s1.add("Adolph");s1.add("Regina");s1.add("Susie");
	    Set<String> s2 = new HashSet<String>( ); //Create s2
	    s2.add("Larry");s2.add("Jack");s2.add("Alice");s2.add("June");s2.add("Bennie");s2.add("Susie");
	    s1.retainAll(s2);
	    Iterator<String> iter25 =s1.iterator();
	    while(iter25.hasNext()){
	      System.out.println(iter25.next());
	    }
	}
}
