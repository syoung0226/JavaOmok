package menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

import omokBaord.OmokBoardInfo;
import utils.OmokFileUtils;

@SuppressWarnings("serial")
public class OmokMenuBar extends JMenuBar implements ActionListener {
	
	private JMenu fileMenu = new JMenu("File");
	private JMenuItem saveItem = new JMenuItem("Save");
	private JMenuItem loadItem = new JMenuItem("Load");
	private JMenuItem exitItem = new JMenuItem("Exit");

	public OmokMenuBar() {
		super();
		initialize();
	}

	private void initialize() {
		saveItem.addActionListener(this);
		loadItem.addActionListener(this);
		exitItem.addActionListener(this);

		add(fileMenu);
		fileMenu.add(saveItem);
		fileMenu.add(loadItem);
		fileMenu.add(new JSeparator());
		fileMenu.add(exitItem);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == exitItem) {
			System.exit(0);
		} else if (e.getSource() == saveItem) {
			try {
				OmokFileUtils.save();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.exit(0);
		} else if (e.getSource() == loadItem) {
			try {
				OmokFileUtils.load();
			} catch (IOException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			} catch (ClassNotFoundException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
			
			OmokBoardInfo.getInstance().omokBoardRepaint();
		}
	}

}
