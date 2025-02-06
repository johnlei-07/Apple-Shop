package shoppingSystem;

public class iPad {
	String [] iPad = {
			"\n***********iPad Prices***********",
        	"1 iPad Pro		- Php45,990",
        	"2 iPad Air		- Php33,990",
        	"3 iPad mini		- Php23,990",
        	"4 iPad			- Php18,990"	
	};
	
	public iPad() {
		System.out.println("WELCOME TO OUR IPAD AVAILABLE");
	}
	
	iPad(String [] iPad){
		this.iPad=iPad;
	}
	
	void iPadList() {
		for (String show: iPad) {
			System.out.println(show);
		}
	
	}
	void choiceB(int choiceB) {
		switch(choiceB) {
		case 1: System.out.println("You chose: iPad Pro");break;
		case 2: System.out.println("You chose: iPad Air");break;
		case 3: System.out.println("You chose: iPad mini");break;
		case 4: System.out.println("You chose: iPad");break;
		default: System.out.println("Wrong Input");break;
		}
	}
}
