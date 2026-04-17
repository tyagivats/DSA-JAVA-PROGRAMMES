package streamapi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List data=Arrays.asList(23,45,12,56,78,90);
		//List data=List.of(23,45,12,56.78,90);
		//Stream listStream;
		//Stream Stream = listStream=data.stream();
		Stream info=Stream.of(23,67,88,"mahi",0.5);//immutable
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(73);
		list.addAll(List.of(34,56,17));
		list.addAll(data);
		System.out.println(list);
	//	Stream listStream=list.stream();
		list.stream().filter((n)->n>60).forEach(System.out::println);//use data also
		//object make only perform one operation when you perform new operation create object 
		

	}

}
