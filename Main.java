import java.util.Random;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		// universal player variables 
		int healthPotion = 40;
		
		// imported class i.e. "" to create the object "user"
		raidriar user = new raidriar();
		enemies enemy = new enemies();
		demons demon = new demons();
		sorcerer sorcerers = new sorcerer();
		
		System.out.println(" Welcome to the land of oz");
		System.out.println(" You are currently stationed in your homeland of Kenari");
		System.out.println(" You must survive these trials if you wish to face the sorcerer");
		System.out.println("------------------------------------------------------------------------");

		System.out.println("\n Which level would you like to travel to?");
		
		System.out.println("\n1. The battlefield - level 1");
		System.out.println("\n2. The mountains - level 2");
		System.out.println("\n3. The temple - level 3");


		
		String input = scan.nextLine();
		
		boolean running = true;
		
		if(input.equals("1")) {
			
			System.out.println("\t-----------------------------------");
			System.out.println("\t You have entered the battledfield ");
			System.out.println("\t-----------------------------------");
			
			LevelOne();
			
		} else if (input.equals("2")) {
			
			System.out.println("\t-----------------------------------");
			System.out.println("\t You have climbed the mountain ");
			System.out.println("\t-----------------------------------");
			
			LevelTwo();
			
		} else if (input.equals("3")) {
			
			System.out.println("\t-----------------------------------");
			System.out.println("\t You have entered the temple ");
			System.out.println("\t-----------------------------------");
			
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
		
		System.out.println("\t\nA " + enemy.save + " has appeared!");
		
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
			
			System.out.println("\t\nYou have dealt " + damageDealt + " damage to the " + enemy.save);
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
			
			
		}
			
		}
		
		if(user.health < 1) {
			System.out.println("you limp out the game");
			break;
		}
		
		System.out.println("---------------------------------------");
		System.out.println(" # " + enemy.save + " was defeated! # ");
		System.out.println(" # You have " + user.health + "HP left # ");
		if(rand.nextInt(100) < user.healthDropChance) {
			user.numHealthPotions++;
			System.out.println(" # The " + enemy.save + " dropped a stim container # ");
			System.out.println(" # YOu have " + user.numHealthPotions + " stim containers # ");
			
		}
		
		System.out.println("---------------------------------------");
		System.out.println(" WHat would you  like to do?");
		System.out.println("1. Continue fighting on the battlefield");
		System.out.println("2. Climb the mountain - level 2");
		System.out.println("3. Enter the temple - level 3");

		
		String in = scan.nextLine();
		
		while (!in.equals("1") && !in.equals("2") && !in.equals("3")) {
			System.out.println("invalid command");
			in = scan.nextLine();
		}

		if(in.equals("1")) { 
			
			System.out.println("# You continue on the fight! #");
			LevelOne();
			return;
		}
		else if (in.equals("2")) { 
			System.out.println("You have exitied the battlefield and climbed the mountain");
			LevelTwo();
			return;
		}
		else if (in.equals("3")) {
			System.out.println("You have entered the temple");
			LevelThree();
			return;
		}
		
		}
		
	}
	
	public static void LevelTwo() {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		demons demon = new demons();
	    raidriar user = new raidriar();
	    
	    //
		
		System.out.println("\t\nA demon has appeared!");
		
		boolean running = true;
		
		GAME2:
		while(running) {
				
		while(demon.demonHealth > 0) {
		System.out.println("\nWhat would you like to do?");
		System.out.println("1. Attack");
		System.out.println("2. Drink health potion");
		System.out.println("3. Run");
		
		String input = scan.nextLine();
		
		if(input.equals("1")) {
			
			int damageDealt = rand.nextInt(user.attackDamge);
			int damageTaken = rand.nextInt(demon.demonAttack); 
			
			user.health -= damageTaken;
			demon.demonHealth -= damageDealt;
			
			System.out.println("You have dealt " + damageDealt + " damage to the demon");
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
		
		if(user.health < 1) {
			System.out.println("you limp out the game");
			break;
		}
		
		System.out.println("---------------------------------------");
		System.out.println(" # The demon was defeated! # ");
		System.out.println(" # You have " + user.health + "HP left # ");
		if(rand.nextInt(100) < user.healthDropChance) {
			user.numHealthPotions++;
			System.out.println(" # The demon dropped a stim container # ");
			System.out.println(" # YOu have " + user.numHealthPotions + " stim containers # ");
			
		}
		
		System.out.println("---------------------------------------");
		System.out.println(" What would you like to do?");
		System.out.println("1. Continue fighting on the mountain");
		System.out.println("2. Enter the temple - level 3");
		System.out.println("3. Enter the battlefield - level 1");

		
		String in = scan.nextLine();
		
		while (!in.equals("1") && !in.equals("2") && !in.equals("3")) {
			System.out.println("invalid command");
			in = scan.nextLine();
		}

		if(in.equals("1")) { 
			
			System.out.println("\t\nYou continue fighting on the mountians");
			LevelTwo();
			return;
		}
		else if (in.equals("2")) { 
			System.out.println("You have exitied the mountain and enetered the temple");
			LevelThree();
			return;
		}
		else if (in.equals("3")) {
			System.out.println("You have entered the battlefield");
			LevelOne();
			return;
		}
		
		}
		
	}
	
	public static void LevelThree() {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		sorcerer sorcerers = new sorcerer();
	    raidriar user = new raidriar();
	    
	    //
		
		System.out.println("\t\nThe sorcerer has appeared!");
		
		boolean running = true;
		
		
		while(running) {
			
		if(user.health < 1) {
			System.out.println("you limp out the game");
			break;
			}
				
		while(sorcerers.sorcererHealth > 0) {
		System.out.println("\nWhat would you like to do?");
		System.out.println("1. Attack");
		System.out.println("2. Drink health potion");
		System.out.println("3. Run");
		
		String input = scan.nextLine();
		
		if(input.equals("1")) {
			
			int damageDealt = rand.nextInt(user.attackDamge);
			int damageTaken = rand.nextInt(sorcerers.sorcererHealth); 
			
			user.health -= damageTaken;
			sorcerers.sorcererHealth -= damageDealt;
			
			System.out.println("You have dealt " + damageDealt + " damage to the sorcerer");
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
			
		if(user.health < 1) {
				System.out.println("you limp out the game");
				break;
				}
			
		}
		
		
		
		System.out.println("---------------------------------------");
		System.out.println(" # The sorcerer was defeated # ");
		System.out.println(" # You have " + user.health + "HP left # ");
		
		System.out.println(" # You won! #");
		
		return;
		
		
		}
		
		
		}
	
	}
	

	










