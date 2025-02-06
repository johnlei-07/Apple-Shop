package shoppingSystem;

public class Accesories {
	String [] Accesories = {
			"\n***********Accesories***********",
        	"1 Apl Watch SE		- Php20,990",
        	"2 Apl AirPods Pro	- Php15,990",
        	"3 Apl Studio Buds 	- Php08,190",
        	"4 Magic Mouse		- Php05,490",
        	"5 Magic Keyboard	- Php07,490"	
	};
	public Accesories() {
		System.out.println("WELCOME TO OUR ACCESORIES AVAILABLE");
	}
	
	Accesories(String [] Accesories){
		this.Accesories = Accesories;
	}
	
	void AccesoriesList(){
		for (String show: Accesories) {
			System.out.println(show);
		}
	}
	void choiceD(int choiceD) {
		switch(choiceD) {
		case 1:System.out.println("You chose: Apl Watch SE");break;
		case 2:System.out.println("You chose: Apl AirPods Pro");break;
		case 3:System.out.println("You chose: Apl Studio Buds");break;
		case 4:System.out.println("You chose: Magic Mouse");break;
		case 5:System.out.println("You chose: Magic Keyboard");break;
		default:System.out.println("Wrong Input");break;
		}
		
	}
}
