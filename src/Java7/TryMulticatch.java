package Java7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import klassen.Fahrzeug;

public class TryMulticatch {
	
	
	public static void main(String[] args) {
		
		Fahrzeug f = new Fahrzeug("BMW", 100, 10000);
		
		
		try {
			f.setLeistung(120);
		} catch (IOException | IndexOutOfBoundsException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
	}
}
