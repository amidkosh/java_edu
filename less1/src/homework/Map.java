package homework;

public class Map {
	
	private static final char FREE_CELL_CHAR = '_';
	private static final char DOG_CHAR = '@';
	private static final char BOMB_CHAR = '*';
	private static final char FAK_CHAR = '+';
	
	int mapSize;
	private char[][] map;
	private Dog dog;

	public Map(int mapSize, int fak, int bomb, Dog dog) {
		this.mapSize = mapSize;
		map = new char[mapSize][mapSize];

		for (int i = 0; i < mapSize; i++) {
			for (int j = 0; j < mapSize; j++) {
				map[i][j] = FREE_CELL_CHAR;
			}
			int kitPos = (int) (Math.random() * mapSize);
			int bombPos = (int) (Math.random() * mapSize);

			while (bombPos == kitPos) {
				bombPos = (int) (Math.random() * mapSize);
			}
			map[i][kitPos] = BOMB_CHAR;
			map[i][bombPos] = FAK_CHAR;
		}
		this.dog = dog;
		this.setDog(dog.getPosX(), dog.getPosY(), 0);
	}

	public Map drowMap() {
		System.out.println("Dog's health:" + dog.getHealth());
		System.out.print("\n");
		for (int j = 0; j < mapSize; j++) {
			System.out.print("| ");
			for (int i = 0; i < mapSize; i++) {
				System.out.print(map[j][i] + " ");
			}
			System.out.print(" |\n");
		}
		System.out.print("\n");
		return this;
	}

	public Map moveDog(int x_delta, int y_delta, int h_delta) {
		int x = this.dog.getPosX() + x_delta;
		int y = this.dog.getPosY() + y_delta;
		if (x < 0 || x > mapSize - 1 || y < 0 || y > mapSize - 1) {
			return this;
		}
		cleanCellAfterDog();
		this.setDog(x, y, -10);
		return this;

	}

	private Map setDog(int x, int y, int h_delta) {
		int c = this.dog.getHealth() + h_delta;
		if (map[y][x] == FAK_CHAR) {
			c += (int) (1 + Math.random() * 2) * 20;
		}
		if (map[y][x] == BOMB_CHAR) {
			c -= (int) (1 + Math.random() * 2) * 20;
		}
		
		this.dog.setPos(x,y).setHealth(c);
		map[y][x] = DOG_CHAR;
		return this;
	}

	private void cleanCellAfterDog() {
		map[this.dog.getPosY()][this.dog.getPosX()] = FREE_CELL_CHAR;
	}

}
