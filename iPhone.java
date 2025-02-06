package shoppingSystem;

public class iPhone {
	 String [] iPhone = {
	        	"\n***********iPhone Prices***********",
	        	"\n1 iPhone 15 Pro 	- Php77,990",
	        	"2 iPhone 15	   	- Php56,990",
	        	"3 iPhone 14 Pro		- Php70,990",
	        	"4 iPhone 14		- Php49,990",
	        	"5 iPhone 13 Pro		- Php63,990",
	        	"6 iPhone 13		- Php42,990",
	        	"7 iPhone SE 5G		- Php30,990"	
	        };
	 public iPhone() {
		 System.out.println("WELCOME TO OUR AVAILABLE IPHONE");
	 }
	 
	 iPhone(String [] iPhone){
		 this.iPhone = iPhone;
	 }
	 
	 void iPhoneList() {
		 for(String show:iPhone) {
			 System.out.println(show);
		 }
	 }
		 
	void choiceA(int choiceA) {
		switch (choiceA) {
		case 1: System.out.println("You chose: iPhone 15 Pro");break;
		case 2: System.out.println("You chose: iPhone 15");;break;
		case 3: System.out.println("You chose: iPhone 14 Pro");break;
		case 4: System.out.println("You chose: iPhone 14");break;
		case 5: System.out.println("You chose: iPhone 13 Pro");break;
		case 6: System.out.println("You chose: iPhone 13");break;
		case 7: System.out.println("You chose: iPhone SE");break;
		default: System.out.println("Wrong Input");break;
		}
	
	 }

}
