package shoppingSystem;

public class Menu {
	String [] menu = {
        	"\nAvailable Products",
        	"[A]  iPhone",
        	"[B]  iPad",
        	"[C]  MacBook",
        	"[D]  Accesories",
        	"[X]  Show Cart",
        	"[V]  Checkout",
        	"[Z]  Exit",
        };
	
	public Menu() {
		System.out.println("Welcome to the SHC Apple Store! ");
	}
	 Menu (String [] menu){
		this.menu =menu;
	}
	

	void menuList() {
		for(String show: menu){
			System.out.println(show);
		}
	}

}
