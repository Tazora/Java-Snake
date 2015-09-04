
public class ZZZZZnake {
	
    static int width = 20;
    static int height = 10;

    
	public static void main(String[] args) {
		Player player = new Player("Tom", Math.floor(Math.random()*width), Math.floor(Math.random()*height));
		Snake snake = new Snake(Math.floor(Math.random()*width), Math.floor(Math.random()*height));
		GameObject door = new GameObject(Math.floor(Math.random()*width), Math.floor(Math.random()*height));
		GameObject gold = new GameObject(Math.floor(Math.random()*width), Math.floor(Math.random()*height));

		
		boolean rich = false;
		
		while (true) {
			snake.player = player;
			
			// Raster mit Figuren zeichnen
			
			for (int y = 0; y < height; y++) {
				for (int x = 0; x < width; x++) {
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
