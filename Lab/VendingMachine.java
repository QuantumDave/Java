import java.util.Scanner;
public class VendingMachine{
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);
		int amount;
		while(true){
			amount = keyboard.nextInt();
			if (0 > amount || amount <= 99){break;}
		}
			
		int quarters,dimes,nickels,pennies;
		quarters = amount / 25;
		amount = amount % 25;
		dimes = amount / 10;
		amount = amount % 10;
		nickels = amount / 5;
		amount = amount % 5;
		pennies = amount;

		System.out.println(quarters + " quarters, " + "\n" + dimes + " Dimes, " + nickels + " nickels, " + pennies + " pennies.");
	}	
}