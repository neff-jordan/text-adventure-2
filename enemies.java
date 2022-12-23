import java.util.Random;

public class enemies {

	Random rand = new Random();
	
	String[] enemies = {"Soldier", "mummy", "zombie"};
	int maxEnemyHealth = 70;
	int maxEnemyAttack = 25;
	
	int enemyHealth = rand.nextInt(maxEnemyHealth);
	String save = enemies[rand.nextInt(enemies.length)];
	
}
