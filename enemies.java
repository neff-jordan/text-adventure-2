import java.util.Random;

public class enemies {

	Random rand = new Random();
	
	String[] enemies = {"Soldier", "mummy", "zombie"};
	int maxEnemyHealth = 70;
	int maxEnemyAttack = 25;
	
	public void enemyStats(String[] enemies) {
	int enemyHealth = rand.nextInt(maxEnemyHealth);
	String enemy = enemies[rand.nextInt(enemies.length)];
	}
	
}
