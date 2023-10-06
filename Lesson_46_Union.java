package blue_pelican_stuff;
import java.util.*;
public class Lesson_46_Union {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<String>( ); 
	    s1.add("Bill");s1.add("Larry");s1.add("Adolph");s1.add("Regina");s1.add("Susie");
	    Set<String> s2 = new HashSet<String>( ); 
	    s2.add("Larry");s2.add("Jack");s2.add("Alice");s2.add("June");s2.add("Bennie");s2.add("Susie");
	    Set<String> s3 = new HashSet<String>( ); //union of s2 and 1

	    Iterator<String> iter1 = s1.iterator();
	    Iterator<String> iter2 = s2.iterator();
	    while(iter2.hasNext()){
	      Object thing =iter2.next();
	      if(s3.contains(thing)==false){
	        s3.add((String)thing);
	      }
	    }
	    while(iter1.hasNext()){
	      Object thing =iter1.next();
	      if(s3.contains(thing)==false){
	        s3.add((String)thing);
	      }
	    }
	    

	    Iterator<String> iter3 = s3.iterator();
	    while(iter3.hasNext()){
	      System.out.println((String)iter3.next());
	    }
	}

}
