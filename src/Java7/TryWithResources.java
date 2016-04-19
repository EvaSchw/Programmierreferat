package Java7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class TryWithResources
{

	public static void main(String[] args) throws IOException
	{
		FileWriter fw = null;
		try
		{
			fw = new FileWriter(new File("Hallo.txt"), true);
			fw.append("Hallo Leute");
		} catch (Exception e)
		{
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		} finally
		{
			fw.close();
		}

	}

}
