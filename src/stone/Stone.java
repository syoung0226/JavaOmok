package stone;
import java.awt.Color;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Stone implements Serializable {
	
	private int x;
	private int y;
	private Color color;
	
	Stone(int x, int y, Color color){
		this.x = x;
		this.y = y;
		this.color = color;
	}
		
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public Color getColor() {
		return color;
	}
}
