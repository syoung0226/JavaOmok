package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import stone.Stone;
import stone.StoneInfo;

public class OmokFileUtils {
	public static void save() throws IOException {
		ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(new File("StoneList.txt")));
		outputStream.writeObject(StoneInfo.getInstance().getStoneList());
		outputStream.close();
	}
	
	@SuppressWarnings("unchecked")
	public static void load() throws IOException, ClassNotFoundException {
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(new File("StoneList.txt")));
		StoneInfo.getInstance().setStoneList((List<Stone>) inputStream.readObject());
		inputStream.close();
	}
}
