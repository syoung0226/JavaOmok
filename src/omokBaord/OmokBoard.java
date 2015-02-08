package omokBaord;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import omokText.OmokTextInfo;
import stone.StoneInfo;

@SuppressWarnings("serial")
public class OmokBoard extends Canvas {

	public static final int BLACKTURN = 0;
	public static final int WHITETURN = 1;
	
	public static final int CELL = 40;
	public static final int WIDTH = 600;
	public static final int HEIGHT = 600;

	public OmokBoard() {
		super();
		initialize();
	}

	private void initialize() {
		setSize((int) WIDTH, (int) HEIGHT);
		setBackground(Color.orange);
		addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
				int x = ((e.getX() + (CELL / 2)) / CELL);
				int y = ((e.getY() + (CELL / 2)) / CELL);

				System.out.println(Thread.currentThread().toString());
				if (OmokTextInfo.getInstance().getTurn() == BLACKTURN) {
					StoneInfo.getInstance().add(x, y, Color.black);
					OmokTextInfo.getInstance().setTurn(WHITETURN);
					OmokTextInfo.getInstance().addBlackStone(x, y);
				} else {
					StoneInfo.getInstance().add(x, y, Color.white);
					OmokTextInfo.getInstance().setTurn(BLACKTURN);
					OmokTextInfo.getInstance().addWhiteStone(x, y);
				}
				repaint();
			}

			@Override public void mousePressed(MouseEvent e) {}
			@Override public void mouseExited(MouseEvent e) {}
			@Override public void mouseEntered(MouseEvent e) {}
			@Override public void mouseClicked(MouseEvent e) {}
		});
	}

	public void paint(Graphics g) {
		int i;
		for (i = 0; i < WIDTH / CELL; i++) {
			g.drawLine((int) (i * CELL), (int) 0, (int) (i * CELL),	(int) (HEIGHT));
			g.drawLine((int) 0, (int) (i * CELL), (int) (WIDTH), (int) (i * CELL));
		}
		for (i = 0; i < StoneInfo.getInstance().size(); i++) {
			g.setColor(StoneInfo.getInstance().getIndex(i).getColor());
			g.fillOval((int) ((StoneInfo.getInstance().getIndex(i).getX() - 0.5) * CELL), (int) ((StoneInfo.getInstance().getIndex(i).getY() - 0.5) * CELL), (int) CELL, (int) CELL);
		}
	}
}
