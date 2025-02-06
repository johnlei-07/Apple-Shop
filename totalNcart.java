package shoppingSystem;

public class totalNcart {
	String[] cart = new String[100];
	 double total ;
	 int itemCount;
	 int amt1;
	 
	 totalNcart( double total ,int itemCount,int amt1,String cart[]){
		 this.cart=cart;
		 this.total = total;
		 this.itemCount = itemCount;
		 this.amt1 = amt1;
	 }
	 public totalNcart() {
		 System.out.println("YOUR BAG");
	 }
	 void cartNtotal() {
		 String[] cart = new String[100];
		 total = amt1 * 77990;// Php77,990
			cart[itemCount] = amt1 + " iPhone 15 Pro"; 
			itemCount++;
			System.out.println("*** " + amt1 + " iPhone 15 Pro has been");
	 }
	 
}
