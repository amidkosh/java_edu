package homework;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		int mapSize = 10;

		int initDogHealth = 100;

		Dog dog = new Dog(initDogHealth, 0, 0);

		Map map = new Map(10, 20, -20, dog);
		
		boolean dead = false;
		boolean finish = false;
		boolean terminate = false;
		while (!(dead || finish || terminate)) {
			map.drowMap();
			System.out.println("Enter a command:");
			Scanner sc = new Scanner(System.in);
			char c = sc.next().charAt(0);
			switch (c) {
			case 'w':
				map.moveDog(0, -1, -10);
				break;
			case 's':
				map.moveDog(0, 1, -10);
				break;
			case 'a':
				map.moveDog(-1, 0, -10);
				break;
			case 'd':
				map.moveDog(1, 0, -10);
				break;
			case 'x':
				System.out.print("Exit");
				terminate = true;
				break;
			default:
				System.out.println("Undefined command");
				break;
			}
			dead = dog.getHealth() <= 0;
			finish = (dog.getPosX() == mapSize - 1 && dog.dogPosY == mapSize - 1);

		}
		if (finish) {
			System.out.println("Congratulations! You won!");
		}
		if (dead) {
			System.out.println("Unfortunatly you losed! Try again!");
		}
	}
}