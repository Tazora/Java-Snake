
public class Player extends GameObject {
String name;
  
  
  public Player ( String name, double xPosition, double yPosition) {
	  super(xPosition, yPosition);
	  this.name = name;
  }
  
  public String getName() {
	return name;
  }
  public void setName(String name) {
	this.name = name;
  }
  
  public void move() {
  	//Konsoleneingabe und Spielerposition verändern
	
			switch (new java.util.Scanner( System.in ).next() ) {
			case "s" : this.setLocation(this.getX(), Math.min(10, this.getY() + 1)); break;
			case "w" : this.setLocation(this.getX(), Math.max(0, this.getY() - 1)); break;
			case "a" : this.setLocation(Math.max(0, this.getX() - 1), this.getY()); break;
			case "d" : this.setLocation(Math.min(10, this.getX() + 1), this.getY()); break;
			}
  }
}
