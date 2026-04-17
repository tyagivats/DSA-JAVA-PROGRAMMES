package enc;
//encapsulation

import java.util.ArrayList;

class Product {
		private int pid;
		private String productName;
		private double price;
		private int quantity;
		public  Product(int pid,String productName,double price,int quantity) {
			
			this.pid=pid;
			this.productName=productName;
			this.price=price;
			this.quantity=quantity;
			
		}
		public int getPid() {
			return pid;
		}
		public double getPrice() {
			return price;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public String getProductName() {
			return productName;
		}
		

}
 public class MainEnc{
	 public static void main(String[]args) {
		 ArrayList<Product> List=new ArrayList<>();
//		 Product p1=new Product(1,"Mobile",0000,10);
//		 List.add(p1);
		 
		 List.add(new Product(2,"Mobile",4000,01));
		 List.add(new Product(3,"laptop",6000,02));
		 List.add(new Product(4,"Mobile",9000,04));
		 List.add(new Product(6,"Mobile",0000,04));
		 List.add(new Product(9,"Mobile",3000,00));
		 System.out.println("ProductId\tProduct Name\tPrice\t\tQuantity");
		 for(Product p:List) {
		
		 
		 
		 
		

		 String result=String.format("\t%d\t%s\t\t%f\t%d",p.getPid(), p.getProductName(),p.getPrice(),p.getQuantity());
		 System.out.println(result);
	 }
 }
 }
 //oops concept used for large scale industry real time entity solving real world problems it is differ from procedural in term of  real world entity
//instance variable are those declare outside the method (use this)
 //static method called class method other then all instance variable or method
 //when use not  new in java then refrence sharing is possible changes occur both classes 
 //when we use new then it gives new memory allocation not possible changes
 //we use static when you want to give class object have same static value if any object change then all change share  occur reason static (common value in object)
 //this keyword use object class current instance access object class
 //super current object parent class access parent class
 //counter value change last update in static
 
 
 


