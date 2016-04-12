package Java7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class TryWithResources {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = null;
		try
		{
			fw = new FileWriter(new File("Test.txt"), true);
			fw.append("Hallo Leute");
		} catch (Exception e1)
		{
			e1.printStackTrace();
			JOptionPane.showMessageDialog(null, e1.getMessage());
		}
		finally {
			fw.close();
		}
		
		try (FileWriter fw1 = new FileWriter("hello.txt", true)){
			fw1.append("ente");
		} catch (Exception e){
			e.printStackTrace();		
		}
		
	}

}
