
public class ZZZZZnake {

	public static void main(String[] args) {
		Player player = new Player("Tom", Math.floor(Math.random()*10), Math.floor(Math.random()*10));
		Snake snake = new Snake(Math.floor(Math.random()*10), Math.floor(Math.random()*10));
		GameObject door = new GameObject(Math.floor(Math.random()*10), Math.floor(Math.random()*10));
		GameObject gold = new GameObject(Math.floor(Math.random()*10), Math.floor(Math.random()*10));

		
		boolean rich = false;
		
		while (true) {
			snake.player = player;
			
			// Raster mit Figuren zeichnen
			
			for (int y = 0; y < 10; y++) {
				for (int x = 0; x < 10; x++) {
					if (player.getX() == x && player.getY() == y) {
							System.out.print("P");}
					else if (snake.getX() == x && snake.getY() == y) {
						System.out.print("S");
					}
					else if (door.getX() == x && door.getY() == y) {
						System.out.print("D");
					}
					else if (gold.getX() == x && gold.getY() == y) {
						System.out.print("G");
					}
					else System.out.print("#");
				}
				System.out.println();
			}
			
			
			// Status feststellen
			
			if (rich && player.equals( door )) {
				System.out.println("Gewonnen!");
				break;
			}
			
			if (player.equals( snake )) {
				System.out.println("ZZZZZZZZ. Die Schlange hat dich!");
				break;
			}
			
			if (gold.equals(player)) {
				rich = true;
				gold.setLocation(-1, -1);
			}
			
			player.move();
			
			// Schlange bewegt sich in Richtung Spieler
			snake.move();
			
			
		}// end while
	}
}
