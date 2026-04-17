package streamsort;

import java.util.Arrays;
import java.util.List;

public class StreamSort {
//USE SORT METHOD
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(12,45,67,23,89,34,78);
		System.out.println(list);
		List<Integer>sortedList=list.stream().sorted((a,b)->b-a).toList();//b-a(des)//a-b(asc)
		System.out.println(sortedList);
		// TODO Auto-generated method stub
		//REVERSE
		//USE COMPARITOR//COMPARIBLE
		//comparable(compare to method(,1 arguement,return type int);
		//comparator(class impliment compare method()(2,arguement,return type int);
		//return 1 then value swap
		//return 0 or -1 not swap
	//	int compare(t,01,t,02)
	  List<Integer>list1=Arrays.asList(18,42,7,91,33,25,60);
	  System.out.println(list1);
	  List<Integer>sortedList1=list1.stream().sorted((a,b)->a).toList();
	  System.out.println(sortedList1);
	  //PRINT HIGHEST NUMBER IN USING STREAM
	  List<Integer>list2=Arrays.asList(55,12,88,34,99,21);
	  System.out.println(list2);
	//  List<Integer>sortedList2=list2.stream().sorted((a,b))
	  int result=list.stream().sorted((a,b)->b-a).toList().get(1);
	  System.out.println(result);
	  //FIND EVEN SUM
	  int result2=list.stream().sorted((a,b)->a+b%2).toList().get(1);
	  System.out.println(result2);
	  //second highest using skip
	  int result3=list.stream().sorted((a,b)->b-a).skip(1).findFirst().get();
	  System.out.println(result3);
	  //sort the name based on alphabetically
	  List<String>list4=Arrays.asList("Suresh","Amit","Vikas","Priya","Neha");
	  System.out.println(list4);
	  List<String>sortedList4=list4.stream().sorted((a,b)->b.compareTo(a)).toList();
	  System.out.println(sortedList4);
	  
	  
		
	}

}
