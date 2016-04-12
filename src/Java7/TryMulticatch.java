package Java7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import exception.HerstellerNullException;
import exceptions.PreisUnterNullException;
import klassen.Fahrzeug;

public class TryMulticatch {
	
	
	public static void main(String[] args) {
		
		try {
			Fahrzeug f = new Fahrzeug("BMW", 100, 10000);
		} catch (PreisUnterNullException | HerstellerNullException e) {
			JOptionPane.showConfirmDialog(null, e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
