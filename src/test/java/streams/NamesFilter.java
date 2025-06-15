package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class NamesFilter {
	@Test
	public static void regular() {
		//Count the number of names starting with alphabet A in the list
		
		ArrayList names = new ArrayList();
		names.add("Aarav");
		names.add("Ansh");
		names.add("Abhishek	");
		names.add("Monu");
		names.add("Sam");
		int count=0;
		
		for(int i =0; i<names.size(); i++)
		{
			String actual = (String) names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	@Test
	public static void streamFilter()
	{
		ArrayList names = new ArrayList();
		names.add("Aarav");
		names.add("Ansh");
		names.add("Abhishek");
		names.add("Monu");
		names.add("Sam");
		/*There is no life for intermediate operation (filter) if there is no terminal (->) operator
		 Terminal operator will execute only if intermediate op returns true (filter)
		 We can create stream by Stream.of
		 Using filter in Stream
		*/
		Long c = names.stream().filter(s-> ((String) s).startsWith("A")).count();
		System.out.println(c);
		
		// to make stream compatible 
	long d=	Stream.of("Aarav","Ansh","Abhishek","Monu","Sam").filter(s-> 
		{
			((String) s).startsWith("A");
			return false;
			}).count();
		System.out.println(d);
		
		
		//print all the names of ArrayList
		names.stream().filter(s->((String) s).length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->((String) s).length()>4).limit(1).forEach(s->System.out.println(s));	
		
	}

	@Test
	public void streamMap()
	{
		//print names ending with letter k and convert them into upper case
		Stream.of("Aarav","Ansh","Abhishek","Mayank","Sam").filter(s->s.endsWith("k")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//print names which have first letter as 'A' with Upper case and sorted 
		List<String> names= Arrays.asList("Aarav","Ansh","Abhishek","Mayank","Sam");
		names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println());
			
	}

}
