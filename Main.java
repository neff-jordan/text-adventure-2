import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		// universal player variables 
		int healthPotion = 40;
		
		// imported class i.e. "raidriar" to create the object "user"
		raidriar user = new raidriar();
		enemies enemy = new enemies();
		demons demon = new demons();
		sorcerer sorcerers = new sorcerer();
		
		System.out.println(" Welcome to the land of the dead");
		System.out.println(" Here demons do walk beneath the streets and death awaits at every door");
		System.out.println(" You must survive these challenges if you wish to face the sorcerer");
		System.out.println("----------------------------------------------------------------------------");

		System.out.println("\n Which level would you like to go to?");
		
		System.out.println("\n1. The battlefield - level 1");
		System.out.println("\n2. The mountains - level 2");
		System.out.println("\n3. The temple - level 3");


		
		String input = scan.nextLine();
		
		if(input.equals("1")) {
			LevelOne();
		} else if (input.equals("2")) {
			LevelTwo();
		} else if (input.equals("3")) {
			LevelThree();
		} 
		
		else {
			System.out.println("invalid command, please choose again");
		}
		
		System.out.println("###########");
		System.out.println("Game Over");
		System.out.println("###########");

	}

	public static void LevelOne() {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		enemies enemy = new enemies();
		raidriar user = new raidriar();
		
		System.out.println("\t-----------------------------------");
		System.out.println("\t You have entered the battledfield ");
		System.out.println("\t-----------------------------------");
		
		System.out.println("\t\nA " + enemy + " has appeared!");
		
		boolean running = true;
		
		while(running) {
				
		while(enemy.maxEnemyHealth > 0) {
		System.out.println("\nWhat would you like to do?");
		System.out.println("1. Attack");
		System.out.println("2. Drink health potion");
		System.out.println("3. Run");
		
		String input = scan.nextLine();
		
		if(input.equals("1")) {
			
			int damageDealt = rand.nextInt(user.attackDamge);
			int damageTaken = rand.nextInt(enemy.maxEnemyAttack); 
			
			user.health -= damageTaken;
			enemy.maxEnemyHealth -= damageDealt;
			
			System.out.println("You have dealt " + damageDealt + " damage to the " + enemy);
			System.out.println("You receive " + damageTaken + " in exchange");

		}
			
			if(user.health < 1) {
				System.out.println("\nYou have taken too much damage");
				break;
			} 
			
		else if(input.equals("2")) {
			
			if(user.numHealthPotions > 0) {
				
				user.health += user.healthPotion;
				user.numHealthPotions --; 
				
				}
		
			System.out.println("Your new health is " + user.health + "HP");
			
			if(user.numHealthPotions < 1) { 
				System.out.println("You are out of health potions. Kill more enemies on the battlefield to get more."); 
			}
			
			}
		
		else if(input.equals("3")) {
			
			System.out.println("You live to fight another day");
			break;
			
		}
			
		}

		}
		
		System.out.println("You have defeated the " + enemy + ".");
		System.out.println("You have " + user.health + "HP left.");
		
	}
	
	public static void LevelTwo() {
		
		demons demon = new demons();
		
	}
	
	public static void LevelThree() {
		
		sorcerer sorcerers = new sorcerer();
		
	}
	
}









