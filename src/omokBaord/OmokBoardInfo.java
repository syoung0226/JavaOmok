package omokBaord;


public class OmokBoardInfo {
	private static final OmokBoardInfo instance = new OmokBoardInfo();
	
	private OmokBoardInfo(){	}

	public static OmokBoardInfo getInstance() {
		return instance;
	}
	

	private OmokBoard omokBoard = new OmokBoard();
		
	public OmokBoard getOmokBoard(){
		return omokBoard;
	}
	
	public void omokBoardRepaint(){
		omokBoard.repaint();
	}
}




