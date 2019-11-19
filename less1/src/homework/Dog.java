package homework;

public class Dog {
	int dogPosX = 0;
	int dogPosY = 0;
	int dogHealth;

	public Dog(int health, int x, int y) {
		dogHealth = health;
		dogPosX = x;
		dogPosY = y;
	}

	public int getPosX() {
		return dogPosX;
	}
	public Dog setPos(int dogPosX, int dogPosY) {
		this.setPosX(dogPosX).setPosY(dogPosY);
		return this;
	}

	private Dog setPosX(int dogPosX) {
		this.dogPosX = dogPosX;

		return this;
	}

	private Dog setPosY(int dogPosY) {
		this.dogPosY = dogPosY;
		
		return this;
	}

	public int getPosY() {
		return dogPosY;
	}

	public int getHealth() {
		return dogHealth;
	}

	public Dog setHealth(int dogHealth) {
		this.dogHealth = dogHealth;
		
		return this;
	}

}
