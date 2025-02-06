package shoppingSystem;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);//for String
		Scanner sc2 = new Scanner (System.in);//for Int
		String[] cart = new String[99]; 
		
		 double total = 0;
		 int itemCount = 0;
		 boolean exit = false;
		
		
		while(!exit) {
			Menu m = new Menu();
			m.menuList();
			System.out.println("Input Command: ");
			String select = sc1.nextLine();
			
			switch(select) {
			case "A":case"a":
				iPhone a = new iPhone();
				a.iPhoneList();
				System.out.println("Enter Choice: ");
				int choiceA = sc2.nextInt();

			switch(choiceA) {
			case 1:a.choiceA(choiceA);
			
			System.out.println("Enter Quantity: ");
			int amt1 = sc2.nextInt();
			
			total = amt1 * 77990;// Php77,990
			cart[itemCount] = amt1 + " iPhone 15 Pro"; 
			itemCount++;
			System.out.println("*** " + amt1 + " iPhone 15 Pro has been added to the cart" + " ***");
			break;
			case 2:a.choiceA(choiceA);
			System.out.println("Enter Quantity: ");
			int amt2 = sc2.nextInt();
			
			total = amt2 * 56990;// Php56,990
			cart[itemCount] = amt2 + " iPhone 15 "; 
			itemCount++;
			System.out.println("*** " + amt2 + " iPhone 15 Pro has been added to the cart" + " ***");
			break;
			case 3:a.choiceA(choiceA);
			System.out.println("Enter Quantity: ");
			int amt3 = sc2.nextInt();
			
			total = amt3 * 70990;//Php70,990
			cart[itemCount] = amt3 + " iPhone 14 Pro"; 
			itemCount++;
			System.out.println("*** " + amt3 + " iPhone 14 Pro has been added to the cart" + " ***");

			break;
			case 4:a.choiceA(choiceA);
			System.out.println("Enter Quantity: ");
			int amt4 = sc2.nextInt();
			
			total = amt4 * 49990;//Php49,990
			cart[itemCount] = amt4 + " iPhone 14 "; 
			itemCount++;
			System.out.println("*** " + amt4 + " iPhone 14 has been added to the cart" + " ***");
			break;
			case 5:a.choiceA(choiceA);
			System.out.println("Enter Quantity: ");
			int amt5 = sc2.nextInt();
			
			total = amt5 * 63990;//Php63,990
			cart[itemCount] = amt5 + " iPhone 13 Pro"; 
			itemCount++;
			System.out.println("*** " + amt5 + " iPhone 13 Pro has been added to the cart" + " ***");
			break;
			case 6:a.choiceA(choiceA);
			System.out.println("Enter Quantity: ");
			int amt6 = sc2.nextInt();
			
			total = amt6 * 42990;//Php42,990
			cart[itemCount] = amt6 + " iPhone 13"; 
			itemCount++;
			System.out.println("*** " + amt6 + " iPhone 13 has been added to the cart" + " ***");
			break;
			case 7:a.choiceA(choiceA);
			System.out.println("Enter Quantity: ");
			int amt7 = sc2.nextInt();
			
			total = amt7 * 30990;//Php30,990
			cart[itemCount] = amt7 + " iPhone SE 5G"; 
			itemCount++;
			System.out.println("*** " + amt7 + " iPhone SE 5G Pro has been added to the cart" + " ***");
			break;
			default:a.choiceA(choiceA);;break;
			}break;
			
			case "B": case "b":
				iPad b = new iPad();
				b.iPadList();
				System.out.println("Enter Choice: ");
				int choiceB = sc2.nextInt();
				
				switch(choiceB) {
				case 1:b.choiceB(choiceB);
				System.out.print("Enter Quantity: ");
    			int amt1 = sc2.nextInt();
    			total += amt1*45990;//PHP 45,990
    			cart[itemCount] = amt1 + " iPad Pro";
    			itemCount++;
    			System.out.println("*** "+amt1 + " iPad Pro has been added to the cart" + " ***");
				break;
				
				case 2:b.choiceB(choiceB);
    			System.out.print("Enter Quantity: ");
    			int amt2 = sc2.nextInt();
    			total += amt2*33990;//PHP 33,990
    			cart[itemCount] = amt2 + " iPad Air";
    			itemCount++;
    			System.out.println("*** "+amt2 + " iPad Air has been added to the cart" + " ***");
    			break;
				
				case 3:b.choiceB(choiceB);
    			System.out.print("Enter Quantity: ");
    			int amt3 = sc2.nextInt();
    			total += amt3*23990;//PHP 23,990
    			cart[itemCount] = amt3 + " iPad Mini";
    			itemCount++;
    			System.out.println("*** "+amt3 + " iPad Mini has been added to the cart" + " ***");
    			break;
				
				case 4:b.choiceB(choiceB);
    			System.out.print("Enter Quantity: ");
    			int amt4 = sc2.nextInt();
    			total += amt4*18990;//PHP 18,990
    			cart[itemCount] = amt4 + " iPad ";
    			itemCount++;
    			System.out.println("*** "+amt4 + " iPad has been added to the cart" + " ***");
    			break;
			
				default:b.choiceB(choiceB);break;
				}break;
				
			case "C": case "c":
				MacBook c = new MacBook();
				c.MacBookList();
				System.out.println("Enter Choice: ");
				int choiceC = sc2.nextInt();
				
				switch(choiceC) {
				case 1:c.choiceC(choiceC);
				System.out.print("Enter Quantity: ");
    			int amt1 = sc2.nextInt();
    			total += amt1*86990;//PHP 86,990
    			cart[itemCount] = amt1 + " MacBook Pro ";
    			itemCount++;
    			System.out.println("*** "+amt1 + " MacBook Pro has been added to the cart" + " ***");
    			break;
				
				case 2:c.choiceC(choiceC);
				System.out.print("Enter Quantity: ");
    			int amt2 = sc2.nextInt();
    			total += amt2* 71990;//PHP 71990
    			cart[itemCount] = amt2 + " MacBook Air ";
    			itemCount++;
    			System.out.println("*** "+amt2 + " MacBook Air has been added to the cart" + " ***");
    			break;
				
				case 3:c.choiceC(choiceC);
				System.out.print("Enter Quantity: ");
    			int amt3 = sc2.nextInt();
    			total += amt3* 52990;//PHP 52,990
    			cart[itemCount] = amt3 + " MacBook Mini ";
    			itemCount++;
    			System.out.println("*** "+amt3 + " MacBook Mini has been added to the cart" + " ***");
    			break;
				
				default:c.choiceC(choiceC);break;
				}break;
				
			case "D": case "d":
				Accesories d = new Accesories();
				d.AccesoriesList();
				System.out.println("Enter Choice: ");
				int choiceD = sc2.nextInt();
				
				switch(choiceD) {
				case 1:d.choiceD(choiceD);
				System.out.print("Enter Quantity: ");
    			int amt1 = sc2.nextInt();
    			total += amt1*20990; //PHP 20,990
    			cart[itemCount] = amt1 + " Apl Watch SE ";
    			itemCount++;
    			System.out.println("*** "+amt1 + " Apl Watch SE has been added to the cart" + " ***");
    			break;
    			
				case 2:d.choiceD(choiceD);
				System.out.print("Enter Quantity: ");
    			int amt2 = sc2.nextInt();
    			total += amt2*15990;//PHP 15,990
    			cart[itemCount] = amt2 + " Apl AirPods Pro";
    			itemCount++;
    			System.out.println("*** "+amt2 + " Apl AirPods Pro has been added to the cart" + " ***");
    			break;
				
				case 3:d.choiceD(choiceD);
				System.out.print("Enter Quantity: ");
    			int amt3 = sc2.nextInt();
    			total += amt3*8190;//PHP 8,190
    			cart[itemCount] = amt3 + " Apl Studio Buds ";
    			itemCount++;
    			System.out.println("*** "+amt3 + " Apl Studio Buds has been added to the cart" + " ***");
    			break;
				
				case 4:d.choiceD(choiceD);
				System.out.print("Enter Quantity: ");
    			int amt4 = sc2.nextInt();
    			total += amt4*5490;//PHP 5,490
    			cart[itemCount] = amt4 + " Magic Mouse ";
    			itemCount++;
    			System.out.println("*** "+amt4 + " Magic Mouse has been added to the cart" + " ***");
    			break;
				
				case 5:d.choiceD(choiceD);
				System.out.print("Enter Quantity: ");
    			int amt5 = sc2.nextInt();
    			total += amt5*7490;//PHP 7,490
    			cart[itemCount] = amt5 + " Magic Keyboard ";
    			itemCount++;
    			System.out.println("*** "+amt5 + " Magic Keyboard has been added to the cart" + " ***");
    			break;
				
				default:d.choiceD(choiceD);break;
				}break;
				
			case "X": case "x":
				showCart(itemCount,cart,total);
				break;
			case "V": case"v":
				balanceCart(itemCount,cart,total,exit);

			case "Z": case"z":
        		// Case Z is just about exiting the loop or the program
        		exit = true;
        		break;
			default: System.out.println("Wrong Input");
                }
			}	
		sc1.close();sc2.close();
	}
	
	public static void showCart(int itemCount, String[] cart, double total) {
		 System.out.println("\nYour Cart:");
         for (int i = 0; i < itemCount; i++) {
             System.out.println(cart[i]);
         }
         System.out.println("Total: Php" + total);
	}
	public static void balanceCart(int itemCount, String[] cart, double total, boolean exit) {
		Scanner input = new Scanner(System.in);
		 System.out.println("\nYour Cart:");
         for (int i = 0; i < itemCount; i++) {
             System.out.println(cart[i]);
         }
         System.out.println("Total: Php" + total);
         if(total <= 0) {
        	 System.out.println("0 BALANCE YOUR CART");
         }else {
        	    System.out.println("\nPayment Option");
                System.out.println("[A] Cash ");
                System.out.println("[B] Cash ni Ate");
                String payOpt = input.nextLine();
                
                switch(payOpt) {
                case "A": case "a":
                	System.out.println("Your Current Balance is: Php" + total);
                	System.out.println("Enter The Amount Paid: ");
                	int paid = input.nextInt();
                	if (paid >= total) {
                		System.out.println("Succesfully Paid!!!");
                		System.out.println("Your Change is: Php" + (paid - total));
                		exit = true;
                	}
                	else {
                		System.out.println("NOT ENOUGH MONEY");
                		exit = true;
                	}
                	break;
                case "B": case "b":
                	System.out.println("Your Current Balance is: Php" + total);
                	System.out.println("Enter The Amount Paid: ");
                	int paidA = input.nextInt();
                	
                	if (paidA >= total) {
                		System.out.println("Succesfully Paid!!!");
                		System.out.println("Your Change is: Php" + (paidA - total));
                		exit = true;
                	}
                	else {
                		System.out.println("NOT ENOUGH MONEY");
                		exit = true;
                	}
                	break;
                	default: System.out.println("WRONG INPUT SELECT A OR B");break;
       	}
         }
	
	}
}
