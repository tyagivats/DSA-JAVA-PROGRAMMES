package streamreduce;

import java.util.Arrays;
import java.util.List;

public class ReduceEx {

	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(12,14,54,67,14,178,96);
		int result=list.stream().reduce(1,(a,b)->a*b);//two parameter and given return type 
		System.out.println(result);
		List<Integer>list2=Arrays.asList(1,2,3,4,5,6);
		int result1=list2.stream().reduce(1,(a,b)->a>b?a:b);
		int result2=list2.stream().reduce(100,(a,b)->a<b?a:b);
		int result3=list2.stream().reduce(0,(a,b)->a+1);
		int result4=list2.stream().reduce(0,(a,b)->b%2==0?a:b);
		int result5=list2.stream().reduce(0,(a,b)->b%2!=0?a:b);
		System.out.println(result1);
		System.out.println(result2);
		System.out .println(result3);
		System.out.println(result4);
		System.out.println(result5);
	//<String>list3=Arrays.asList("java","Stream","REduce");
	    //int result6=list3.stream().reduce("",(a,b)->a+" "+b);
		//System.out.println(result6);
	int result6=list2.stream().reduce(0, (a,b)->a+b*b);
	System.out.println(result6);
	int max=list2.stream().reduce(1,(a,b)->a>b?a:b);
	int result8=list2.stream().reduce(1,(a,b)->a>b && a<max?a:b);

	//System.out.println(result7);
	System.out.println(result8);
	List<String>list3=Arrays.asList("java","programming","api","foundation");
	String result9=list3.stream().reduce("",(a,b)->a.length()>b.length()?a:b);
	System.out.println(result9);
	//int n=5;
	//reduce 3 arguments use for checking duplicacy
	//int result10=list2.stream
	
	

	}

}
