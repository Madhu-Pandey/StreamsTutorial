package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NamesFilter {
	@Test
	public  void regular() {
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
	public  void streamFilter()
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
		ArrayList names = new ArrayList();
		names.add("Mohan");
		names.add("Atul");
		names.add("Sony");

		
		//print names ending with letter k and convert them into upper case
		Stream.of("Aarav","Ansh","Abhishek","Mayank","Sam").filter(s->s.endsWith("k")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//print names which have first letter as 'A' with Upper case and sorted 
		List<String> names1= Arrays.asList("Aarav","Ansh","Abhishek","Mayank","Sam");
		names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//merging two different list and then applying sort
		//converting ArrayList into streams and concatenate
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
//		newStream.sorted().forEach(s->System.out.println(s));
		boolean status = newStream.anyMatch(s->s.equalsIgnoreCase("Sony")); //searching sony in the merged list		
		System.out.println(status);
		Assert.assertTrue(status);
		
	}
	
	@Test
	public void streamCollect()
	{
		//converting the results stream into list
		List<String> ls = Stream.of("Aarav","Ansh","Shashank","Priyank","Sam").filter(s->s.endsWith("k")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0)); //first element of list
		
		List<Integer> values = Arrays.asList(100,200, 100,60,200,700,90);
		//print unique number from the array
		values.stream().distinct().forEach(s->System.out.println(s));
		//sort the given array -print 3rd index - 60,90,100,200,700
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("3rd index: "+li.get(2));
	}

}
