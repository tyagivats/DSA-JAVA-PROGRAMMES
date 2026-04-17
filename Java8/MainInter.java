package Java8;
//before java1.7 this definition
//interface is a template or blueprint of a class
//all the methods of interface is by default public abstract
//all the value in interface is by default public final static
//no body//use static method
//use private method
//after java 1.8
//we also define default,static,private method
//overriden possible
//multiple default static private method make 
//multiple abstract make
interface Message{
	void displayMsg();
	default void displayMsg(String msg) {
		msgInfo(msg);//private method call 
		System.out.println(msg);
	}
	static void displayInfo() {
		System.out.println("this is display info");
	}
	private void msgInfo(String msg) {
		System.out.println(msg);
		
	}
}
class DisplayMessage implements Message{
	public void displayMsg() {
		System.out.println("This is main display method");
	}
}
public class MainInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   DisplayMessage dm=new DisplayMessage();
   dm.displayMsg();
   dm.displayMsg("This is second method");
   Message.displayInfo();//interface method access
	}

}
