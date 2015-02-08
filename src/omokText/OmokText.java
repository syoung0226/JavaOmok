package omokText;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class OmokText extends JPanel {
	private int turn = 0;
	private int blackNum = 0;
	private int whiteNum = 0;

	public int getTurn() {
		return turn;
	}

	public void setTurn(int turn) {
		this.turn = turn;
	}

	public int getBlackNum() {
		return blackNum;
	}

	public void setBlackNum(int blackNum) {
		this.blackNum = blackNum;
	}

	public int getWhiteNum() {
		return whiteNum;
	}

	public void setWhiteNum(int whiteNum) {
		this.whiteNum = whiteNum;
	}	
}
