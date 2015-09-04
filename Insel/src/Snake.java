
public class Snake extends GameObject {
	Player player;
	
	public Snake (double xPosition, double yPosition) {
		super(xPosition, yPosition);
	}
	
	public void move() {
		if (player.getX() < this.getX())
			this.setLocation(this.getX() - 1, this.getY());
		else if (player.getX() > this.getX())
			this.setLocation(this.getX() + 1, this.getY());
		if (player.getY() < this.getY())
			this.setLocation(this.getX(), this.getY() - 1);
		else if (player.getY() > this.getY())
			this.setLocation(this.getX(), this.getY() + 1);
	}

}
