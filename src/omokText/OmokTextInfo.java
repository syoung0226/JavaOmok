package omokText;

import omokBaord.OmokBoard;

public class OmokTextInfo {

	private static final OmokTextInfo instance = new OmokTextInfo();
	
	public static OmokTextInfo getInstance() {
		return instance;
	}
	
	private OmokText infoPanel = new OmokText();		
	
	public int getTurn() {
		return infoPanel.getTurn();
	}
	
	public void setTurn(int turn) {
		infoPanel.setTurn(turn);	
	}
	
	public void addBlackStone(int x, int y){
		infoPanel.setBlackNum(infoPanel.getBlackNum()+1);
	}
	
	public void addWhiteStone(int x, int y){
		infoPanel.setWhiteNum(infoPanel.getWhiteNum()+1);
	}
	
	public void setLoadInfo(int whiteNum, int turnInfo){
		infoPanel.setWhiteNum(whiteNum);
		if(turnInfo == OmokBoard.BLACKTURN){
			infoPanel.setBlackNum(whiteNum);
		}else if(turnInfo == OmokBoard.WHITETURN){
			infoPanel.setBlackNum(whiteNum+1);
		}
	}
}
