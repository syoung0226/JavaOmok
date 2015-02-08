package stone;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;


public class StoneInfo {
	private static final StoneInfo instance = new StoneInfo();
	
	public static StoneInfo getInstance() {
		return instance;
	}
	
	private List<Stone> stoneList = new ArrayList<Stone>(); 
	
	public List<Stone> getStoneList() {
		return stoneList;
	}
	
	public void setStoneList(List<Stone> stoneList) {
		this.stoneList = stoneList;
	}
	
	public void add(int x, int y, Color c) {
		Stone stone = new Stone(x, y, c);
		stoneList.add(stone);
	}
		
	public void clear() {
		stoneList.clear();
	}
	
	public int size(){
		return stoneList.size();
	}
	
	public Stone getIndex(int index){
		return stoneList.get(index);
	}
	
} 
