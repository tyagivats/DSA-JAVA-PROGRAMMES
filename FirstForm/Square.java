package FirstForm;

import java.util.ArrayList;
import java.util.List;

import javax.print.DocFlavor.STRING;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>list=new ArrayList<>();
		list.addAll(List.of(1,2,3,4));//EVEN NUMBER CHECK
		list.stream().map(n->n*2).forEach(System.out::println);
		ArrayList<String>list1=new ArrayList<>();
		//extract string charcter
		list1.addAll(List.of("Java","pyhton","C"));
		list1.stream().map(c->c.charAt(0)).forEach(System.out::println);
		//all integer to string
		ArrayList<Integer>list2=new ArrayList<>();
		list2.addAll(List.of(10,20,30));
		list2.stream().map(p->p.toString()).forEach(System.out::println);
	//	System.out.println(String);
		ArrayList<String>list3=new ArrayList<>();
		list3.addAll(List.of("A","B","C"));
		list3.stream().map(s->"Item-"+s).forEach(System.out::println);
		//System.out.println(s);

	}

}
