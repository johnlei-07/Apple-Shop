package shoppingSystem;

public class MacBook {
	String [] MacBook = {
			"\n***********MacBook Prices***********",
        	"1 MacBook Pro	- Php86,990",
        	"2 MacBook Air	- Php71,990",
        	"3 MacBook Mini	- Php52,990"
	};
	
	public MacBook() {
		System.out.println("WELCOME TO OUR MACBOOK AVAILABLE");
	}
	
	MacBook(String [] MacBook){
		this.MacBook = MacBook;
	}
	void MacBookList() {
		for(String show: MacBook) {
			System.out.println(show);
		}
	}
	void choiceC(int choiceC) {
		switch(choiceC) {
		case 1:System.out.println("You chose: MacBook Pro");break;
		case 2:System.out.println("You chose: MacBook Air");break;
		case 3:System.out.println("You chose: MacBook Mini");break;
		default: System.out.println("Wrong Input");break;
		
		}
	}

}
