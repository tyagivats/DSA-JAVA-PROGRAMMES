
import java.util.Arrays;
import java.util.List;
//import java.util.function.consumer;

public class Main{

	public static void main(String[] args) {
		int data[]=new int[] {12,34,5,66,78,45};
		//BOXING 
		List<Integer> listData=Arrays.stream(data).boxed().toList();
		 //listData.forEach((item)->System.out.println(item));
		//System.out.println(listData);
		listData.forEach(System.out::println);
//		List<int[]> listData=Arrays.asList(data);
//		Object list;
//		System.out.println(list.Data.get[1][1]);// TODO Auto-generated method stub
		

	}

}
