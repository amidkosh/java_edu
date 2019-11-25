package less1.src;

import java.io.IOException;
import java.util.Arrays;

public class Dog {
	
	public static void main(String[] args) {
		int dogHealth = 100;
		int demage = 20;
		int fak = 20;
		int stepCost = 20;
		int mapSize = 10;

		boolean finish;

		System.out.println("Health: "+dogHealth);
		System.out.println("Cost: damage : "+demage+", fak: "+fak);
		char[][] map = generateMap(mapSize);
		
//		do {
//			
//		} while(dogHealth > 0 || finish);
		
		drowMap(mapSize, map);
		
		int inChar;
        System.out.println("Enter a Character:");
        try {
            inChar = System.in.read();
            System.out.print("You entered ");
            System.out.println(inChar);
        }
        catch (IOException e){
            System.out.println("Error reading from user");
        }
	}

	private static void drowMap(int mapSize, char[][] map) {
		for (int j =0;j<mapSize;j++) {
			System.out.println(Arrays.toString(map[j]));
		}
	}

	private static char[][] generateMap(int mapSize) {
		char itemUsed = '_';
		char itemFAK = '+';
		char itemBomb = 'o';
		char[][] map = new char[mapSize][mapSize];

		for (int i =0;i<mapSize;i++ ) {
			for (int j =0;j<mapSize;j++ ) {
//				System.out.println();
				map[i][j] = (int)(Math.random()*2)==0 ? itemFAK : itemBomb;
			}
		}
		map[0][0] = '@';
		return map;
	}

}
